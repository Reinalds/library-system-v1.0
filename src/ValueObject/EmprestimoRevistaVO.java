/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ValueObject;

import java.util.Date;


public class EmprestimoRevistaVO {
    
    private Date dataEmprestimo;
    private AssociadoVO associado;
    private ExemplarRevistaVO exemplarRevista;

    public EmprestimoRevistaVO(Date dataEmprestimo, AssociadoVO associado, ExemplarRevistaVO exemplarRevista)
    {
        this.dataEmprestimo = dataEmprestimo;
        this.associado = associado;
        this.exemplarRevista = exemplarRevista;
    }
    
    public void setDataEmprestimo(Date dataEmprestimo)
    {
        this.dataEmprestimo = dataEmprestimo;
    }
    
    public Date getDataEmprestimo()
    {
        return dataEmprestimo;
    }
    
    
    public void setAssociado(AssociadoVO associado)
    {
        this.associado = associado;
    }
    
    public AssociadoVO getAssociado()
    {
        return associado;
    }

    public ExemplarRevistaVO getExemplarRevista() {
        return exemplarRevista;
    }

    public void setExemplarRevista(ExemplarRevistaVO exemplarRevista) {
        this.exemplarRevista = exemplarRevista;
    }
    
    
}
