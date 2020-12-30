package ValueObject;

public class ExemplarRevistaVO extends RevistaVO
{
    private int numExemplar;
    private boolean disponivel;

    public ExemplarRevistaVO(int numExemplar, String titulo) {
        super(titulo);
        this.numExemplar = numExemplar;
    }

    public ExemplarRevistaVO(int numExemplar, boolean disponivel, String titulo) 
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
