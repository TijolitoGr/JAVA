import java.util.ArrayList;
import java.util.List;

public class ED029_Lista {

    public static void main(String[] args) {
        // Cria uma lista de strings
        List<String> lista = new ArrayList<>(); 
        
        // Adiciona elementos à lista
        lista.add("batatas");
        lista.add("cebolas");
        lista.add("cenouras");
        
        // Imprime os elementos da lista
        System.out.println("Elementos da lista:");
        
        for (String elemento : lista) {
            System.out.println(elemento);
        
        }
    }
}
