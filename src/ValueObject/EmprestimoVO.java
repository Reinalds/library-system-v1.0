package ValueObject;

import java.util.Date;


public class EmprestimoVO 
{
    private Date dataEmprestimo;
    private AssociadoVO associado;
    private ItemVO item;

    public EmprestimoVO(Date dataEmprestimo, AssociadoVO associado, LivroVO item)
    {
        this.dataEmprestimo = dataEmprestimo;
        this.associado = associado;
        this.item = item;
    }
    
    public EmprestimoVO(Date dataEmprestimo, AssociadoVO associado, RevistaVO item)
    {
        this.dataEmprestimo = dataEmprestimo;
        this.associado = associado;
        this.item = item;
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
    
    public void setItem(ItemVO item)
    {
        this.item = item;
    }
    
    public ItemVO getItem()
    {
        return item;
    }
    
    
    
}
