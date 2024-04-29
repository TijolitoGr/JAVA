import java.util.ArrayList;
import java.util.List;

public class ED036_ListaApp3 {
    public static void main(String[] args) {
        
        // Criação da Lista
        List<String> lista = new ArrayList<>();

        // Adição de Elementos para à Lista
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        lista.add("Elemento 3");
        
        // Output de todos os Elementos da Lista
        System.out.println("Elementos da lista:");
        for (String elemento : lista) {
            System.out.println(elemento);
        }
        
        // Criação de uma variavel inteira com um valor do tamanho da Lista (Numero de Elementos). Depois faz o seu Output
        int tamanho = lista.size();
        System.out.println("Tamanho da lista: " + tamanho);
        
        // Variavel para detetar se a lista contem o "Elemento 2", retorna falso ou verdadeiro;
        boolean contemElemento = lista.contains("Elemento 2");
        System.out.println("A lista contem 'Elemento 2'? " + contemElemento);
        
        // Apagar um Elemento da Lista com uma mensagem
        System.out.println("A apagar o 'Elemento 2'... ");
        lista.remove("Elemento 2");
        
        // Resultado de tudo
        System.out.println("Elementos da lista apos remocao:");
        for (String elemento : lista) {
            System.out.println(elemento);
        }
    }
}
