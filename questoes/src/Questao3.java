public class Questao3 {
    
    public static void main(String[] args) {
        int indice = 12;
        int SOMA = 0;
        int K = 1;

        while(K < indice) {
            K += 1;
            SOMA += K;
        }

        System.out.println(SOMA);
    }
}
