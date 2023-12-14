import java.util.Scanner;

class Aula {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    
    int comprimento;
    int largura;
    int area;
    
    System.out.println("Insira o comprimento ");
    comprimento = scanner.nextInt();
    System.out.println("Insira a largura: ");
    largura = scanner.nextInt();
    area = comprimento * largura;
    System.out.println("Perimetro e de: " + area);

  }

}
