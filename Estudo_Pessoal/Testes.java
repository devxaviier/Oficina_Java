import java.util.InputMismatchException;
import java.util.Scanner;

public class Testes {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int numero = 0;
        boolean valido = true;

        do {

            try {
                System.out.print("Digite um numero: ");
                numero = ler.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Ops... você digitou caracteres. Precisamos que digite apenas números.");
            }
            ler.nextLine(); // limpa o buffer

        } while (!valido);

        System.out.println(numero);


        ler.close();
    }
}