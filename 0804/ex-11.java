package Math11;

import java.util.Scanner;

class Math11 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    double nota1;
    double nota2;
    double result;
    
    System.out.print("Insira a primeira Nota: ");
    nota1 = scanner.nextInt();
    System.out.print("Insira a segunda Nota: ");
    nota2 = scanner.nextInt();
    result = (double) ((nota1 + nota2) / 2);
    
    System.out.println("Média: " + result );
        if ( result >= 10 ) {
          System.out.println("Aprovado");
        } else {
          System.out.println("Reprovado");
        }
        
    }

  }
