package ValueObject;

public class AssociadoVO
{
    private int idAssociado;
    private String nome, telefone, email, login, senha;
    
    public AssociadoVO(int idAssociado, String nome) 
    {
        this.idAssociado = idAssociado;
        this.nome = nome;
    }

    public AssociadoVO(int idAssociado, String nome, String telefone, String email) 
    {
        this.idAssociado = idAssociado;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public AssociadoVO()
    {
        
    }
    
    public AssociadoVO(String nome, String telefone, String email, String login, String senha) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.login = login;
        this.senha = senha;
    }

    public AssociadoVO(String login) 
    {
        this.login = login;
    }

    public AssociadoVO(String nome, String telefone, String email)
    {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public AssociadoVO(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public String getLogin()
    {
        return login;
    }

    public String getSenha()
    {
        return senha;
    }
    
    public int getIdAssociado()
    {
        return idAssociado;
    }

    public String getNome()
    {
        return nome;
    }

    public String getTelefone() 
    {
        return telefone;
    }

    public String getEmail() 
    {
        return email;
    }

    public void setLogin(String login) 
    {
        this.login = login;
    }

    public void setSenha(String senha) 
    {
        this.senha = senha;
    }

    
    
    public void setIdAssociado(int idAssociado) 
    {
        this.idAssociado = idAssociado;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public void setTelefone(String telefone)
    {
        this.telefone = telefone;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }
    
    
    
}
