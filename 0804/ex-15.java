import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args ) {
       int salario;
       int atua;

       Scanner scanner = new Scanner(System.in);

       System.out.print("Insira o Salario");
       salario = scanner.nextInt();

        if ((salario <= 525) ) {
        atua = (int) (salario*0.1);
        salario = (salario + atua); 
        System.out.println("O salario e de: " + salario);
        } else if ( salario >= 525 ) {
        atua = (int) (salario*0.15);
        salario = (salario + atua); 
        System.out.println("O salario e de: " + salario);
        
        }
    }
}
