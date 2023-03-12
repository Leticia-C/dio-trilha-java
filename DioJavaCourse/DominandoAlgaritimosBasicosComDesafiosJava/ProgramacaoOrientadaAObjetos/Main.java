package DominandoAlgaritimosBasicosComDesafiosJava.ProgramacaoOrientadaAObjetos;

import DominandoAlgaritimosBasicosComDesafiosJava.ClasseFilha2;

public class Main {
    public static void main(String[] args) {
        Carro car = new Carro("disel", 50);
        System.out.println(car.gastoComCombustivel(0));

        ClasseMae[] classes = new ClasseMae[] { new ClasseFilha1(), 
            new ClasseFilha2(),  new ClasseMae() };

            for(ClasseMae classe: classes) {
                classe.metodo1();
            }

            for(ClasseMae classe: classes) {
                classe.metodo2();
            }

            ClasseFilha2 classeFilha2 = new ClasseFilha2();
            classeFilha2.metodo2();
    }
} 
