
package Controller;

import DataAcessObject.AutorDAO;
import DataAcessObject.LivroDAO;
import Exceptions.ImpossibleNumberException;
import ValueObject.AutorVO;
import ValueObject.LivroVO;
import View.PrincipalView;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ListModel;

public class AutorControl 
{
    private static ArrayList<AutorVO> autores;
    private static ArrayList<LivroVO> livros;
    private static ArrayList<LivroVO> livrosBusca;

    public static void inicializar() 
    {
        autores = new ArrayList();
        livros = new ArrayList();
        livrosBusca = new ArrayList();
    }
    
    public void cadastrarAutor(String nome, String nomeAutor, PrincipalView view) 
    {
        try 
        {
            validarNome(nome);
        }
        catch (ImpossibleNumberException ex) 
        {
            Logger.getLogger(AutorControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        DefaultListModel modelSelec = (DefaultListModel)view.getLtLivrosSelecionados().getModel();
        ArrayList<LivroVO> livrosSelec = new ArrayList();
        for(int i=0; i<modelSelec.getSize(); i++)
        {
            livrosSelec.add(new LivroVO(modelSelec.getElementAt(i).toString()));
        }
        
        AutorVO autorVO = new AutorVO(nome);
        AutorDAO dao = new AutorDAO();
        LivroDAO livroDAO = new LivroDAO();
        try 
        {
            dao.inserirAutor(autorVO);
            livroDAO.inserirAutoresLivro(livrosSelec, autorVO);
            
        } 
        catch (ClassNotFoundException ex)
        {
            Logger.getLogger(AutorControl.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(AutorControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        autores.add(autorVO);
        
        mostrarAutores(nomeAutor, view);
        view.informarCadastrado("Autor", nome);
    }
    
    public void buscarAutores(String buscaAutor, PrincipalView view)
    {
        AutorDAO dao = new AutorDAO();
        try 
        {
            autores = dao.buscarAutores();
        }
        catch (ClassNotFoundException ex) 
        {
            Logger.getLogger(AutorControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(AutorControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        mostrarAutores(buscaAutor, view);
    }
    
    public void buscarLivros()
    {
        LivroControl livroController = new LivroControl();
        livrosBusca = new ArrayList();
        
        livros = livroController.buscarLivros();
        livrosBusca = new ArrayList(livros);
    }
    
    private void validarNome(String nome) throws ImpossibleNumberException{
        //Verifica se 'nome' possui valores numéricos 
        for(int i=0; i<nome.length();i++)
        {
            if(Character.isDigit(nome.charAt(i)))
                throw new ImpossibleNumberException("nome");
        }
    }
    
    public void limparTextoAutor(JTextField txBuscarAutor)
    {
        txBuscarAutor.setText("");
    }
    
    public void gerarTextoAutor(JTextField txBuscarAutor)
    {
        if(txBuscarAutor.getText().isEmpty())
            txBuscarAutor.setText("Buscar Autor...");
    }

    public void mostrarAutores(String buscaAutor, PrincipalView view) 
    {
        DefaultListModel model = new DefaultListModel();
        if(buscaAutor.equals("Buscar Autor...") || buscaAutor.isEmpty())
        {
            for(AutorVO autor:autores)
            {
                model.addElement(autor.getNome());
            }
        }
        else
        {
            for(AutorVO autor:autores)
            {
                String leitura = buscaAutor.toUpperCase();
                String nome = autor.getNome().toUpperCase();
                if(nome.contains(leitura))
                {
                    model.addElement(autor.getNome());
                }
            }
        }
        view.getLtAutores().setModel(model);
    }

    public void verificarNomeVazio(String autor, JButton btCadastrar)
    {
        btCadastrar.setEnabled(!autor.isEmpty());
    }

    public void mostrarPropriedadesAutor(JTextField txNome, PrincipalView view)
    {
        
        if(view.getLtAutores().getSelectedIndex() == -1)
            return;
        
        
        String nomeAutor = view.getLtAutores().getSelectedValue();
        txNome.setText(nomeAutor);
        
        AutorDAO dao = new AutorDAO();
        ArrayList<LivroVO> livros = new ArrayList();
        try
        {
            livros = dao.buscarAutoresLivro(new AutorVO(nomeAutor));
        }
        catch (ClassNotFoundException ex)
        {
            Logger.getLogger(AutorControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex)
        {
            Logger.getLogger(AutorControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        DefaultListModel selecionadoModel = new DefaultListModel(), buscaModel = new DefaultListModel();
        livrosBusca.clear();
        for(LivroVO livroBusca:this.livros)
        {
            boolean encontrado = false;
            for(LivroVO livroSelec:livros)
            {
                if(livroBusca.getTitulo().equals(livroSelec.getTitulo()))
                {
                    selecionadoModel.addElement(livroSelec.getTitulo());
                    encontrado = true;
                    break;
                }
            }
            if(!encontrado)
            {
                buscaModel.addElement(livroBusca.getTitulo());
                livrosBusca.add(livroBusca);
            }
        }
        
        
//        for(int i=0; i<buscaModel.size(); i++)
//        {
//            livrosBusca.add(new LivroVO(buscaModel.getElementAt(i).toString()));
//        }
            
        view.getLtBuscarLivro().setModel(buscaModel);
        view.getLtLivrosSelecionados().setModel(selecionadoModel);
        
    }

    public void limparTextoLivro(JTextField txNome) 
    {
        txNome.setText("");
    }

    public void limparTextoBuscaLivro(JTextField txBuscarLivro) 
    {
        txBuscarLivro.setText("");
    }

    public void gerarTextoBuscaLivro(JTextField txBuscarLivro) 
    {
        if(txBuscarLivro.getText().isEmpty())
            txBuscarLivro.setText("Buscar Livro...");
    }

    public void mostrarLivros(String buscaLivro, PrincipalView view) 
    {
        DefaultListModel model = new DefaultListModel();
        if(buscaLivro.equals("Buscar Livro..."))
        {
            for(LivroVO livro:livrosBusca)
            {
                model.addElement(livro.getTitulo());
            }
        }
        else
        {
            for(LivroVO livro:livrosBusca)
            {
                String leitura = buscaLivro.toUpperCase();
                String nome = livro.getTitulo().toUpperCase();
                if(nome.contains(leitura))
                {
                    model.addElement(livro.getTitulo());
                }
            }
        }
        view.getLtBuscarLivro().setModel(model);
    }

    public void verificarSelecaoLivro(JButton btAdicionarLivro, PrincipalView view) 
    {
        if(view.getLtBuscarLivro().getSelectedIndex() != -1)
            btAdicionarLivro.setEnabled(true);
        else 
            btAdicionarLivro.setEnabled(false);
        
    }

    public void desativarSelecaoLivro(JButton btAdicionarLivro) 
    {
        btAdicionarLivro.setEnabled(false);
    }

    public void adicionarLivro(String buscaLivro, PrincipalView view) 
    {
        int index = view.getLtBuscarLivro().getSelectedIndex();
        String nomeLivro = view.getLtBuscarLivro().getSelectedValue();        
        
        DefaultListModel modelBusca = (DefaultListModel) view.getLtLivrosSelecionados().getModel();
        
        
        modelBusca.addElement(nomeLivro);
        livrosBusca.remove(index);
        view.getLtLivrosSelecionados().setModel(modelBusca);
        mostrarLivros(buscaLivro, view);
    }

    public void verificarSelecaoLivroSelecionado(JButton btRemoverLivro, PrincipalView view)
    {
        btRemoverLivro.setEnabled(!(view.getLtLivrosSelecionados().getSelectedIndex() == -1));
    }

    public void desativarSelecaoLivroSelecionado(JButton btRemoverLivro) 
    {
        btRemoverLivro.setEnabled(false);
    }

    public void removerLivro(String buscaLivro, PrincipalView view) 
    {
        int index = view.getLtLivrosSelecionados().getSelectedIndex();
        String nomeLivro = view.getLtLivrosSelecionados().getSelectedValue();
        
        DefaultListModel modelBusca = (DefaultListModel) view.getLtBuscarLivro().getModel();
        livrosBusca.add(new LivroVO(nomeLivro));
        view.getLtBuscarLivro().setModel(modelBusca);
        
        DefaultListModel modelSelecionado = (DefaultListModel) view.getLtLivrosSelecionados().getModel();
        modelSelecionado.removeElementAt(index);
        view.getLtLivrosSelecionados().setModel(modelSelecionado);
        mostrarLivros(buscaLivro, view);
    }

    public void desativarCadastrar(JButton btCadastrar) 
    {
        btCadastrar.setEnabled(false);
    }

    public void verificarNomeExistente(String nomeAutor, JButton btCadastrar)
    {
        boolean resultado = false;
        for(AutorVO autor:autores)
        {
            if(autor.getNome().equals(nomeAutor))
                resultado = true;
        }
        
        btCadastrar.setEnabled(!resultado);
            
    }

    public void verificarAtualizar(JButton btAtualizar, PrincipalView view) 
    {
        btAtualizar.setEnabled(!(view.getLtAutores().getSelectedIndex() == -1));
    }

    public void reiniciarPropriedades(JTextField txNome, JTextField txBuscarLivro, PrincipalView view)
    {
        if(!txNome.getText().isEmpty())
            txNome.setText("");
        
        if(!txBuscarLivro.getText().equals("Buscar Livro..."))
            txBuscarLivro.setText("Buscar Livro...");
        
        if(view.getLtLivrosSelecionados().getModel().getSize() != 0)
        {
            DefaultListModel modelSelec = (DefaultListModel) view.getLtLivrosSelecionados().getModel();
            modelSelec.clear();
            view.getLtLivrosSelecionados().setModel(modelSelec);
            
            DefaultListModel modelBusca = (DefaultListModel) view.getLtBuscarLivro().getModel();
            modelBusca.clear();
            for(LivroVO livro:livros)
            {
                modelBusca.addElement(livro.getTitulo());
            }
            view.getLtBuscarLivro().setModel(modelBusca);
        }
    }

    public void atualizarAutor(JTextField txNome, PrincipalView view) 
    {
        int resposta = view.verificarAtualizacao("Autor");
        if(resposta == 1)
            return;
        
        AutorVO autor = new AutorVO(view.getLtAutores().getSelectedValue());
        AutorVO autorNew = new AutorVO(txNome.getText());
        
        DefaultListModel model = (DefaultListModel) view.getLtLivrosSelecionados().getModel();
        ArrayList<LivroVO> livroSelec = new ArrayList();
        for(int i=0; i<model.getSize(); i++)
        {
            livroSelec.add(new LivroVO(model.getElementAt(i).toString()));
        }
        
        AutorDAO dao = new AutorDAO();
        try 
        {
            dao.atualizarAutor(autor, autorNew);
            dao.atualizarAutorLivros(autor, autorNew, livroSelec);
        }
        catch (ClassNotFoundException ex) 
        {
            Logger.getLogger(AutorControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(AutorControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            dao.getConexao().desconectar();
        }
        
        view.informarAtualizado("Autor", txNome.getText());
    }

    public void verificarDeletar(JButton btDeletar, PrincipalView view)
    {
        btDeletar.setEnabled(!(view.getLtAutores().getSelectedIndex() == -1));
            
    }

    public void deletarAutor(JTextField txNome, PrincipalView view) 
    {
        AutorVO autor = new AutorVO(txNome.getText());
        int resposta = view.verificarRemocao("o autor", "Autor", autor.getNome());
        if(resposta == 1)
            return;
        
        AutorDAO dao = new AutorDAO();
        try 
        {
            dao.deletarAutor(autor);
        } 
        catch (ClassNotFoundException ex)
        {
            Logger.getLogger(AutorControl.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (SQLException ex)
        {
            Logger.getLogger(AutorControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            dao.getConexao().desconectar();
        }
        
        buscarAutores(view.getTxBuscarAutor().getText(), view);
        view.informarDeletado("Autor", autor.getNome());
    }

    public void iniciarPropriedades(JTextField txBuscarLivro, PrincipalView view) 
    {
        if(view.getLtAutores().getSelectedIndex() != -1)
            return;
        
        if(!txBuscarLivro.getText().equals("Buscar Livro..."))
            txBuscarLivro.setText("Buscar Livro...");
        
            DefaultListModel modelSelec = (DefaultListModel) view.getLtLivrosSelecionados().getModel();
            modelSelec.clear();
            view.getLtLivrosSelecionados().setModel(modelSelec);
            
            DefaultListModel modelBusca = (DefaultListModel) view.getLtBuscarLivro().getModel();
            modelBusca.clear();
            livrosBusca.clear();
            livrosBusca = new ArrayList(livros);
            for(LivroVO livro:livros)
            {
                modelBusca.addElement(livro.getTitulo());
            }
            view.getLtBuscarLivro().setModel(modelBusca);
    }

    public void desativarLtLivros(PrincipalView view)
    {
        view.getLtBuscarLivro().setEnabled(false);
        view.getLtLivrosSelecionados().setEnabled(false);
    }

    public void ativarLtLivros(PrincipalView view) 
    {
        view.getLtBuscarLivro().setEnabled(true);
        view.getLtLivrosSelecionados().setEnabled(true);
    }
}
