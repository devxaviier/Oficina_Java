import java.util.Scanner;

public class ExercicioScanner1 {

    public static void main(String[] args) {
        
        int id1;
        int id2;
        String nome1;
        String nome2;

        Scanner demaioScanner = new Scanner(System.in);

        System.out.println("Digite o nome da Pessoa 1: ");
        nome1 = demaioScanner.nextLine();

        System.out.println("Digite o nome da Pessoa 2: ");
        nome2 = demaioScanner.nextLine();

        System.out.println("Digite a idade 1: ");
        id1 = demaioScanner.nextInt();

        System.out.println("Digite a idade 2: ");
        id2 = demaioScanner.nextInt();


        demaioScanner.close();

        if (id1 >= 18) {
            System.out.println("O(a) " + nome1 + "é maior de idade!");
        } else {
            System.out.println("O(a)" + nome1 + "é menor de idade!");
        }

        if (id2 >= 18) {
            System.out.println("O(a) " + nome2 + "é maior de idade!");
        } else {
            System.out.println("O(a)" + nome2 + "é menor de idade!");
        }

    }
}