package exer;

import java.util.Scanner;

class Exer { // 33. Elaborar um programa que calcule e apresente o valor do volume de uma caixa retangular, utilizando a fórmula 
    // VOLUME <- COMPRIMENTO x LARGURA x ALTURA.

    public static void main(String[] args) {

        try {

            Scanner scanner = new Scanner(System.in);
            int num[] = new int[3], result; // 1 = COMPRIMENTO, 2 = LARGURA, 3 = ALTURA
            System.out.println("Insira os 3 valores, comprimento, largura e altura, respetivamente: ");
            for (int i = 0; i < 3; i++) {
                num[i] = scanner.nextInt();

            }

            result = num[0] * num[1] * num[2];
            System.out.println("O resultado desse Paralelepipedo e de: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Nao foi possivel realizar a tarefa. Tente novamente mais tarde. Obrigado pela preferencia.");
        }

    }

}
