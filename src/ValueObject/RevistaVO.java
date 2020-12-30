package ValueObject;

import java.time.LocalDate;

public class RevistaVO extends ItemVO
{
    private LocalDate dataEdicao;

    public RevistaVO(String titulo, LocalDate dataEdicao)
    {
        super(titulo);
        this.dataEdicao = dataEdicao;
    }
    
    public RevistaVO(String titulo)
    {
        super(titulo);
    }

    public LocalDate getDataEdicao()
    {
        return dataEdicao;
    }

    public void setDataEdicao(LocalDate dataEdicao)
    {
        this.dataEdicao = dataEdicao;
    }
    
    
}
