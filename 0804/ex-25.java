//25. Faz um algoritmo que receba números inteiros entre 0 e 100 pelo teclado. A condição de parar deve ser 0 (zero). No final mostre: - Maior número - Menor número - Média dos números.

package exer;

import java.util.Scanner;

class Exer {

    public static void main(String[] args) {
        int num1;
        int num2;
        int med;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o numero mais alto");
        num1 = scanner.nextInt();
        System.out.print("Insira o numero mais baixo");
        num2 = scanner.nextInt();
        med = num1/num2;
        System.out.println("####################");
        System.out.println("O mais alto: " + num1);
        System.out.println("A media dos dois: " + med);
        System.out.println("O mais baixo: " + num2);
        System.out.println("####################");
    }
}
