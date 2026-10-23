import java.util.Scanner;

public class ExercicioScanner2 {
    public static void main(String[] args) {

        Scanner notaScanner = new Scanner(System.in);

        float nota;

        System.out.println("Digite a nota: ");
        nota = notaScanner.nextFloat();

        notaScanner.close();


        if (nota <=2.9) {
            System.out.println("Você tirou: II");
        } else if (nota <= 4.9) {
            System.out.println("Você tirou: MI");
        } else if(nota <= 6.9) {
            System.out.println("Você tirou: MM");
        } else if(nota <8.9){
            System.out.println("Você tirou: MS");
        } else if(nota <=10){
            System.out.println("Você tirou: SS");
        } else {
            System.out.println("ERRO: Nota não reconhecida.");
        }
        

    }
}
