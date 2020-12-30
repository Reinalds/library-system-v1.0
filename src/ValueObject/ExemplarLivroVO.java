package ValueObject;

public class ExemplarLivroVO extends LivroVO
{
    private int numExemplar;
    private boolean disponivel;

    public ExemplarLivroVO(int numExemplar, String titulo) {
        super(titulo);
        this.numExemplar = numExemplar;
    }

    public ExemplarLivroVO(int numExemplar, boolean disponivel, String titulo) 
    {
        super(titulo);
        this.numExemplar = numExemplar;
        this.disponivel = disponivel;
    }
    
    public int getNumExemplar()
    {
        return numExemplar;
    }
    
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    public boolean isDisponivel()
    {
        return disponivel;
    }
}
