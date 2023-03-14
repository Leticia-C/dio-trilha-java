package DominandoAlgaritimosIntermediariosComDesafiosJava;

import java.io.IOException;
import java.util.Scanner;

public class Animal {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String AN1, AN2, AN3;
        String result = "";

        AN1 = sc.nextLine();
        AN2 = sc.nextLine();
        AN3 = sc.nextLine();

        if (AN1.equals("vertebrado")) {
            if (AN2.equals("mamifero") && AN3.equals("onivoro"))
                result = "homem";
            if (AN2.equals("mamifero") && !AN3.equals("onivoro"))
                result = "vaca";
            if (AN2.equals("ave") && AN3.equals("carnivoro"))
                result = "aguia";
            if (AN2.equals("ave") && !AN3.equals("carnivoro"))
                result = "pomba";
        }
        if (AN1.equals("invertebrado")) {
            if (AN2.equals("inseto") && AN3.equals("hematofago"))
                result = "pulga";
            if (AN2.equals("inseto") && !AN3.equals("hematofago"))
                result = "lagarta";
            if (AN2.equals("anelideo") && AN3.equals("onivoro"))
                result = "minhoca";
            if (AN2.equals("anelideo") && !AN3.equals("onivoro"))
                result = "sanguessuga";
        }
        System.out.println(result);
    }
}
