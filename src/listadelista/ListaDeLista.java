
package listadelista;

public class ListaDeLista
{

    public static void main(String[] args)
    {
        ListaEstado le = new ListaEstado();
        le.insert("São Paulo", "Presidente Prudete", "Martinopolis");
        le.insert("São Paulo", "Assis");
        le.insert("São Paulo", "Regente Feijo", "Bauru");
        le.insert("Rio de Janeiro", "Rio de Janeiro", "Frio de Janeiro");
        le.insert("Amazonas", "Taboca do Indio 1");
        le.insert("Acre", "Rio Branco", "Terra dos Dino");
        le.exibirTodos();
        
        //ARRUMAR ORDENAÇÃO
    }
    
}
