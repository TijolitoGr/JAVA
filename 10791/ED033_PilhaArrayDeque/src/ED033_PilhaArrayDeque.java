import java.util.ArrayDeque;

public class ED033_PilhaArrayDeque {
    public static void main(String[] args) {
        
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        
        // Obtem e remove o elemento de topo na pilha
        int primeiroElemento = deque.removeFirst();
        System.out.println("Elemento de topo removido: " + primeiroElemento);
        
        // Obtem o elemento de topo na pilha sem o remover
        int elementoTopo = deque.getFirst();
        
        System.out.println("Elemento de topo: " + elementoTopo);
        boolean isEmpty = deque.isEmpty();
        System.out.println("A pilha esta vazia? " + isEmpty);
    }
}
