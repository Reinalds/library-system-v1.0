package ValueObject;

public abstract class ItemVO 
{
    private String titulo;

    public ItemVO(String titulo) 
    {
        this.titulo = titulo;
    }
    
    public String getTitulo()
    {
        return titulo;
    }

    public void setTitulo(String titulo) 
    {
        this.titulo = titulo;
    }
    
}
