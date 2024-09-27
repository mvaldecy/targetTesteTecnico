import java.util.ArrayList;
import java.util.Scanner;


public class Questao1 {
    public static void fibonacci(int num) {
        ArrayList<Integer> sequencia = new ArrayList<Integer>();
        sequencia.add(0);
        sequencia.add(1);

        int i = 0;
        while (sequencia.get(sequencia.size() - 1) < num) {
            sequencia.add(sequencia.get(i) + sequencia.get(i + 1));
            i += 1;
        }

        System.out.println(sequencia);
        boolean pertence = sequencia.contains(num);
        if (pertence) {
            System.out.println("O número pertence a sequencia de fibonacci.");
        } else {
            System.out.println("O número não pertence a sequencia de fibonacci.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean controller = true;
        while (controller) {
            System.out.println("Insira um número: ");
            int numero = scanner.nextInt();
            fibonacci(numero);
            System.out.println("Deseja recomeçar?");
            System.out.println("Sim - Digite qualquer numero e aperte enter.");
            System.out.println("Não - Digite 1 e aperte enter");
            int restart = scanner.nextInt();

            if (restart == 1) {
                controller = false;
            }
 
            
        }
        scanner.close();
    }
}   