public class ED018_Metodo03 {
    static void meuMetodo(String nome) { // Função meuMetodo recebendo a variavel e executando o codigo
        System.out.println(nome + " Silva"); // Cada vez que a Função é chamada é recebido uma variavel com um nome e depois ele é expelido
    }
    
    public static void main(String[] args) {
        
        // Chamada de Funções enviando as respetivas variáveis.
        meuMetodo("Maria");
        meuMetodo("Jose");
        meuMetodo("Antonio");
    }
}