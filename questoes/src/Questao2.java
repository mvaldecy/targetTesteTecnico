import java.util.ArrayList;

public class Questao2 {
    public static void checkString(String string) {
        String[] stringArr;
        ArrayList<String> stringarrList = new ArrayList<String>();

        stringArr = string.toLowerCase().split("");

        for (int i = 0; i < stringArr.length; i++) {
            stringarrList.add(stringArr[i]);
        }

        int quantidade = stringarrList.stream().filter((i) -> i.equals("a")).toList().size();

        if (quantidade > 0) {
            System.out.println("A letra 'a' ocorre " + quantidade + " vezes");
        } else {
            System.out.println("A letra 'a' não ocorre nenhuma vez.");
        }
        
    }

    public static void main(String[] args) {
        checkString("amigavel");
        checkString("ararA");
        checkString("everton");
    }
}
