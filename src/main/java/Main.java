
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numero;

        numero = leia.nextInt();
        if (numero % 2 == 0) {
            numero += 1;
        }
        for (int i = 0; i < 6; i++) {
            System.out.println(numero);
            numero += 2;
        }
    }
}
