package exer47;

import java.util.Scanner; //Escreve um algoritmo que leia um número não determinado de valores e calcule a média dos valores lidos, a quantidade de valores positivos, a quantidade de valores negativos 
// e a percentagem de valores negativos e positivos. Mostre os resultados.

public class Exer47 {

    public static void main(String[] args) {
        int numero[] = new int[5];
        int med = 0, pos = 0, neg = 0, per = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira 5 numeros: ");
        for (int i = 0; i <= 4; i++) {
            numero[i] = scanner.nextInt();
            med = med + numero[i];
            
            if (numero[i] >= 0) {
                pos = pos + 1;
            } else {
                neg = neg + 1;
            }
        }

        System.out.println("#####################################");
        med = med/5;
        System.out.println("A media e de: " + med);
        System.out.println("A quantidade de numeros positivos e de: " + pos);
        System.out.println("A quantidade de numeros negativos e de: " + neg);
        per = (pos * 100) / 5;
        System.out.println("A percentagem de numeros positivos e de: " + per);
        per = (neg * 100) / 5;
        System.out.println("A percentagem de numeros negativos e de: " + per);
        System.out.println("#####################################");
    }

}
