package ValueObject;

public class FilaEsperaVO
{
    private int idAssociado;
    private String nomeAssociado, titulo;
    
    public FilaEsperaVO() {
    }
    
    public FilaEsperaVO(int idAssociado, String nomeAssociado, String titulo)
    {
        this.idAssociado = idAssociado;
        this.nomeAssociado = nomeAssociado;
        this.titulo = titulo;
    }
    
    public FilaEsperaVO(int idAssociado, String titulo)
    {
        this.idAssociado = idAssociado;
        this.titulo = titulo;
    }

    public String getNomeAssociado() {
        return nomeAssociado;
    }

    public void setNomeAssociado(String nomeAssociado) {
        this.nomeAssociado = nomeAssociado;
    }

    public int getIdAssociado() {
        return idAssociado;
    }

    public void setIdAssociado(int idAssociado) {
        this.idAssociado = idAssociado;
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
