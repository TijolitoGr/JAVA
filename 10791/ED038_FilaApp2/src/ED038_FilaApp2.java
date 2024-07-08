import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*   10 - Um banco deseja implementar um sistema de atendimento que utiliza filas para organizar
clientes. O sistema deve permitir a chegada de novos clientes, o atendimento dos clientes pela
ordem de chegada e reportar o número total de clientes atendidos. Implemente uma solução em Java
que utilize filas para gerir este sistema. ED038_FilaApp2   */

public class ED038_FilaApp2 {
    public static void main(String[] args) {
        // Declaração de Variaveis
        Scanner entrada = new Scanner(System.in);
        Queue<String> fila = new LinkedList<>();
        int opcao = -1;
        
        do { // Menu de Opcoes
            System.out.println("1 - Bilhete Novo");
            System.out.println("2 - Atender Cliente");
            System.out.println("3 - Quantos Clientes Existe?");
            System.out.println("0 - Sair");
            System.out.println("\nOPCAO: ");
            
            // Insercao da opcao
            opcao = Integer.parseInt(entrada.nextLine());
            
            // Saber quantos clientes há. Comando usado em 2 casos
            int numero_de_clientes = fila.size();
            
            // O Funcionamento de Cada Função em Switch:
            switch (opcao) {
                
                // Adicionar alguem na fila:
                case 1:
                    System.out.print("\nInsira o Nome Da Pessoa: ");
                    String bilhete =  entrada.nextLine();
                    fila.offer(bilhete);
                    break;
                    
                // Remover alguem da fila:
                case 2:
                    if (numero_de_clientes == 0) {
                        System.out.println("Nao ha nenhum cliente para ser atendido!");
                        break;
                    } else {
                        String proximo = fila.peek();
                        System.out.println(proximo);
                        fila.remove();
                        System.out.println(proximo + " Foi Atentido!");
                        break; 
                    }

                // Reportar o numero de Clientes. Detetar se há ou não Clientes. Se houver dizer quantos há
                case 3:                    
                    if (numero_de_clientes == 0) {
                        System.out.println("Nao ha Clientes!");
                    } else if (numero_de_clientes >= 1) {
                        System.out.println("Quantidade de Clientes: " + numero_de_clientes);
                    }
                    break;
            }
        // Caso o user meter 0 como opcao o programa irá ser encerrado.
        } while(opcao != 0);
    }
}
