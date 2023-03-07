package EntendaMetodosJava;
public class Calculadora {
    public static void main(String[] args) {
        calculadora('-');
    };

public static double soma(double n1, double n2) {
  return  n1 + n2;
}; 

public static double subtracao(double n1, double n2) {
    return  n1 - n2;
}; 

public static double divisao(double n1, double n2) {
    return  n1 / n2;
}; 

public static double multiplicacao(double n1, double n2) {
    return  n1 * n2;
}; 

public static void calculadora(char simbolo) {
   double result = 0;
   if (simbolo == '+')  result = soma(23.00, 12.15);
   if (simbolo == '-')  result = subtracao(23.00, 12.15);
   if (simbolo == '/')  result = divisao(23.00, 12.15);
   if (simbolo == '*')  result = multiplicacao(23.00, 12.15);
   System.out.print(" O resultado da conta é " + result + "  ");
}; 
}