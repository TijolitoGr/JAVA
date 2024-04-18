import java.util.Scanner;
public class ED007_Latao {
    public static void main(String[] args) {
        /*  Sabendo que o latão é constituído por 70% de cobre e 30% zinco:
        Perguntar o peso de latão que o utilizador deseja;
        Informar o peso de cobre necessário;
        Informar o peso de zinco necessário. */
        
        Scanner entrada = new Scanner(System.in);
        double kg_latao, kg_cobre, kg_zinco;
                
        System.out.print("Quanto kg de latao quer?: ");
        kg_latao = Double.parseDouble(entrada.nextLine());
        kg_cobre = kg_latao * 0.7;
        kg_zinco = kg_latao * 0.3;
        
        System.out.println("\nKG de Latao: " + kg_latao + "\nKG de Cobre: " + kg_cobre + "\nKG de Zinco: " + kg_zinco + "\n\n");
    }
}
