package ValueObject;

import java.util.ArrayList;

public class LivroVO extends ItemVO {
    private String localEdicao;
    private String codigoISBN;
    private ArrayList<String> palavrasChave;
    private EditoraVO editora;
    private ArrayList<AutorVO> autores;

    public LivroVO(String titulo, String localEdicao, String codigoISBN)
    {
        super(titulo);
        this.localEdicao = localEdicao;
        this.codigoISBN = codigoISBN;
        this.palavrasChave = new ArrayList();
    }

    public LivroVO(String localEdicao, String codigoISBN, ArrayList<String> palavrasChave, EditoraVO editora, ArrayList<AutorVO> autores, String titulo) 
    {
        super(titulo);
        this.localEdicao = localEdicao;
        this.codigoISBN = codigoISBN;
        this.palavrasChave = palavrasChave;
        this.editora = editora;
        this.autores = autores;
    }

    public LivroVO(String titulo, String localEdicao, String codigoISBN, EditoraVO editora) 
    {
        super(titulo);
        this.localEdicao = localEdicao;
        this.codigoISBN = codigoISBN;
        this.editora = editora;
    }
    
    
    public LivroVO(String titulo)
    {
        super(titulo);
    }

    public void setEditora(EditoraVO editora) {
        this.editora = editora;
    }

    public void setAutores(ArrayList<AutorVO> autores) {
        this.autores = autores;
    }
    
    

    public ArrayList<String> getPalavrasChave()
    {
        return palavrasChave;
    }

    public void setPalavrasChave(ArrayList<String> palavrasChave) 
    {
        this.palavrasChave = palavrasChave;
    }
    
    public String getLocalEdicao()
    {
        return localEdicao;
    }

    public void setLocalEdicao(String localEdicao) 
    {
        this.localEdicao = localEdicao;
    }

    public String getCodigoISBN() 
    {
        return codigoISBN;
    }

    public void setCodigoISBN(String codigoISBN) 
    {
        this.codigoISBN = codigoISBN;
    }    
    
    public EditoraVO getEditora() 
    {
        return editora;
    }

    public ArrayList<AutorVO> getAutores() 
    {
        return autores;
    }
}
