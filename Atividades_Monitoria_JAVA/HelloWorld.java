//biblioteca do Scanner
import java.util.Scanner;



public class HelloWorld {
    public static void main(String[] args) {
 
       //inicialização do scanner
       Scanner scanner = new Scanner(System.in);

       //declaração de váriaveis
       int n1;
       float n2;
       String name;

       //String
       System.out.println("Digite seu nome: ");
       name = scanner.nextLine();

       //int (scanner minusculo é uma instância)
       System.out.println("Digite um valor: ");
       n1 = scanner.nextInt();

       //float
       System.out.println("Digite um valor decimal: ");
       n2 = scanner.nextFloat();

       
       //condição se e senão (if e else) | OU (OR) = || - E (AND) = &&
       if(n1 > n2 && name.equals("Theo")){
        System.out.println("True");
       } else {
        System.out.println("False");
       }

      
       //estrutura de repetição FOR
       int x = 4;
       int y = x + 2;

       for (int i = 0; i < x; i++) {
            y = y + i;
            System.out.println(x + " " + i + " " + y);
       }
       

       //estrutura de repetição
       int a = 5;
       int b = 0;

       while (a > 2) {
        System.out.println();
        b = b + a;
        a = a - 1;
       }

       scanner.close();
    }

  }


