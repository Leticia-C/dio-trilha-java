package DominandoAlgaritimosIntermediariosComDesafiosJava;

// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 

// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  

import java.io.IOException;
import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double C = leitor.nextDouble();
        double maior;
        double soma;
        boolean triangulo;

        if (A > B && A > C) {
            maior = A;
            soma = B + C;
        }
        else if (A < B && B > C) {
            maior = B;
            soma = A + C;
        } else {
            maior = C;
            soma = A + B;
        }

        
        if (soma > maior) {
            triangulo = true;
            System.out.print("Perimetro = " + (soma + maior));
        } else  {
            triangulo = false;
            System.out.print("Area = " + ((A + B) * C) / 2);
        }
    }

}