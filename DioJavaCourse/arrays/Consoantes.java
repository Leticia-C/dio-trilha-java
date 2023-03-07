package arrays;

import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {
     try (Scanner scan = new Scanner(System.in)) {
        String[] consoantes = new String[6];
          int quantidaDeDeConsolantes = 0;
          int count = 0;
          do{
            System.out.println("Digite uma letra");
            String letra = scan.nextLine();
            if(!(letra.equalsIgnoreCase("a") |
            letra.equalsIgnoreCase("e") |
            letra.equalsIgnoreCase("i") |
            letra.equalsIgnoreCase("o") |
            letra.equalsIgnoreCase("u") )
            ) {
                quantidaDeDeConsolantes ++;
                consoantes[count] = letra;
            }

            count ++;
          }while(count < consoantes.length);
          System.out.println("A quantidade de consoantes é  " + quantidaDeDeConsolantes);

          for (String consoante : consoantes) {
            if( consoante != null) System.out.println(consoante + "  ");
          }
    }
     
      }
}
