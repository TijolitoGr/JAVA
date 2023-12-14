package exer;

import java.util.Scanner;

class Exer { // 32. Ler dois valores para as variáveis A e B e efetuar a troca dos valores de forma que a variável A passe a possuir o 
    // valor da variável B e a variável B passe a possuir o valor da variável A. Apresentar os valores após a efetivação do 
    // processamento da troca.

    public static void main(String[] args) {

        try {
            int A, B, tempA;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Insira dois valores, respetivamente sendo eles A e B.");
            A = scanner.nextInt();
            B = scanner.nextInt();
            tempA = A;
            A = B;
            B = tempA;

            System.out.println("Os valores de A e B invertidos e de : " + A + " e " + B);

        } catch (NumberFormatException e) {
            System.out.println("Nao foi possivel realizar a tarefa. Tente novamente mais tarde. Obrigado pela preferencia.");
        }

    }

}
