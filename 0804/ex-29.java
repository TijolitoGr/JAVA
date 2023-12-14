package exer;

class Exer { //  29. Escreve um algoritmo que escreva os números ímpares entre 100 e 200.

    public static void main(String[] args) {
        try {

            int min = 100, max = 200;

            for (int i = min; i < max; i++) {

                int r = (i % 2);
                if (r == 1) {
                    System.out.println(i);
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Nao foi possivel realizar a tarefa");
        }

    }

}
