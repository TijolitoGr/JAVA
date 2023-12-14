import java.util.Scanner;

class Aula {

  public static void main(String[] args) {

    int numero;
    int dobro;
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Inserir um numero: ");
    numero = scanner.nextInt();
    dobro = ( numero * 2 );
    System.out.println("O dobor desse numero e: " + dobro );

  }

}
