import java.util.ArrayDeque;
import java.util.Queue;

public class ED031_FilaArrayDeque {

    public static void main(String[] args) {
        // Criação da Fila
        Queue<String> fila = new ArrayDeque<>();
        
        // Adicionar elementos à fila
        fila.offer("Elemento 1");
        fila.offer("Elemento 2");
        fila.offer("Elemento 3");
        
        // Remover e apresentar elementos da fila
        while (!fila.isEmpty()) {
            System.out.println("Elemento removido: " + fila.poll());
        }
    }
}
