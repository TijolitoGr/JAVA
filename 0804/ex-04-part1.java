import java.util.Scanner;

class Aula {

  public static void main(String[] args) {

    int ano_nascimento;
    int ano_atual;
    int idade;
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Nasceu em: ");
    ano_nascimento = scanner.nextInt();
    System.out.println("Ano Atual: ");
    ano_atual = scanner.nextInt();
    idade = (ano_atual - ano_nascimento);
    System.out.println("Idade: " + idade );

  }

}
