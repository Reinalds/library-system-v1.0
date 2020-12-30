package Controller;

import ValueObject.AutorVO;
import ValueObject.LivroVO;
import DataAcessObject.LivroDAO;
import DataAcessObject.RevistaDAO;
import ValueObject.RevistaVO;
import View.ItemView;
import View.PrincipalView;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;
import javax.swing.table.DefaultTableModel;

public class ItemControl {
    
    private static ArrayList<LivroVO> livros;
    private static ArrayList<RevistaVO> revistas;
    private String verificarTipoItem(ButtonGroup bgItem)
    {
        Enumeration<AbstractButton> buttons = bgItem.getElements();    
        String nomeButton = "";

        while (buttons.hasMoreElements())
        {                                     
            AbstractButton abTmp = buttons.nextElement();                    

            if (abTmp.isSelected())
            {                          
                nomeButton = abTmp.getText();                              
                break;
            }
        }
        
        return nomeButton;
    }
    
    public void verificarCamposVazios(ItemView view)
    {
        switch(verificarTipoItem(view.getBgItem()))
            {
                case "Livro":
                    if(view.getTxTitulo().getText().isEmpty() || view.getTxLocalEdicao().getText().isEmpty())
                    {
                        view.getBtConfirmar().setEnabled(false);
                        return;
                    }
                    
                    String isbn = view.getTxIsbn().getText();
                    for(int i=0; i<13; i++)
                    {
                        if(!Character.isDigit(isbn.charAt(i)))
                        {
                            view.getBtConfirmar().setEnabled(false);
                            return;
                        }
                    }
                    view.getBtConfirmar().setEnabled(true);
                    break;
                case "Revista":
                    if(view.getTxTituloRevista().getText().isEmpty())
                    {
                        view.getBtConfirmar().setEnabled(false);
                        return;
                    }
                    String dataEdicao = view.getTxDataEdicaoRevista().getText();
                    for(int i=0; i<2; i++)
                    {
                        if(!Character.isDigit(dataEdicao.charAt(i))|| !Character.isDigit(dataEdicao.charAt(i+3)) || !Character.isDigit(dataEdicao.charAt(i+6)) || !Character.isDigit(dataEdicao.charAt(i+8)))
                        {
                            view.getBtConfirmar().setEnabled(false);
                            return;
                        }
                    }
                    
                    String subst = view.getTxDataEdicaoRevista().getText().substring(0, 2);
                    if(Integer.parseInt(subst) < 1 || Integer.parseInt(subst) > 31)
                    {
                        view.getBtConfirmar().setEnabled(false);
                            return;
                    }
                    subst = view.getTxDataEdicaoRevista().getText().substring(3, 5);
                    if(Integer.parseInt(subst) < 1 || Integer.parseInt(subst) > 12)
                    {
                        view.getBtConfirmar().setEnabled(false);
                            return;
                    }
                    view.getBtConfirmar().setEnabled(true);
                    //00/00/0000
                    //0123456789
                    break;
            }
    }
    
    public void confirmarItem(ItemView view, PrincipalView principal, boolean isAtualizacao, LivroVO livroOld, RevistaVO revistaOld) 
    {
        if(isAtualizacao)
        {
            switch(verificarTipoItem(view.getBgItem()))
            {
                case "Livro":
                    LivroControl livroControl = new LivroControl();
                    ArrayList<String> palavrasChave = popularPalavrasChave(view.getLtPalavraChave().getModel());
                    ArrayList<AutorVO> autores = popularAutores(view.getLtAutor().getModel());
                    livroControl.atualizarLivro(livroOld, view.getTxLocalEdicao().getText(), view.getTxIsbn().getText(), palavrasChave, view.getCbEditora().getSelectedItem().toString(), autores, view.getTxTitulo().getText(), Integer.parseInt(view.getSnExemplar().getValue().toString()), view);
                    break;
                case "Revista":
                    RevistaControl revistaControl = new RevistaControl();
                    revistaControl.atualizarRevista(revistaOld, view.getTxTituloRevista().getText(), view.getTxDataEdicaoRevista().getText(), view.getSnExemplaresRevista().getValue().toString(), view);
                    break;
            }
            buscarItem(principal);
            mostrarItens(principal);
        }
        else
        {
            switch(verificarTipoItem(view.getBgItem()))
            {
                case "Livro":
                    LivroControl livroControl = new LivroControl();
                    ArrayList<String> palavrasChave = popularPalavrasChave(view.getLtPalavraChave().getModel());
                    ArrayList<AutorVO> autores = popularAutores(view.getLtAutor().getModel());
                    livroControl.cadastrarLivro(view.getTxLocalEdicao().getText(), view.getTxIsbn().getText(), palavrasChave, view.getCbEditora().getSelectedItem().toString(), autores, view.getTxTitulo().getText(), Integer.parseInt(view.getSnExemplar().getValue().toString()), view);
                    
                    break;
                case "Revista":
                    RevistaControl revistaControl = new RevistaControl();
                    revistaControl.cadastrarRevista(view.getTxTituloRevista().getText(), view.getTxDataEdicaoRevista().getText(), view.getSnExemplaresRevista().getValue().toString(), view);
                    break;
            }
        }
    }

    private ArrayList popularPalavrasChave(ListModel<String> model) 
    {
        ArrayList array = new ArrayList();
        for(int i=0; i<model.getSize(); i++)
        {
            array.add(model.getElementAt(i));
        }
        
        return array;
    }

    private ArrayList<AutorVO> popularAutores(ListModel<String> model) 
    {
        ArrayList array = new ArrayList();
        for(int i=0; i<model.getSize(); i++)
        {
            array.add(new AutorVO(model.getElementAt(i)));
        }
        
        return array;
    }

    public void limparBusca(PrincipalView view) 
    {
        if(view.getTxBusca().getText().equals("Faça aqui a sua pesquisa..."))
            view.getTxBusca().setText("");
    }    

    public void verificarBusca(PrincipalView view) {
        if(view.getTxBusca().getText().isEmpty())
            view.getTxBusca().setText("Faça aqui a sua pesquisa...");
            
    }

    public void buscar(PrincipalView view) 
    {
        switch(verificarTipoItem(view.getBgItem()))
        {
            case "Livro":
                
                break;
            case "Revista":
                
                break;
        }
    }

    public void buscarItem(PrincipalView view)
    {
        switch(verificarTipoItem(view.getBgItem()))
        {
            case "Livro":
                LivroControl controller = new LivroControl();
                livros = controller.buscarLivros();
                break;
            case "Revista":
                RevistaControl revistaControl = new RevistaControl();
                revistas = revistaControl.buscarRevistas();
                break;
        }
        
    }

    public void mostrarItens(PrincipalView view)
    {
        switch(verificarTipoItem(view.getBgItem()))
        {
            case "Livro":
                if(view.getTxBusca().getText().equals("Faça aqui a sua pesquisa...") || view.getTxBusca().getText().isEmpty())
                {
                    DefaultTableModel table = (DefaultTableModel) view.getTbResultadoLivro().getModel();
                    table.setRowCount(0);
                    for(LivroVO livro:livros)
                    {
                        //Adicionar 'livro' na tabela.
                        String[] linha = new String[4];
                        linha[0] = livro.getTitulo();
                        linha[1] = livro.getEditora().getNome();
                        linha[2] = livro.getCodigoISBN();
                        
                        String autores = "";
                        for(AutorVO autor:livro.getAutores())
                        {
                            if(autores.isEmpty())
                            {
                                autores += autor.getNome();
                            }
                            else
                            {
                                autores += ", "+ autor.getNome();
                            }
                        }
                        linha[3] = autores;
                        
                        
                        table.addRow(linha);
                        
                    }
                    view.getTbResultadoLivro().setModel(table);
                }
                else
                {
                    DefaultTableModel table = (DefaultTableModel) view.getTbResultadoLivro().getModel();
                    table.setRowCount(0);
                    for(LivroVO livro:livros)
                    {
                        //Adicionar 'livro' na tabela.
                        String leitura = view.getTxBusca().getText().toUpperCase();
                        String nome = livro.getTitulo().toUpperCase();
                        if(nome.contains(leitura))
                        {
                            String[] linha = new String[4];
                            linha[0] = livro.getTitulo();
                            linha[1] = livro.getEditora().getNome();
                            linha[2] = livro.getCodigoISBN();

                            String autores = "";
                            for(AutorVO autor:livro.getAutores())
                            {
                                if(autores.isEmpty())
                                {
                                    autores += autor.getNome();
                                }
                                else
                                {
                                    autores += ", "+ autor.getNome();
                                }
                            }
                            linha[3] = autores;


                            table.addRow(linha);
                        }
                        
                        
                    }
                    view.getTbResultadoLivro().setModel(table);
                }
                break;
            case "Revista":
                if(view.getTxBusca().getText().equals("Faça aqui a sua pesquisa...") || view.getTxBusca().getText().isEmpty())
                {
                    DefaultTableModel table = (DefaultTableModel) view.getTbResultadoRevista().getModel();
                    table.setRowCount(0);
                    for(RevistaVO revista:revistas)
                    {
                        String[] linha = new String[4];
                        linha[0] = revista.getTitulo();
                        String data = revista.getDataEdicao().getDayOfMonth()+"/"+revista.getDataEdicao().getMonthValue()+"/"+revista.getDataEdicao().getYear();
                        linha[1] = data;
                        table.addRow(linha);
                    }
                    view.getTbResultadoRevista().setModel(table);
                }
                else
                {
                    DefaultTableModel table = (DefaultTableModel) view.getTbResultadoRevista().getModel();
                    table.setRowCount(0);
                    for(RevistaVO revista:revistas)
                    {
                        String leitura = view.getTxBusca().getText().toUpperCase();
                        String nome = revista.getTitulo().toUpperCase();
                        if(nome.contains(leitura))
                        {
                            String[] linha = new String[4];
                            linha[0] = revista.getTitulo();
                            String data = revista.getDataEdicao().getDayOfMonth()+"/"+revista.getDataEdicao().getMonthValue()+"/"+revista.getDataEdicao().getYear();
                            linha[1] = data;
                            table.addRow(linha);
                        }
                    }
                    view.getTbResultadoLivro().setModel(table);
                    
                }
                break;
        }
    }

    public void deletarItem(PrincipalView view)
    {
        switch(verificarTipoItem(view.getBgItem()))
        {
            case "Livro":
                String titulo = view.getTbResultadoLivro().getValueAt(view.getTbResultadoLivro().getSelectedRow(), 0).toString();
                if(view.verificarRemocao("o livro", titulo, "Livro") == 1)
                    return;

                LivroControl controller = new LivroControl();
                controller.removerLivro(view, titulo);
                buscarItem(view);
                mostrarItens(view);
                break;
            case "Revista":
                String tituloRevista = view.getTbResultadoRevista().getValueAt(view.getTbResultadoRevista().getSelectedRow(), 0).toString();
                if(view.verificarRemocao("a revista", tituloRevista, "Revista") == 1)
                    return;

                RevistaControl revistaControl = new RevistaControl();
                revistaControl.removerRevista(view, tituloRevista);
                break;
        }
    }

    public void atualizarItem(PrincipalView view)
    {
        switch(verificarTipoItem(view.getBgItem()))
        {
            case "Livro":
                if(view.getTbResultadoLivro().getSelectedRow() == -1)
                    return;
                LivroVO livro =  new LivroVO(view.getTbResultadoLivro().getValueAt(view.getTbResultadoLivro().getSelectedRow(), 0).toString());
                LivroDAO livroDao = new LivroDAO();
        
                try 
                {
                    livroDao.buscarLivro(livro);
                    ItemView item = new ItemView(livro, view);
                    item.setVisible(true);
                    view.setVisible(false);

                }
                catch (SQLException | ClassNotFoundException ex) 
                {
                    view.informarErro(ex.getMessage());
                }
                finally
                {
                    livroDao.getConexao().desconectar();
                }
        
                break;
            case "Revista":
                RevistaVO revista = new RevistaVO(view.getTbResultadoRevista().getValueAt(view.getTbResultadoRevista().getSelectedRow(), 0).toString());
                RevistaDAO revistaDao = new RevistaDAO();
                
        
                try 
                {
                    revistaDao.buscarRevista(revista);
                    ItemView itemView = new ItemView(revista, view);
                    itemView.setVisible(true);
                    view.dispose();
                }
                catch (ClassNotFoundException | SQLException ex)
                {
                    view.informarErro(ex.getMessage());
                }
                finally
                {
                    revistaDao.getConexao().desconectar();
                }
        
                break;
        }
    }
}
