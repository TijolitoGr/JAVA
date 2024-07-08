import java.util.Stack;

public class ED032_PilhaExemplo {
    public static void main(String[] args) {
        
        // Criação da Pilha
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        // Obtem e remove o elemento de topo na pilha
        int elementoRemovido = stack.pop();
        System.out.println("Elemento de topo removido: " + elementoRemovido);
        
        // Obtem o elemento de topo na pilha sem o remover
        
        int elementoTopo = stack.peek();
        System.out.println("Elemento de topo: " + elementoTopo);
        
        boolean isEmpty = stack.isEmpty();
        System.out.println("A pilha esta vazia? " + isEmpty);
    }
}
