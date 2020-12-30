/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DataAcessObject.EmprestimoDAO;
import Exceptions.MultaException;
import Exceptions.naoDisponivelException;
import ValueObject.AssociadoVO;
import ValueObject.EmprestimoGenericoVO;
import ValueObject.EmprestimoLivroVO;
import ValueObject.EmprestimoRevistaVO;
import ValueObject.ExemplarLivroVO;
import ValueObject.ExemplarRevistaVO;
import ValueObject.LivroVO;
import ValueObject.MultaVO;
import ValueObject.RevistaVO;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author snake
 */
public class EmprestimoControl {
    
    
    public ArrayList<EmprestimoGenericoVO> consultarEmprestimosLivro() throws ClassNotFoundException, SQLException {
    
        EmprestimoDAO emprestimoDAO = new EmprestimoDAO();
        return emprestimoDAO.consultarEmprestimosLivro();
   
    }
    
    public ArrayList<EmprestimoGenericoVO> consultarEmprestimosRevista() throws ClassNotFoundException, SQLException {
    
        EmprestimoDAO emprestimoDAO = new EmprestimoDAO();
        return emprestimoDAO.consultarEmprestimosRevista();
   
    }

    public void emprestarLivro(AssociadoVO associado, String titulo, int exemplar) throws SQLException, ClassNotFoundException, naoDisponivelException {

        boolean flag, flag2 = false;
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	Date date = new Date();
        dateFormat.format(date);
        
        EmprestimoDAO emprestimoDAO = new EmprestimoDAO();
        ExemplarLivroVO livro = new ExemplarLivroVO(exemplar, titulo);
        EmprestimoLivroVO emprestimoLivro = new EmprestimoLivroVO(date, associado, livro);
        LivroControl livroControl = new LivroControl();
        FiladeEsperaControl filaEspera = new FiladeEsperaControl();
        LivroVO livroVO = new LivroVO(titulo);
        
        flag = filaEspera.primeiroFilaEspera(livro, associado);
        
        ArrayList<EmprestimoGenericoVO> emprestimos = emprestimoDAO.consultarEmprestimosLivro();
        
        for(int i=0; i<emprestimos.size(); i++) {
        
            if(emprestimos.get(i).getTitulo().equals(titulo) && emprestimos.get(i).getExemplar() == exemplar) {
            
                flag2 = true;
                break;
            }
        
        }
        
        if(flag2) {
        
            throw new naoDisponivelException(titulo);
            
        }
        
        if(!flag && !flag2) {
        
            throw new naoDisponivelException(titulo);
            
        }
        
        if(flag && !flag2) {
            
            emprestimoDAO.emprestarLivro(emprestimoLivro);
            livroControl.emprestarExemplarLivro(livro);
            filaEspera.removerPrimeiroFilaEsperaLivro(livroVO);
            return;
        
        }
           
        emprestimoDAO.emprestarLivro(emprestimoLivro);
        livroControl.emprestarExemplarLivro(livro);
        
    }

    public void emprestarRevista(AssociadoVO associado, String titulo, int exemplar) throws SQLException, naoDisponivelException, ClassNotFoundException {

        boolean flag, flag2 = false;
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	Date date = new Date();
        dateFormat.format(date);
        
        EmprestimoDAO emprestimoDAO = new EmprestimoDAO();
        ExemplarRevistaVO revista = new ExemplarRevistaVO(exemplar, titulo);
        EmprestimoRevistaVO emprestimoRevista = new EmprestimoRevistaVO(date, associado, revista);
        RevistaControl revistaControl = new RevistaControl();
        FiladeEsperaControl filaEspera = new FiladeEsperaControl();
        RevistaVO revistaVO = new RevistaVO(titulo);
        
        flag = filaEspera.primeiroFilaEspera(revista, associado);
        
        ArrayList<EmprestimoGenericoVO> emprestimos = emprestimoDAO.consultarEmprestimosRevista();
        
        for(int i=0; i<emprestimos.size(); i++) {
        
            if(emprestimos.get(i).getTitulo().equals(titulo) && emprestimos.get(i).getExemplar() == exemplar) {
            
                flag2 = true;
                break;
            }
        
        }
        
        if(flag2) {
        
            throw new naoDisponivelException(titulo);
            
        }
        
        if(!flag && !flag2) {
        
            throw new naoDisponivelException(titulo);
            
        }
        
        if(flag && !flag2) {
        
            emprestimoDAO.emprestarRevista(emprestimoRevista);
            revistaControl.emprestarExemplarRevista(revista);
            filaEspera.removerPrimeiroFilaEsperaRevista(revistaVO);
            return;
        
        }
        
        emprestimoDAO.emprestarRevista(emprestimoRevista);
        revistaControl.emprestarExemplarRevista(revista);
        
    }

    public void devolverLivro(String titulo, int exemplar) throws SQLException, ClassNotFoundException, MultaException {
        
        boolean flagMulta;
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	Date date = new Date();
        dateFormat.format(date);
        
        ExemplarLivroVO livroVO = new ExemplarLivroVO(exemplar, titulo);
        
        EmprestimoDAO emprestimoDAO = new EmprestimoDAO();
        LivroControl livroControl = new LivroControl();
        
        flagMulta = emprestimoDAO.verificarMulta(livroVO);
        
        //Lembrar: salvar multa na relação de multas e adicionar para consultar multas na interface
        if(flagMulta) {
            
            emprestimoDAO.inserirMulta(livroVO, emprestimoDAO.selecionarAssociadoMultaLivro(livroVO));
            emprestimoDAO.devolverLivro(livroVO);
            livroControl.devolverExemplarLivro(livroVO);
            throw new MultaException(titulo);
            
        }
        
        emprestimoDAO.devolverLivro(livroVO);
        livroControl.devolverExemplarLivro(livroVO);
        
        
        
        
        
    }

    public void devolverRevista(String titulo, int exemplar) throws SQLException, ClassNotFoundException, MultaException {
        
        boolean flagMulta;
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	Date date = new Date();
        dateFormat.format(date);
        
        ExemplarRevistaVO revistaVO = new ExemplarRevistaVO(exemplar, titulo);
        
        EmprestimoDAO emprestimoDAO = new EmprestimoDAO();
        RevistaControl revistaControl = new RevistaControl();
        
        flagMulta = emprestimoDAO.verificarMulta(revistaVO);
        
        if(flagMulta) {
            
            emprestimoDAO.inserirMulta(revistaVO, emprestimoDAO.selecionarAssociadoMultaRevista(revistaVO));
            emprestimoDAO.devolverRevista(revistaVO);
            revistaControl.devolverExemplarRevista(revistaVO);
            throw new MultaException(titulo);
        
        }
        
        emprestimoDAO.devolverRevista(revistaVO);
        revistaControl.devolverExemplarRevista(revistaVO);
        
        
        
    }
    
    public ArrayList<MultaVO> consultarMultas(int idssociado) throws ClassNotFoundException, SQLException {
    
        EmprestimoDAO emprestimoDAO = new EmprestimoDAO();
        
        return emprestimoDAO.consultarMultas(idssociado);
    
    }
    
    public int[] consultarIdMultaLivro(int idAssociado) throws ClassNotFoundException, SQLException {
    
            EmprestimoDAO emprestimodao = new EmprestimoDAO();
            ArrayList<MultaVO> multas = emprestimodao.consultarMultasLivro(idAssociado);
            int[] idMultas = new int[multas.size()];
            
            for(int i=0; i<multas.size(); i++) {
                idMultas[i] = multas.get(i).getIdMulta();
            }
            
            return idMultas;
    
    }
    
    public int[] consultarIdMultaRevista(int idAssociado) throws ClassNotFoundException, SQLException {
    
            EmprestimoDAO emprestimodao = new EmprestimoDAO();
            ArrayList<MultaVO> multas = emprestimodao.consultarMultasRevista(idAssociado);
            int[] idMultas = new int[multas.size()];
            
            for(int i=0; i<multas.size(); i++) {
                idMultas[i] = multas.get(i).getIdMulta();
            }
            
            return idMultas;
    
    }
    
    
    
    public void pagarMultaLivro(int idMulta) throws ClassNotFoundException, SQLException {
    
        EmprestimoDAO emprestimoDAO = new EmprestimoDAO();
        
        emprestimoDAO.pagarMultaLivro(idMulta);
        
    }
    
    public void pagarMultaRevista(int idMulta) throws ClassNotFoundException, SQLException {
    
        EmprestimoDAO emprestimoDAO = new EmprestimoDAO();
        
        emprestimoDAO.pagarMultaRevista(idMulta);
        
    }
    
    
}
