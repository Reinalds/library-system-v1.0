package ValueObject;

public class AutorVO
{
    private String nome;


    public AutorVO(String nome) 
    {
        this.nome = nome;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

}
