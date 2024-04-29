import java.util.ArrayList;
import java.util.List;

public class ED035_ListaApp2 {

    public static void main(String[] args) {
        // Cria uma lista de strings
        List<String> lista = new ArrayList<>(); 
        
        // Adiciona elementos à lista
        lista.add("919 856 713");
        lista.add("234 342 198");
        lista.add("923 898 123");
        lista.add("918 789 723");
        lista.add("237 243 746");
        
        // Imprime os elementos da lista
        System.out.println("Numeros da lista:");
        
        for (String elemento : lista) {
            System.out.println(elemento);
        }
    }
}
