package ValueObject;

import java.util.Date;

public class MultaVO
{
    private static final int PRECO = 5;
    private int idMulta;
    private EmprestimoGenericoVO emprestimo;
    private String estado;

    public MultaVO(int idMulta, String titulo, int exemplar, Date dataEmprestimo, String estado)
    {
        emprestimo = new EmprestimoGenericoVO(titulo, exemplar, dataEmprestimo);
        this.idMulta = idMulta;
        
    }
    
    public MultaVO(int idMulta, String titulo, int exemplar, String estado)
    {
        emprestimo = new EmprestimoGenericoVO(titulo, exemplar);
        this.idMulta = idMulta;
        this.estado = estado;
        
    }

    public int getIdMulta() {
        return idMulta;
    }

    public void setIdMulta(int idMulta) {
        this.idMulta = idMulta;
    }
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public double getPreco()
    {
        return PRECO;
    }

    public EmprestimoGenericoVO getEmprestimo() 
    {
        return emprestimo;
    }

    public void setEmprestimo(EmprestimoGenericoVO emprestimo) 
    {
        this.emprestimo = emprestimo;
    }
    
    
}