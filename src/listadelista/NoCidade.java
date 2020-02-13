
package listadelista;

public class NoCidade
{
    private String nome;
    private NoCidade prox;
    
    public NoCidade(String nome, NoCidade prox)
    {
        this.nome = nome;
        this.prox = prox;
    }
    public NoCidade()
    {
        
    }
    public NoCidade(String nome)
    {
        this.nome = nome;
    }
    
    public NoCidade getProx()
    {
        return prox;
    }
    public void setProx(NoCidade prox)
    {
        this.prox = prox;
    }
    public String getNome()
    {
        return nome;
    }
    public void setNome (String nome)
    {
        this.nome = nome;
    }
}
