package exer;

import java.util.Scanner;

class Exer { // Escreve um algoritmo que leia a altura de 15 pessoas e mostre: - A menor altura do grupo; - A maior altura do grupo.

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int num[] = new int[15], max = 0, min = 888888888;

            System.out.print("Insira 15 alturas: ");
            for (int i = 0; i < 15; i++) {
                num[i] = scanner.nextInt();
            }

            for (int i = 0; i < 15; i++) {
                if (max < num[i]) {
                    max = num[i];
                }
            }

            for (int i = 0; i < 15; i++) {
                if (num[i] < min) {
                    min = num[i];
                }
            }

            System.out.println("O maximo e: " + max);
            System.out.println("O minimo: " + min);

        } catch (NumberFormatException e) {
            System.out.println("Nao foi possivel realizar a tarefa");
        }

    }

}
