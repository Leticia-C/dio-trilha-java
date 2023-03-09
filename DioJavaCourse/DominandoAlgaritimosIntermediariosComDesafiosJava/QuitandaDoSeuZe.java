package DominandoAlgaritimosIntermediariosComDesafiosJava;

import java.util.*;

public class QuitandaDoSeuZe {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int morangos = input.nextInt();
        int macas = input.nextInt();
        double price = 0;
        int total = macas + morangos;
        double valorMorango = morangos <= 5 ? morangos * 2.50
                : macas * 2.20;
        double valorMaca = macas <= 5 ? macas * 1.80
                : macas * 1.50;
        price = valorMaca + valorMorango;
        if (total > 8 || price > 25.00) {
            price = price - ((10.0 / 100.0) * price);
        }

        System.out.print(price);
        // TODO: Implemente as condições necessárias para retornar o preço a ser pago
        // pelo cliente, conforme a tabela de preços do seu Zé:

    }
}
