import java.util.Scanner;
public class ED006_Fumador {
    public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            double anos, por_dia, preco, resultado;
            
            System.out.print("Ha quantos anos fuma?: "); // 5 
            anos = Double.parseDouble(entrada.nextLine());
            System.out.print("Quantos cigarros fuma por dia?: "); // 10 
            por_dia = Double.parseDouble(entrada.nextLine());
            System.out.print("Quanto custa cada carteira?: ");
            preco = Double.parseDouble(entrada.nextLine());
            
            resultado = por_dia * (anos * 365);
            resultado /= 20;
            resultado *= preco;
            System.out.print(resultado + "\n\n");
            
    }
}
