/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadelista;

/**
 *
 * @author Aluno
 */
public class NoEstado
{
    private NoEstado prox;
    private String nome;
    private ListaCidade ptrCidade;
    
    public NoEstado(NoEstado prox, String nome, ListaCidade ptrCidade)
    {
        this.nome = nome;
        this.prox = prox;
        this.ptrCidade = ptrCidade;
    }
    public NoEstado(){ptrCidade= new ListaCidade();}
    public NoEstado(String nome)
    {
        this.nome = nome;
        ptrCidade= new ListaCidade();
    }

    public NoEstado getProx()
    {
        return prox;
    }

    public void setProx(NoEstado prox)
    {
        this.prox = prox;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public ListaCidade getPtrCidade()
    {
        return ptrCidade;
    }

    public void setPtrCidade(ListaCidade ptrCidade)
    {
        this.ptrCidade = ptrCidade;
    }

 
    
}
