import java.util.Scanner;

public class ED024_Calculadora2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduza o primeiro número: ");
        double num1 = entrada.nextDouble();
        System.out.print("Introduza o segundo número: ");
        double num2 = entrada.nextDouble();

        System.out.print("Escolha a operação (1: Soma, 2: Subtração, 3: Multiplicação, 4: Divisão): ");
        int operacao = entrada.nextInt();
        double resultado = 0;
        switch (operacao) {
            case 1:
                resultado = num1 + num2;
                System.out.println("Resultado da Soma: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("Resultado da Subtração: " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("Resultado da Multiplicação: " + resultado);
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado da Divisão: " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero.");
                }
                break;
            default:
                System.out.println("Operação inválida.");
        }
    }
}
