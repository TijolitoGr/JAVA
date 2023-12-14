
import java.util.Scanner;

public class Exer {

    public static void main(String[] args) {
        int opcao, total;
        String nomes[];
        String procurar;
        boolean econtrou;
        Scanner scanner = new Scanner(System.in);
        System.out.println("insira a quantidade de nomes");
        total = scanner.nextInt();
        nomes = new String[total];

        do {

            System.out.println("--------Menu--------");
            System.out.println("1- Registrar nome");
            System.out.println("2- pesquisar nomes");
            System.out.println("3- Listar todos os nomes");
            System.out.println("4- Sair");
            System.out.println("Selecionar opção");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1: {
                    scanner.nextLine();
                    for (int i= 0; i < nomes.length; i++){
                        System.out.println("insira o nome " + i);
                        nomes[i]= scanner.nextLine();
                    }
                }break;
                case 2: {
scanner.nextLine();
                    econtrou=false;
                    System.out.println("insira o nome que quer procurar");
                    procurar= scanner.next();

                    for (int i = 0; i<nomes.length; i++){

                        if (nomes[i].equals(procurar)){
                            econtrou= true;
                        }

                    }
                    if (econtrou== true){
                        System.out.println("o nome foi econtrado");
                    }else {
                        System.out.println("o nome não foi econtrado");
                    }


                }break;
                case 3: {
                    scanner.nextLine();
                    System.out.println("---------Lista de nomes----------");
                    for (int i=0;i < nomes.length;i++){
                        System.out.println(nomes[i]);

                    }
                    break;
                }
            }
        } while (opcao != 4);
    }

}
