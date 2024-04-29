import java.util.LinkedList;
import java.util.Queue;

public class ED030_FilaExemplo {
    public static void main(String[] args) {
        // Criação da Fila
        Queue<String> fila = new LinkedList<>();
        
        // Adiciona elementos à fila
        fila.offer("Elemento 1");
        fila.offer("Elemento 2");
        fila.offer("Elemento 3");

        // Obtem e remove o elemento na frente da fila
        String elementoRemovido = fila.poll();
        System.out.println("Elemento da frente removido: " + elementoRemovido);
        
        // Obtem o elemento da frente na fila sem o remover
        String elementoFrente = fila.peek();
        System.out.println("Elemento da frente: " + elementoFrente);
        
        // Apresenta todos os elementos na fila
        System.out.println("Elementos na fila:");
        
        for (String elemento : fila) {
            System.out.println(elemento);
        }
    }
}
