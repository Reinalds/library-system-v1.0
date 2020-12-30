/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ValueObject;

import java.util.Date;

/**
 *
 * @author snake
 */
public class EmprestimoGenericoVO {
    
    private String titulo;
    private int exemplar;
    private Date dataEmprestimo;

    public EmprestimoGenericoVO(String titulo, int exemplar, Date dataEmprestimo) {
        
        this.titulo = titulo;
        this.exemplar = exemplar;
        this.dataEmprestimo = dataEmprestimo;
    }
    
    public EmprestimoGenericoVO(String titulo, int exemplar) {
        
        this.titulo = titulo;
        this.exemplar = exemplar;
    }
    
    public EmprestimoGenericoVO(int exemplar) {
        
        this.exemplar = exemplar;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getExemplar() {
        return exemplar;
    }

    public void setExemplar(int exemplar) {
        this.exemplar = exemplar;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }
    
    
    

}
