
package Controller;

import DataAcessObject.AutorDAO;
import DataAcessObject.EditoraDAO;
import DataAcessObject.ExemplarLivroDAO;
import DataAcessObject.ExemplarRevistaDAO;
import DataAcessObject.LivroDAO;
import DataAcessObject.RevistaDAO;
import Exceptions.ExistsException;
import Exceptions.ImpossibleNumberException;
import Exceptions.InvalidSizeException;
import ValueObject.AutorVO;
import ValueObject.EditoraVO;
import ValueObject.EmprestimoGenericoVO;
import ValueObject.ExemplarLivroVO;
import ValueObject.ExemplarRevistaVO;
import ValueObject.LivroVO;
import ValueObject.RevistaVO;
import View.ItemView;
import View.PrincipalView;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;


public class LivroControl {
    

    public void cadastrarLivro(String localEdicao, String codigoISBN, ArrayList<String> palavrasChave, String nomeEditora, ArrayList<AutorVO> autores, String titulo, int numExemplar, ItemView view)
    {
        LivroDAO dao = new LivroDAO();
        try 
        {
            validarISBN(codigoISBN);
            validarTitulo(titulo);
            EditoraVO editora = new EditoraVO(nomeEditora);
            LivroVO livroVO = new LivroVO(localEdicao, codigoISBN, palavrasChave, editora, autores, titulo);
            dao.inserirLivro(livroVO);
            ExemplarLivroDAO exemplarDAO = new ExemplarLivroDAO();
            
            for(int i=0; i<numExemplar; i++)
            {
                ExemplarLivroVO exemplar = new ExemplarLivroVO((i+1), livroVO.getTitulo());
                exemplarDAO.inserirExemplarLivro(exemplar);
            }
            
            view.informarMensagem("Livro "+ livroVO.getTitulo() +" cadastrado com Sucesso!", "Cadastrar Livro");
        }
        catch (ImpossibleNumberException | InvalidSizeException | ClassNotFoundException | SQLException ex) 
        {
            Logger.getLogger(LivroControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            dao.getConexao().desconectar();
        }
        
        
        
        
    }
    private void validarTitulo(String titulo) throws  ImpossibleNumberException{

        //Verifica se 'nome' possui valores numéricos 
        for(int i=0; i<titulo.length();i++)
        {
            if(Character.isDigit(titulo.charAt(i)))
                throw new ImpossibleNumberException("titulo");
        }
    }
    
    private void validarISBN(String codigoISBN) throws  InvalidSizeException{
         if(codigoISBN.length() != 13)
            throw new InvalidSizeException("codigoISBN");
    }
    
    public ArrayList<LivroVO> buscarLivros()
    {
        LivroDAO dao = new LivroDAO();
        ArrayList<LivroVO> livros = new ArrayList();
        try 
        {
            livros = dao.buscarLivros();
        }
        catch (ClassNotFoundException | SQLException ex) 
        {
            Logger.getLogger(LivroControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return livros;
    }
    
    public void emprestarExemplarLivro(ExemplarLivroVO livro) throws ClassNotFoundException, SQLException {
    
        ExemplarLivroDAO exemplarLivro = new ExemplarLivroDAO();
        
        exemplarLivro.emprestarExemplarLivro(livro);
        
    }
    
    public void devolverExemplarLivro(ExemplarLivroVO livro) throws ClassNotFoundException, SQLException {
    
        ExemplarLivroDAO exemplarLivro = new ExemplarLivroDAO();
        
        exemplarLivro.devolverExemplarLivro(livro);
        
    }

    public void inicializar(ItemView view) 
    {
        EditoraDAO editoraDAO = new EditoraDAO();
        AutorDAO autorDAO = new AutorDAO();
        ArrayList<EditoraVO> editoras = new ArrayList();
        ArrayList<AutorVO> autores = new ArrayList();
        try 
        {
            editoras = editoraDAO.buscarEditoras();
            autores = autorDAO.buscarAutores();
            
            DefaultComboBoxModel modelEditora = new DefaultComboBoxModel(), modelAutor = new DefaultComboBoxModel();
            for(EditoraVO editora:editoras)
            {
                modelEditora.addElement(editora.getNome());
            }
            view.getCbEditora().setModel(modelEditora);
            for(AutorVO autor:autores)
            {
                modelAutor.addElement(autor.getNome());
            }
            view.getCbAutor().setModel(modelAutor);
        }
        catch (ClassNotFoundException | SQLException ex)
        {
            view.informarErro(ex.getMessage());
        }
        finally
        {
            editoraDAO.getConexao().desconectar();
            autorDAO.getConexao().desconectar();
        }
    }

    public void adicionarPalavraChave(ItemView view) 
    {
        try 
        {
            String pChave = view.getTxPalavraChave().getText();
            DefaultListModel model = (DefaultListModel) view.getLtPalavraChave().getModel();
            
            boolean encontrado = false;
            for(int i=0; i<model.size(); i++)
            {
                if(model.getElementAt(i) == null)
                    continue;
                String chave = model.getElementAt(i).toString();
                if(chave.equals(pChave))
                {
                    encontrado = true;
                    break;
                }
            }
            if(encontrado)
                throw new ExistsException("Palavra chave "+ pChave +" já está cadastrada.");
            
            model.addElement(pChave);
        
            if(model.size() == 3)
            {
                view.getBtAdicionarPalavraChave().setEnabled(false);
            }
        } 
        catch (ExistsException ex) 
        {
            view.informarErro(ex.getMessage());
        }
    }

    public void removerPalavraChave(ItemView view)
    {
        int index = view.getLtPalavraChave().getSelectedIndex();
        DefaultListModel model = (DefaultListModel) view.getLtPalavraChave().getModel();
        model.removeElementAt(index);
        
        view.getBtRemoverPalavraChave().setEnabled(false);
        view.getBtAdicionarPalavraChave().setEnabled(true);
    }

    public void limparPalavraChave(ItemView view)
    {
        view.getTxPalavraChave().setText("");
    }

    public void habilitarRemoverPalavraChave(ItemView view) 
    {
        view.getBtRemoverPalavraChave().setEnabled(view.getLtPalavraChave().getSelectedIndex() != -1);
    }

    public void verificarPalavraChaveVazio(ItemView view) 
    {
        view.getBtAdicionarPalavraChave().setEnabled(!(view.getTxPalavraChave().getText().isEmpty()));
    }

    public void adicionarAutor(ItemView view) 
    {
        DefaultComboBoxModel comboModel = (DefaultComboBoxModel) view.getCbAutor().getModel();
        DefaultListModel listModel = (DefaultListModel) view.getLtAutor().getModel();
        String autor = comboModel.getSelectedItem().toString();
        
        listModel.addElement(autor);
        comboModel.removeElement(autor);
        
        view.getBtAdicionarLivro().setEnabled(comboModel.getSize() != 0);
    }
    
    public void habilitarRemoverAutor(ItemView view) 
    {
        view.getBtRemoverLivro().setEnabled(view.getLtAutor().getSelectedIndex() != -1);
    }
    
    public void removerAutor(ItemView view)
    {
        DefaultComboBoxModel comboModel = (DefaultComboBoxModel) view.getCbAutor().getModel();
        DefaultListModel listModel = (DefaultListModel) view.getLtAutor().getModel();
        String autor = view.getLtAutor().getSelectedValue();
        
        comboModel.addElement(autor);
        listModel.removeElement(autor);
        
        view.getBtRemoverLivro().setEnabled(false);
        view.getBtAdicionarLivro().setEnabled(comboModel.getSize() != 0);
    }

    void removerLivro(PrincipalView view, String titulo) 
    {
        LivroDAO dao = new LivroDAO();
        try 
        {
            LivroVO livro = new LivroVO(titulo);
            dao.buscarLivro(livro);
            dao.deletarLivro(livro);
            
            view.informarDeletado("Livro", titulo);
            
        }
        catch (ClassNotFoundException | SQLException ex)
        {
            view.informarErro(ex.getMessage());
        }
        
        
    }

    public void preencherCampos(ItemView view, LivroVO livro) 
    {
        view.getTxTitulo().setText(livro.getTitulo());
        view.getTxIsbn().setText(livro.getCodigoISBN());
        view.getTxLocalEdicao().setText(livro.getLocalEdicao());
        
        DefaultListModel pChaveModel = (DefaultListModel) view.getLtPalavraChave().getModel();
        
        for(String pChave:livro.getPalavrasChave())
        {
            if(pChave != null)
                pChaveModel.addElement(pChave);
        }
        DefaultComboBoxModel autorCombo = (DefaultComboBoxModel) view.getCbAutor().getModel();
        DefaultListModel autorLivro = (DefaultListModel) view.getLtAutor().getModel();
        for(AutorVO autor:livro.getAutores())
        {
            for(int i=0; i<autorCombo.getSize(); i++)
            {
                if(autor.getNome().equals(autorCombo.getElementAt(i)))
                {
                    autorCombo.removeElementAt(i);
                    break;
                }
            }
            autorLivro.addElement(autor.getNome());
        }
        
        DefaultComboBoxModel editoraCombo = (DefaultComboBoxModel) view.getCbEditora().getModel();
        for(int i=0; i<editoraCombo.getSize(); i++)
        {
            if(editoraCombo.getElementAt(i).equals(livro.getEditora().getNome()))
            {
                editoraCombo.setSelectedItem(editoraCombo.getElementAt(i));
                break;
            }
        }
        
        LivroDAO dao = new LivroDAO();
        
        try 
        {
            int quantExemplar = dao.buscarQuantExemplaresDisponiveis(livro);
            view.getSnExemplar().setValue(quantExemplar);
            view.getLbExemplaresLivro().setText("Exemplares Disponiveis:");
        }
        catch (SQLException | ClassNotFoundException ex) 
        {
            view.informarErro(ex.getMessage());
        }
        
    }

    void atualizarLivro(LivroVO livroOld, String localEdicao, String codigoISBN, ArrayList<String> palavrasChave, String nomeEditora, ArrayList<AutorVO> autores, String titulo, int numExemplar, ItemView view) 
    {
        if(view.verificarAtualizacao("Livro") == 1)
            return;
        
        LivroDAO dao = new LivroDAO();
        try 
        {
            validarISBN(codigoISBN);
            validarTitulo(titulo);
            EditoraVO editora = new EditoraVO(nomeEditora);
            LivroVO livroVO = new LivroVO(localEdicao, codigoISBN, palavrasChave, editora, autores, titulo);
            dao.atualizarLivro(livroOld, livroVO);
            ExemplarLivroDAO exemplarDAO = new ExemplarLivroDAO();
            
            atualizarExemplares(numExemplar, livroOld, livroVO);
            
            view.informarMensagem("Livro "+ livroVO.getTitulo() +" atualizado com Sucesso!", "Atualizar Livro");
        }
        catch (ImpossibleNumberException | InvalidSizeException | ClassNotFoundException | SQLException ex) 
        {
            Logger.getLogger(LivroControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            dao.getConexao().desconectar();
        }
    }
    
    private void atualizarExemplares(int numExemplar, LivroVO livroOld, LivroVO livro) throws SQLException, ClassNotFoundException 
    {
        LivroDAO dao = new LivroDAO();
        int numExemplarOld = dao.buscarQuantExemplaresDisponiveis(livroOld);
        ExemplarLivroDAO exemplarDAO = new ExemplarLivroDAO();
        ArrayList<ExemplarLivroVO> exemplares = exemplarDAO.buscarExemplaresLivro(livroOld);
        if(numExemplarOld > numExemplar)                //Se for removido exemplares
        {
            int numEx = 1;
            int diferenca = numExemplarOld - numExemplar;
            dao.removerExemplaresDisponiveis(livroOld);
            
            while(numExemplar != 0)
            {
                int res = exemplarDAO.buscarNumExemplar(numEx);
                if(res==0)
                {
                    exemplarDAO.inserirExemplarLivro(new ExemplarLivroVO(numEx, true, livro.getTitulo()));
                    numExemplar--;
                }
                numEx++;
                
            }
            
        }
        else if(numExemplarOld < numExemplar)           //Se for adicionado exemplares
        {
            int diferenca = numExemplar - numExemplarOld;
            int numEx = 1;
            
            while(diferenca != 0)
            {
                int res = exemplarDAO.buscarNumExemplar(numEx);
                if(res==0)
                {
                    exemplarDAO.inserirExemplarLivro(new ExemplarLivroVO(numEx, true, livro.getTitulo()));
                    diferenca--;
                }
                numEx++;
                
            }
        }
                
    }
    
    public int[] buscarExemplares(String titulo) throws ClassNotFoundException, SQLException {
    
        LivroDAO livroDao = new LivroDAO();
        ArrayList<EmprestimoGenericoVO> emprestimosTmp = livroDao.buscarExemplares(titulo);
        
        int [] exemplares = new int[emprestimosTmp.size()];
        
        for(int i=0; i<emprestimosTmp.size(); i++) {
            
            exemplares[i] = emprestimosTmp.get(i).getExemplar();
        
        }
        
        return exemplares;
        
    }
    
}
