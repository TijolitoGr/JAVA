import java.util.Stack;

public class Exer {

    public static void main(String[] args) {
        Stack<String> tarefas = new Stack<>();

        // Adicionar elementos à pilha
        tarefas.push("jogar");
        tarefas.push("dormir");
        tarefas.push("comer");

        System.out.println("Pilha: " + tarefas);
    }
}
