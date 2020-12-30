package ValueObject;

public class EditoraVO
{
    private String nome;

    public EditoraVO(String nome)
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
