package ValueObject;

import java.util.Date;


public class EmprestimoLivroVO 
{
    private Date dataEmprestimo;
    private AssociadoVO associado;
    private ExemplarLivroVO exemplarLivro;

    public EmprestimoLivroVO(Date dataEmprestimo, AssociadoVO associado, ExemplarLivroVO exemplarLivro)
    {
        this.dataEmprestimo = dataEmprestimo;
        this.associado = associado;
        this.exemplarLivro = exemplarLivro;
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

    public ExemplarLivroVO getExemplarLivro() {
        return exemplarLivro;
    }

    public void setExemplarLivro(ExemplarLivroVO exemplarLivro) {
        this.exemplarLivro = exemplarLivro;
    }
    
    
    
    
    
}
