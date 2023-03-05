package EstruturasDeRepetiçãoEArraysEmJava.loops;

import java.util.*;

public class MaiorQue {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int numero;
            int count = 0;
            int maior = 0;
            int media = 0;
 
      do{
            System.out.println("Nota: ");
            numero = scan.nextInt();
            if (numero > maior) maior = numero;
            media += numero;
            count ++;
     
      }while(count < 5);
      media = media / count;
      System.out.println(maior);
      System.out.println(media);
        }
    }

}
