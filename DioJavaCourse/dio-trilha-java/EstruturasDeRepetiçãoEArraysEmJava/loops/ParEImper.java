package EstruturasDeRepetiçãoEArraysEmJava.loops;

import java.util.Scanner;

public class ParEImper {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int count = 0;
            int number = 0;
            int par = 0;
            int impar = 0;

            while (count < 10) {
            System.out.print("Coloque um numero");    
            number = scan.nextInt();
             if( number %2 == 0) par ++;
             else impar ++;
                count ++;
            }
            System.out.printf("Numeros pares: ".concat(" ") +   par + "  ");
            System.out.printf("Numeros impares: ".concat(" ") +   impar + "  ");
        }
    }
}
