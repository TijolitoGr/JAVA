package exer;

import java.util.Scanner; // 1,2,3,4 = voto para os respectivos candidatos; 5 = voto nulo; 6 = voto em branco;

class Exer { // 34. Em uma eleição presidencial existem quatro candidatos. Os votos são informados através de códigos. 
    // Os dados utilizados para a contagem dos votos obedecem à seguinte codificação:

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int voto;

        System.out.println("Quem ira votar: ");
        System.out.println("1. Fransisco Pinto");
        System.out.println("2. Andre Massa");
        System.out.println("3. Martim Cabral");
        System.out.println("4. Daniel Terceira");
        System.out.println("5. Marcar voto nulo");
        System.out.println("6. Marcar voto em branco");
        
        voto = scanner.nextInt();

        switch (voto) {
            case '1' -> {
                System.out.println("Obrigado por votar para presidente o Fransisco Pinto");
            }
            case '2' -> {
                System.out.println("Obrigado por votar para presidente o Andre Massa");
            }
            case '3' -> {
                System.out.println("Obrigado por votar para presidente o Martim Cabral");
            }
            case '4' -> {
                System.out.println("Obrigado por votar para presidente o Daniel Terceira");
            }
            case '5' -> {
                System.out.println("O seu voto agora é nulo");
            }
            case '6' -> {
                System.out.println("O seu ficou em branco");
            }
            default -> {
                break;
            }
        }
    }
}
