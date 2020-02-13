package listadelista;

public class ListaEstado {

    public NoEstado inicio;
    private int tl;

    public ListaEstado(NoEstado inicio) {
        this.inicio = inicio;
    }

    public ListaEstado() {
    }

    public void insert(String estado, String... cidade) {
        NoEstado aux = inicio;
        NoEstado ant = null;
        NoEstado novo = new NoEstado(estado);
        if (inicio == null) {
            inicio = novo;
            aux = inicio;
        } 
        else 
        {
            ant = null;
            while (aux.getProx() != null && estado.compareTo(aux.getNome()) > 0) // FAZER EM ORDEM CRESCENTE
            {
                ant = aux;
                aux = aux.getProx();
            }
            if (estado.compareTo(aux.getNome()) != 0) {
                if (estado.compareTo(aux.getNome()) > 0) {
                    aux.setProx(novo);
                    novo.setProx(aux.getProx());
                } else {
                    if (ant != null) {
                        ant.setProx(novo);
                    } else {
                        inicio = novo;
                    }

                    novo.setProx(aux);
                }
            } 
            else 
               novo = aux;
            

        }
        for (int i = 0; i < cidade.length; i++) {
            novo.getPtrCidade().insert(cidade[i]);
        }
        tl++;

    }

    public NoEstado getEstado(String estado) {
        NoEstado aux = inicio;

        if (aux != null) {
            while (aux != null && aux.getNome().equals(estado)) {
                aux = aux.getProx();
            }
        }
        return aux;
    }

    public boolean getEstadoCidade(String estado, String cidade) {
        NoEstado aux = inicio;
        boolean var = false;

        if (aux != null) {
            while (aux != null && aux.getNome().equals(estado)) {
                aux = aux.getProx();
            }
            if (aux.getNome().equals(estado)) {
                var = aux.getPtrCidade().get(cidade);
            }
        }
        return var;
    }

    public void exibirTodos() // Todos Estados
    {
        NoEstado aux = inicio;
        NoCidade auxc;
        while (aux != null) {
            System.out.println("Estado: " + aux.getNome()); // ESTADO
            auxc = aux.getPtrCidade().getInicio();
            System.out.println("\n Cidade(s): ");
            while (auxc != null) {
                System.out.println("\t" + auxc.getNome() + "\n");
                auxc = auxc.getProx();
            }
            System.out.println("\n\n\n\n");
            aux = aux.getProx();
        }
    }
}
/*
public void insert(String estado, String... cidade) {
        NoEstado aux = inicio;
        NoEstado ant = null;
        NoEstado novo = new NoEstado(estado);
        if (inicio == null) {
            inicio = novo;
            aux = inicio;
        } else /*if (inicio.getNome().compareTo(estado) < 0) // INICIO
            {
                novo.setProx(inicio);
                inicio = novo;
                tl++;
            } else {
            ant = null;
            while (aux.getProx() != null && estado.compareTo(aux.getNome()) > 0) // FAZER EM ORDEM CRESCENTE
            {
                ant = aux;
                aux = aux.getProx();
            }
            if (estado.compareTo(aux.getNome()) > 0)            
            {
                aux.setProx(novo); 
                novo.setProx(aux.getProx());
            }               
            
            else
            {
                if(ant != null)                
                    ant.setProx(novo);
                
                else                
                    inicio = novo;
                
                novo.setProx(aux);
            }
            for (int i = 0; i < cidade.length; i++) {
                novo.getPtrCidade().insert(cidade[i]);
            }
            tl++;

        }
       /* if (estado.compareTo(aux.getNome()) != 0) {
            novo.setProx(aux);
            ant.setProx(novo);
            for (int i = 0; i < cidade.length; i++) {
                novo.getPtrCidade().insert(cidade[i]);
            }
            tl++;
        } else {
            for (int i = 0; i < cidade.length; i++) {
                aux.getPtrCidade().insert(cidade[i]);
            }
        }
       
    }
 */
