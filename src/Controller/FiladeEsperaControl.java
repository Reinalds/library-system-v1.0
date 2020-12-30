/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DataAcessObject.FilaEsperaDAO;
import ValueObject.AssociadoVO;
import ValueObject.LivroVO;
import ValueObject.RevistaVO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author snake
 */
public class FiladeEsperaControl {
    
    
    
    public boolean primeiroFilaEspera(LivroVO livro, AssociadoVO associado) throws SQLException, ClassNotFoundException {
        
        FilaEsperaDAO filaEsperaDAO = new FilaEsperaDAO();
        ArrayList<Integer> ordemFilaEspera = filaEsperaDAO.ordemFilaEspera(livro);
        
        if(ordemFilaEspera.isEmpty()) return true;
        
        return ordemFilaEspera.get(0) == associado.getIdAssociado();
    }
    
    public boolean primeiroFilaEspera(RevistaVO revista, AssociadoVO associado) throws SQLException, ClassNotFoundException {
        
        FilaEsperaDAO filaEsperaDAO = new FilaEsperaDAO();
        ArrayList<Integer> ordemFilaEspera = filaEsperaDAO.ordemFilaEspera(revista);
        
        
        
        if(ordemFilaEspera.isEmpty()) return true;
        
        return ordemFilaEspera.get(0) == associado.getIdAssociado();
    }
    
    public int tamanhoFilaEspera(LivroVO livro) throws SQLException, ClassNotFoundException {
    
        FilaEsperaDAO filaEsperaDAO = new FilaEsperaDAO();
        ArrayList<Integer> FilaEspera = filaEsperaDAO.ordemFilaEspera(livro);
        
        
        return FilaEspera.size();
        
    }
    
    public int tamanhoFilaEspera(RevistaVO revista) throws SQLException, ClassNotFoundException {
    
        FilaEsperaDAO filaEsperaDAO = new FilaEsperaDAO();
        ArrayList<Integer> FilaEspera = filaEsperaDAO.ordemFilaEspera(revista);
        
        return FilaEspera.size();
        
    }
    
    public boolean filaEsperaVazia(LivroVO livro) throws SQLException, ClassNotFoundException {
        
        FilaEsperaDAO filaEsperaDAO = new FilaEsperaDAO();
        ArrayList<Integer> FilaEspera;
        
        FilaEspera = filaEsperaDAO.ordemFilaEspera(livro);
        
        if (FilaEspera.isEmpty()) return true;
        return false;
        
    }
    
    public boolean filaEsperaVazia(RevistaVO revista) throws SQLException, ClassNotFoundException {
        
        FilaEsperaDAO filaEsperaDAO = new FilaEsperaDAO();
        ArrayList<Integer> FilaEspera;
        
        FilaEspera = filaEsperaDAO.ordemFilaEspera(revista);
        
        if (FilaEspera.isEmpty()) return true;
        return false;
        
    }
    
    public void removerPrimeiroFilaEsperaLivro(LivroVO livro) throws SQLException, ClassNotFoundException {
    
        FilaEsperaDAO filaEsperaDAO = new FilaEsperaDAO();
        
        ArrayList<Integer> lista = filaEsperaDAO.ordemFilaEsperaPosicao(livro);
        
        filaEsperaDAO.removerPrimeiroFilaEsperaLivro(lista.get(0));
        
    }
    
    public void removerPrimeiroFilaEsperaRevista(RevistaVO revista) throws SQLException, ClassNotFoundException {
    
        FilaEsperaDAO filaEsperaDAO = new FilaEsperaDAO();
        
        ArrayList<Integer> lista = filaEsperaDAO.ordemFilaEsperaPosicao(revista);
        
        filaEsperaDAO.removerPrimeiroFilaEsperaRevista(lista.get(0));
        
    }
    
    public void adicionarListaEsperaLivro(String nome, String titulo) throws ClassNotFoundException, SQLException {
        
        AssociadoControl associado = new AssociadoControl();
        FilaEsperaDAO filaEspera = new FilaEsperaDAO();
        AssociadoVO associadoVO = new AssociadoVO();
        LivroVO livro = new LivroVO(titulo);
        
        associadoVO.setIdAssociado(associado.buscarIdAssociado(nome));
        filaEspera.adicionarListaEsperaLivro(associadoVO, livro);
    
    }
    
    public void adicionarListaEsperaRevista(String nome, String titulo) throws ClassNotFoundException, SQLException {
        
        AssociadoControl associado = new AssociadoControl();
        FilaEsperaDAO filaEspera = new FilaEsperaDAO();
        AssociadoVO associadoVO = new AssociadoVO();
        RevistaVO revista = new RevistaVO(titulo);
        
        associadoVO.setIdAssociado(associado.buscarIdAssociado(nome));
        filaEspera.adicionarListaEsperaRevista(associadoVO, revista);
    
    }
    
}
