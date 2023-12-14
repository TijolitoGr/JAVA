import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
    int num;
    
        System.out.print("Insira um numero: ");
        num = scanner.nextInt();
        if ( num >= 0 ) { 
          System.out.println("Positivo");
        } else {
          System.out.println("Negativo");
        }
    }

  }
