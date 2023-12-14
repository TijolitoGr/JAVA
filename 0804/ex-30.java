package exer;

import java.util.Scanner;

class Exer { // 30. Escreva um algoritmo que recebe 10 valores, um de cada vez, e mostre:

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num[] = new int[10], par = 0, imp = 0;

        try {

            System.out.println("Insira 10 valores: ");
            for (int i = 0; i < 10; i++) {
                num[i] = scanner.nextInt();
                if ((num[i] % 2) == 1) {
                    imp = imp + 1;

                } else {
                    par = par + 1;
                }
            }
            System.out.println("A quantidade de numeros pares e de: " + par);
            System.out.println("A quantidade de numeros impares e de: " + imp);

        } catch (NumberFormatException e) {
            System.out.println("Not a valid number");
        }

    }

}
