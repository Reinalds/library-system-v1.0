package Controller;

import Exceptions.ImpossibleNumberException;
import ValueObject.EditoraVO;
import View.PrincipalView;
import DataAcessObject.EditoraDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

public class EditoraControl 
{
    private static ArrayList<EditoraVO> editoras;

    public static void inicializar() 
    {
        editoras = new ArrayList();
    }
    public void cadastrarEditora(PrincipalView view) 
    {
        EditoraVO editoraVO = new EditoraVO(view.getTxNomeEditora().getText());
        EditoraDAO dao = new EditoraDAO();
        try 
        {
            validarNome(view.getTxNomeEditora().getText());
            dao.inserirEditora(editoraVO);
            atualizarListaEditora(view);
            view.informarCadastrado("Editora", editoraVO.getNome());
            view.getBtCadastrarEditora().setEnabled(false);
        }
        catch (ImpossibleNumberException ex)
        {
            Logger.getLogger(EditoraControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (ClassNotFoundException ex) 
        {
            Logger.getLogger(EditoraControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex)
        {
            Logger.getLogger(EditoraControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            dao.getConexao().desconectar();
        }
    }
    
    private void validarNome(String nome) throws  ImpossibleNumberException
    {
        //Verifica se 'nome' possui valores numéricos 
        for(int i=0; i<nome.length();i++)
        {
            if(Character.isDigit(nome.charAt(i)))
                throw new ImpossibleNumberException("nome");
        }
    }

    public void verificarNomeVazio(PrincipalView view) 
    {
        view.getBtCadastrarEditora().setEnabled(!(view.getTxNomeEditora().getText().isEmpty()));
    }

    public void atualizarListaEditora(PrincipalView view)
    {
        DefaultListModel modelEditora = new DefaultListModel();
        EditoraDAO dao = new EditoraDAO();
        try 
        {
            editoras = new ArrayList(dao.buscarEditoras());
            for(EditoraVO editora:editoras)
            {
                modelEditora.addElement(editora.getNome());
            }
            
            view.getLtEditoraEditora().setModel(modelEditora);
        } 
        catch (ClassNotFoundException | SQLException ex) 
        {
            view.informarErro(ex.getMessage());
        }
        finally
        {
            dao.getConexao().desconectar();
        }
    }

    public void limparTextoEditora(PrincipalView view)
    {
        view.getTxBuscarEditora().setText("");
    }

    public void gerarTextoAutor(PrincipalView view) {
        if(view.getTxBuscarEditora().getText().isEmpty())
            view.getTxBuscarEditora().setText("Buscar Editora...");
    }
    
    public void mostrarEditora(String buscaEditora, PrincipalView view) 
    {
        DefaultListModel model = new DefaultListModel();
        if(buscaEditora.equals("Buscar Editora..."))
        {
            for(EditoraVO editora:editoras)
            {
                model.addElement(editora.getNome());
            }
        }
        else
        {
            for(EditoraVO editora:editoras)
            {
                String leitura = buscaEditora.toUpperCase();
                String nome = editora.getNome().toUpperCase();
                if(nome.contains(leitura))
                {
                    model.addElement(editora.getNome());
                }
            }
        }
        view.getLtEditoraEditora().setModel(model);
    }

    public void atualizarNomeEditora(PrincipalView view)
    {
        if(view.getLtEditoraEditora().getSelectedIndex() == -1)
            return;
        
        String nome = view.getLtEditoraEditora().getSelectedValue();
        view.getTxNomeEditora().setText(nome);
    }

    public void verificarAtualizar(PrincipalView view) 
    {
        view.getBtAtualizarEditora().setEnabled(!(view.getLtEditoraEditora().getSelectedIndex() == -1));
    }

    public void verificarDeletar(PrincipalView view) 
    {
        view.getBtDeletarEditora().setEnabled(!(view.getLtEditoraEditora().getSelectedIndex() == -1));
    }

    public void atualizarEditora(PrincipalView view) 
    {
        String nome = view.getLtEditoraEditora().getSelectedValue();
        int resposta = view.verificarAtualizacao("Editora");
        if(resposta == 1)
            return;
        
        EditoraVO editora = new EditoraVO(nome);
        EditoraVO editoraNew = new EditoraVO(view.getTxNomeEditora().getText());
        EditoraDAO dao = new EditoraDAO();
        try 
        {
            dao.atualizarEditora(editora, editoraNew);
            atualizarListaEditora(view);
            view.informarAtualizado("Editora", view.getTxNomeEditora().getText());
        }
        catch (ClassNotFoundException | SQLException ex)
        {
            view.informarErro(ex.getMessage());
        }
        finally
        {
            dao.getConexao().desconectar();
        }
    }

    public void deletarEditora(PrincipalView view) 
    {
        String nome = view.getLtEditoraEditora().getSelectedValue();
        int resposta = view.verificarRemocao("a editora", "Editora", nome);
        if(resposta == 1)
            return;
        EditoraVO editora = new EditoraVO(nome);
        EditoraDAO dao = new EditoraDAO();
        try 
        {
            dao.deletarEditora(editora);
            atualizarListaEditora(view);
            view.informarDeletado("Editora", nome);
        }
        catch (ClassNotFoundException | SQLException ex) 
        {
            view.informarErro(ex.getMessage());
        }
        finally
        {
            dao.getConexao().desconectar();
        }
    }

    public void limparNomeEditora(PrincipalView view) 
    {
        view.getTxNomeEditora().setText("");
    }
    
}
