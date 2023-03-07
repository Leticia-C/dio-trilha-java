package loops;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int nota;

            System.out.println("Nota: ");
            nota = scan.nextInt();

            while (nota > 10 || nota < 0) {
                System.out.println("Nota inválida !");
                System.out.println("Nota: ");
                nota = scan.nextInt();
            }
        }
    }
}
