package ExerciciosArray;

public class Percurso {
    public static void main(String[] args) {
        
        int[] v = {10, 20, 30, 40, 50};

        //quando precisa do indice
        for(int i = 0; i < v.length; i++) {
            System.out.println(i + ":" + v[i]);
        }

        //for-each: quando não precisa do índice
        for (int i : v) {
            System.out.println(i);
        }
    }
}
