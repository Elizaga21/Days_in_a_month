import java.util.Scanner;

public class For_ejercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N1, N2;

        do { System.out.print("Introduce un número: ");
         N1 = sc.nextInt();
        System.out.print("Introduce otro número: ");
         N2 = sc.nextInt();
         if (N1 >= N2){
             System.out.println("El segundo número debe ser mayor que el primero");
         }
        } while (N1 >= N2);

        System.out.println("Números pares desde " + N1 + " hasta " + N2 + " : ");
        for (int i = N1; i <= N2; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }


    }
}
