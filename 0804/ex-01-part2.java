import java.util.Scanner;

public class Exer {

    public static void main(String[] args) {

        int[] numeros = new int[10];
        int procurar;
        boolean encontrou = false;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Insira o numero para a posicao " + i + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Insira o número que pretende procurar: ");
        procurar = scanner.nextInt();

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == procurar) {
                encontrou = true;
            }
        }

        if (encontrou == true) {
            System.out.println("O numero foi encontrado");
        } else {
            System.out.println("O numero nao foi encontrado");
        }
    }
}
