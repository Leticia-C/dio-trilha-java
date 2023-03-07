package EntendaMetodosJava;

public class Mensagem {
    public static void main(String[] args) {
      mensagem(23);
    };

   static void mensagem(int hora) {
     if(hora <= 12) System.out.print("Bom dia");
     if(hora > 12 && hora <= 18 ) System.out.print("Boa tarde");
     if(hora > 18 && hora <= 24 ) System.out.print("Boa Noite");
   }

}
