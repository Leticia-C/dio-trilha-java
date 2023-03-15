package TratamentoDeExceçõesEmJava;

import javax.swing.*;;

public class UncheckedException {
    public static void main(String[] args) {
        Boolean condition = true;
        do {
            String a = JOptionPane.showInputDialog(null, "Numerador:");
            String b = JOptionPane.showInputDialog(null, "Denominador:");
            try {
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.print("Resultado" + resultado);
                condition = false;
            } catch (NumberFormatException e) {
                System.out.println("Coloque valor válido!");
            }  catch (ArithmeticException e) {
                System.out.println("Não é possivel realizar divisão um número por 0");
            }
        } while (condition);
    }

    public static int dividir(int a, int b) {
        return a / b;
    }
}
