package EstruturasDeRepetiçãoEArraysEmJava.loops;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args)  {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Informe um número");
            int  tabuada = scan.nextInt();
            for (int i = 1; i <= 10; i ++ ) {
                System.out.println( "A Tabuada de "
                 + tabuada + " é :" +  tabuada  + " X " + i + " = " + (tabuada * i));
        }
        }

    }
}
