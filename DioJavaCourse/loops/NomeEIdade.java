package loops;
import java.util.Scanner;

public class NomeEIdade {
    public static void main(String[] args) {
      try (Scanner scan = new Scanner(System.in)) {
        String name ;
        int age ; 

        while (true) {
          
        System.out.println("Nome:");
        name = scan.next();
        if (name.equals("0")) break;
        System.out.println("Idade:");
        age = scan.nextInt();
        System.out.println(age);
        }
      }
      System.out.println("Continua");
    }
}
