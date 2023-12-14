package exer;

import java.util.Scanner;

class Exer {

    public static void main(String[] args) {
        int num;
        int result = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um numero maior que 10: ");
        num = scanner.nextInt();

        if ((num > 10) && (num % 2 == 0)) {
            while (result != num) {
                result = result + 2;
                System.out.println(result);
            }

        } else if ((num > 10) && (num % 2 == 1)) {
            num = num - 1;
            while (result != num) {
                result = result + 2;
                System.out.println(result);
            }

        } else {
            System.out.println("Nao foi possivel efetuar nunhuma tarefa");
        }

    }
}
