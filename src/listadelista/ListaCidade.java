/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadelista;

public class ListaCidade
{

    public NoCidade inicio;
    private int tl;

    public int getTl()
    {
        return tl;
    }

    public void setTl(int tl)
    {
        this.tl = tl;
    }

    public ListaCidade(NoCidade inicio)
    {
        this.inicio = inicio;
    }

    public ListaCidade()
    {
    }

    public NoCidade getInicio()
    {
        return inicio;
    }

    public void setInicio()
    {
        this.inicio = inicio;
    }

    public void insert(String cidade) // INSERIR NA LISTA DE CIDADE
    {
        NoCidade aux = inicio;
        NoCidade ant = null;
        NoCidade novo = new NoCidade(cidade);
        if (inicio == null)
        {
            inicio = novo;
            aux = inicio;
        } else
            if (inicio.getNome().compareTo(cidade) > 0) // INICIO
            {
                novo.setProx(inicio);
                inicio = novo;
                tl++;
            } else
            {
                ant = aux;
                aux = aux.getProx();
                while (aux != null && cidade.compareTo(aux.getNome()) > 0)
                {
                    ant = aux;
                    aux = aux.getProx();
                }
                // if (!cidade.equals(aux.getNome()))
                {
                    novo.setProx(aux);
                    ant.setProx(novo);
                    tl++;
                }
            }

    }

    public NoCidade get(int index) // A PARTIR DE UM NUMERO EU RETORNO O ITEM COM ESSE INDEX
    {
        NoCidade aux = inicio;

        if (inicio != null) // ver se tem algo na lista

            for (int i = 0; aux != null && i < index; i++)
                aux = aux.getProx();
        return aux;
    }

    public boolean delete(int index) // EXCLUIR A PARTIR DE UM INDICE (EX: EXCLUIR O 3º ELEMENTO)
    {
        NoCidade aux = inicio;

        if (aux != null && index >= 0 && index <= tl)
        {
            NoCidade elem = get(index);
            if (inicio == elem)
                inicio = inicio.getProx();
            else
            {
                NoCidade antElem = get(index - 1);
                antElem.setProx(elem.getProx());
            }
            tl--;
            return true;
        }
        return false;
    }

    public void set(int index, String nome) // ATUALIZANDO VALOR
    {
        NoCidade aux = get(index);

        if (aux != null && index >= 0 && index <= tl)
            aux.setNome(nome);
    }

    public int IndexOf(NoCidade no) // RETORNA A POSIÇÃO DO NÓ NA LISTA
    {
        int i;
        NoCidade aux = inicio;
        for (i = 0; aux != null && aux.getNome().equals(no.getNome()); i++)
            aux = aux.getProx();
        return (aux == null) ? -1 : i;
    }

    public NoCidade getCidade(String nome)
    {
        NoCidade aux = inicio;

        if (aux != null)
            while (aux != null && aux.getNome().equals(nome))
                aux = aux.getProx();

        return aux;
    }

    public boolean get(String cidade)
    {
        NoCidade aux = inicio;

        if (aux != null)
        {
            while (aux != null && aux.getNome().equals(cidade))
                aux = aux.getProx();

            if (aux.getNome().equals(cidade))
                return true;
        }
        return false;
    }

    public void exibir()
    {
        NoCidade aux = inicio;

        while (aux != null)
        {
            System.out.println(aux.getNome());
            aux = aux.getProx();
        }
    }
}
