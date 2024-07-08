import java.util.Scanner;

public class ED021_Entrada {
    static void Disco(String nome, int idade) {
        
        if (idade < 18) {
            int conta = 18 - idade;
            System.out.println(nome + ", nao podes entrar porque es menor, faltate " + conta + " anos");
        } else if (idade >= 18) {
            System.out.println("PODE ENTRAR " + nome + ", YUIPPPIIE");
        }
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String nome;
        int idade;
        
        System.out.print("Insira o seu nome:  ");
        nome = entrada.nextLine();
        
        System.out.print("\nInsira a sua Idade:   ");
        idade = Integer.parseInt(entrada.nextLine());
        
        Disco(nome, idade);
    }
}