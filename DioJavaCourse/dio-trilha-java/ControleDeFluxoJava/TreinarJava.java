package ControleDeFluxoJava;

public class TreinarJava {
    public static void main(String[] args) {
        mesDoAno(8);
        printDayOfWeaak("Domingo");
        isFerias("Abril");
    }

    private static void mesDoAno(int mes) {
        if (mes == 1) System.out.print("Janeiro");
        if (mes == 2) System.out.print("Fereiro");
        if (mes == 3) System.out.print("Março");
        if (mes == 4) System.out.print("Abril");
        if (mes == 5) System.out.print("Maio");
        if (mes == 6) System.out.print("Junho");
        if (mes == 7) System.out.print("Julho");
        if (mes == 8) System.out.print("Agosto");
        if (mes == 9) System.out.print("Setembro");
        if (mes == 10) System.out.print("Outubro");
        if (mes == 11) System.out.print("Novembro");
        if (mes == 12) System.out.print("Dezembro");
    }

    private static void isFerias(String mes) {
        switch (mes) {
            case "Janeiro":
                System.out.print("Ferias");
                break;
            case "Julho":
                System.out.print("Ferias");
                break;
                case "Dezembro":
                System.out.print("Ferias");
            default:
            System.out.print("Não é Ferias");
                break;
        }
    }

    private static void printDayOfWeaak(String diaDaSemana) {
        switch (diaDaSemana) {
            case "Segunda":
                System.out.println(1);
                break;
            case "Terça":
                System.out.println(2);
                break;
            case "Quarta":
                System.out.println(3);
                break;
            case "Quinta":
                System.out.println(4);
                break;
            case "Sexta":
                System.out.println(5);
                break;
            case "Sábado":
                System.out.println(6);
                break;
            case "Domingo":
                System.out.println(5);
                break;
            default:
                System.out.println("Looking forward to the Weekend");
        }

    }

}
