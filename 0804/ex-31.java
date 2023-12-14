package exer;

import java.util.Scanner;

class Exer { // 31. Pedro comprou um saco de ração com peso em quilos. Ele possui dois gatos, para os quais fornece a quantidade de ração. 
    // A quantidade diária de ração fornecida para cada gato é sempre a mesma. Faça um programa que receba o peso do saco de ração 
    // e a quantidade de ração fornecida para cada gato, calcule e mostre quanto restará de ração no saco após cinco dias.

    public static void main(String[] args) {

        try {

            Scanner scanner = new Scanner(System.in);
            int bag, feed, daysleft, cats;

            System.out.print("Insira o peso do Saco (kg): ");
            bag = scanner.nextInt();
            System.out.print("Insira o peso de comida para cada gato (kg): ");
            feed = scanner.nextInt();
            System.out.print("Insira a quantidade de dias que a Saco foi usado: ");
            daysleft = scanner.nextInt();
            System.out.print("Insira a quantidade de gatos: ");
            cats = scanner.nextInt();
            
            int r = (bag - (cats * feed * daysleft));
            if (r > 0) {
                System.out.println("Ha " + r + "kg restantes");
            } else {
                System.out.println("Sera preciso mais (" + r + "kg)");
            }
            
        } catch (NumberFormatException e) {
            System.out.println("Nao foi possivel realizar a tarefa. Tente novamente mais tarde. Obrigado pela preferencia.");
        }

    }

}
