import java.util.Scanner;

public class JavaCalculator {
    public static void main(String[] args ) {
       int primeiro;
       int segundo;
       int result;
       char sinal;

       System.out.println("Calcular um calculo");
       Scanner scanner = new Scanner(System.in);

       System.out.print("Insira o primeiro numero");
       primeiro = scanner.nextInt();
       System.out.print("Insira o segundo numero");
       segundo = scanner.nextInt();
       System.out.print("Insira o sinal de operacao");
       sinal = (char) scanner.next().charAt(0);

        switch (sinal) {
            case '+' -> {
                result = primeiro + segundo;
            }
            case '-' -> {
                result = primeiro - segundo;
            }
            case '*' -> {
                result = primeiro * segundo;
            }
            case '/' -> {
                result = primeiro / segundo;
            }
            default -> {
                result = 0;
            }
        }
        
        System.out.println("Resultado: " + result);
    }
}
