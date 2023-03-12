package DominandoAlgaritimosBasicosComDesafiosJava;

import DominandoAlgaritimosBasicosComDesafiosJava.ProgramacaoOrientadaAObjetos.ClasseMae;

public class ClasseFilha2 extends ClasseMae {
    @Override
    protected
    void metodo1() {
        System.out.println("Metodo 1 classe Filha2");
        super.metodo1();
    }
    @Override
    public
    void metodo2() {
        System.out.println("Metodo 2 classe Filha2");
        super.metodo2();
    }
}
