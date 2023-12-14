package exer;

import java.util.Scanner;

class Exer { // Exer 27 - Escreve um algoritmo que recebe 10 valores, um de cada vez, e que conte quantos deles estão no intervalo [10,20] e quantos estão fora do intervalo.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num, vezes1020 = 0, vezesnao1020 = 0;
        for (int var = 0; var <= 10; var++) {
            System.out.print("Insira um numero 0 a 50: ");
            num = scanner.nextInt();
            if ((num >= 10 && num <= 20)) {
                vezes1020 = vezes1020 + 1;
            } else {
                vezesnao1020 = vezesnao1020 + 1;
            }
        }
        System.out.println("Vezes que o numero foi de 10 a 20: " + vezes1020);
        System.out.println("Vezes que o numero nao foi de 10 a 20: " + vezesnao1020);
    }
}
