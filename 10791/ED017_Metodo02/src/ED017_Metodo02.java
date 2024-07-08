import java.util.Scanner;
public class ED017_Metodo02 {
    static void DizOla() {
        System.out.println("Ola");
    }
    
    static void DizAdeus() {
        System.out.println("Adeus");
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int option;
        
        System.out.println("1 ou 2? ");
        option = Integer.parseInt(entrada.nextLine());
        
        switch(option) {
            case 1:
                DizOla();
                break;
            case 2:
                DizAdeus();
                break;
        }
    }
}

