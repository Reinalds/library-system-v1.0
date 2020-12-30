
package Controller;

import DataAcessObject.ExemplarRevistaDAO;
import DataAcessObject.RevistaDAO;
import Exceptions.ImpossibleNumberException;
import Exceptions.InvalidDateException;
import ValueObject.EmprestimoGenericoVO;
import ValueObject.ExemplarRevistaVO;
import ValueObject.RevistaVO;
import View.ItemView;
import View.PrincipalView;
import java.awt.CardLayout;
import java.sql.SQLException;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class RevistaControl
{
    
    public void cadastrarRevista(String titulo, String dataEdicao, String numExemplar, ItemView view)
    {
        RevistaDAO dao = new RevistaDAO();
        int numEx = Integer.parseInt(numExemplar);
        try 
        {
            validarTitulo(titulo);
            
            LocalDate dataedicao = converterDataEdicao(dataEdicao);
            
            RevistaVO revistaVO = new RevistaVO(titulo, dataedicao);
            dao.cadastrarRevista(revistaVO);
            
            ExemplarRevistaDAO exemplarDAO = new ExemplarRevistaDAO();
            
            for(int i=0; i<=numEx; i++)
            {
                ExemplarRevistaVO exemplar = new ExemplarRevistaVO((i+1), revistaVO.getTitulo());
                exemplarDAO.inserirExemplarRevista(exemplar);
            }
            
            
            view.informarMensagem("Revista "+ titulo +" cadastrado com Sucesso!", "Cadastrar Revista");
        } 
        catch (ImpossibleNumberException | ClassNotFoundException | SQLException ex) 
        {
            view.informarErro(ex.getMessage());
        }
        finally
        {
            dao.getConexao().desconectar();
        }
    }
    
    private void validarTitulo(String titulo) throws ImpossibleNumberException
    {
        //Verifica se 'nome' possui valores numéricos 
        for(int i=0; i<titulo.length();i++)
        {
            if(Character.isDigit(titulo.charAt(i)))
                throw new ImpossibleNumberException("titulo");
        }
    }
    
    private void validarDataEdicao(String dataEdicao) throws InvalidDateException, ParseException{
        
        if(dataEdicao.length() != 10)
            throw new InvalidDateException("dataEdicao");
        
    }
    
    public void emprestarExemplarRevista(ExemplarRevistaVO revista) throws ClassNotFoundException, SQLException {
    
        ExemplarRevistaDAO exemplarRevistaDAO = new ExemplarRevistaDAO();
        exemplarRevistaDAO.emprestarExemplarRevista(revista);
        
    }
    
    public void devolverExemplarRevista(ExemplarRevistaVO revista) throws ClassNotFoundException, SQLException {
    
        ExemplarRevistaDAO exemplarRevistaDAO = new ExemplarRevistaDAO();
        exemplarRevistaDAO.devolverExemplarRevista(revista);
    }

    public ArrayList<RevistaVO> buscarRevistas()
    {
        ArrayList<RevistaVO> revistas = null;
        RevistaDAO dao = new RevistaDAO();
        
        try
        {
            revistas = dao.buscarRevistas();
        } 
        catch (ClassNotFoundException | SQLException ex) 
        {
            Logger.getLogger(RevistaControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return revistas;
    }

    private LocalDate converterDataEdicao(String dataEdicao) {
        int dia = Integer.parseInt(dataEdicao.substring(0, 2));
        int mes = Integer.parseInt(dataEdicao.substring(3, 5));
        int ano = Integer.parseInt(dataEdicao.substring(6));
        
        return LocalDate.of(ano, mes, dia);    
    }

    void removerRevista(PrincipalView view, String titulo) 
    {
        RevistaDAO dao = new RevistaDAO();
        try 
        {
            dao.deletarRevista(new RevistaVO(titulo));
        }
        catch (ClassNotFoundException | SQLException ex) {
            view.informarErro(ex.getMessage());
        }
        
        view.informarDeletado("Revista", titulo);
        
    }

    public void preencherCampos(ItemView view, RevistaVO revista) 
    {
        CardLayout card = (CardLayout) view.getPnCentro().getLayout();
        card.show(view.getPnCentro(), "pnRevista");
        view.getRbLivro().setSelected(false);
        view.getRbRevista().setSelected(true);
        
        view.getTxTituloRevista().setText(revista.getTitulo());
        
        String data = revista.getDataEdicao().getDayOfMonth()+"/";
        
        if(revista.getDataEdicao().getMonthValue() / 10 == 0)
        {
            data += "0";
        }
        
        data += revista.getDataEdicao().getMonthValue()+"/"+revista.getDataEdicao().getYear();
        
        view.getTxDataEdicaoRevista().setText(data);
        
        RevistaDAO dao = new RevistaDAO();
        try 
        {
            view.getLbExemplaresRevista().setText("Exemplares Disponiveis:");
            int quantExemplar = dao.buscarQuantExemplaresDisponiveis(revista);
            view.getSnExemplaresRevista().setValue(quantExemplar);
        }
        catch (SQLException | ClassNotFoundException ex) 
        {
            view.informarErro(ex.getMessage());
        }
        finally
        {
            dao.getConexao().desconectar();
        }
        
    }

    void atualizarRevista(RevistaVO revistaOld, String titulo, String dataEdicao, String numExemplar, ItemView view) 
    {
        if(view.verificarAtualizacao("Revista") == 1)
            return;
        RevistaDAO dao = new RevistaDAO();
        int numEx = Integer.parseInt(numExemplar);
        try 
        {
            validarTitulo(titulo);
            
            LocalDate dataedicao = converterDataEdicao(dataEdicao);
            
            RevistaVO revistaVO = new RevistaVO(titulo, dataedicao);
            dao.atualizarRevista(revistaOld, revistaVO);
            
            ExemplarRevistaDAO exemplarDAO = new ExemplarRevistaDAO();
            
            atualizarExemplares(numEx, revistaOld, revistaVO);
            
            view.informarMensagem("Revista "+ titulo +" atualizada com Sucesso!", "Atualizar Revista");
        } 
        catch (ImpossibleNumberException | ClassNotFoundException | SQLException ex) 
        {
            view.informarErro(ex.getMessage());
        }
        finally
        {
            dao.getConexao().desconectar();
        }
    }

    private void atualizarExemplares(int numExemplar, RevistaVO revistaOld, RevistaVO revista) throws SQLException, ClassNotFoundException 
    {
        RevistaDAO dao = new RevistaDAO();
        int numExemplarOld = dao.buscarQuantExemplaresDisponiveis(revistaOld);
        ExemplarRevistaDAO exemplarDAO = new ExemplarRevistaDAO();
        ArrayList<ExemplarRevistaVO> exemplares = exemplarDAO.buscarExemplaresRevista(revistaOld);
        if(numExemplarOld > numExemplar)                //Se for removido exemplares
        {
            int numEx = 1;
            int diferenca = numExemplarOld - numExemplar;
            dao.removerExemplaresDisponiveis(revistaOld);
            
            while(numExemplar != 0)
            {
                int res = exemplarDAO.buscarNumExemplar(numEx);
                if(res==0)
                {
                    exemplarDAO.inserirExemplarRevista(new ExemplarRevistaVO(numEx, true, revista.getTitulo()));
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
                    exemplarDAO.inserirExemplarRevista(new ExemplarRevistaVO(numEx, true, revista.getTitulo()));
                    diferenca--;
                }
                numEx++;
                
            }
        }
                
    }
    
    public int[] buscarExemplares(String titulo) throws ClassNotFoundException, SQLException {
    
        RevistaDAO revistaDao = new RevistaDAO();
        ArrayList<EmprestimoGenericoVO> emprestimosTmp = revistaDao.buscarExemplares(titulo);
        
        int [] exemplares = new int[emprestimosTmp.size()];
        
        for(int i=0; i<emprestimosTmp.size(); i++) {
            
            exemplares[i] = emprestimosTmp.get(i).getExemplar();
        
        }
        
        return exemplares;
        
    }
    
}
