import java.util.Scanner

class Aula {

  public static void main(String[] args) {

    int peso;
    int altura;
    int imc;
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Insira o peso:");
    peso = scanner.nextInt();    
    System.out.println("Insira a altura");
    altura = scanner.nextInt();
    
    imc = ( (peso / altura) * 2 );
    System.out.println("IMC e de " + imc );

  }

}
