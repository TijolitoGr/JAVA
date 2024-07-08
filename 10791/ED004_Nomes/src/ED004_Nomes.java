import java.util.Scanner;

public class ED004_Nomes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String name1, name2;

        System.out.println("Insira o Nome [1]: ");
        name1 = entrada.nextLine();
        System.out.println("Insira o Nome [2]: ");
        name2 = entrada.nextLine();
        
        System.out.println("Os dois Nomes sao: " + name1 + " e " + name2);
        
    }    
}
