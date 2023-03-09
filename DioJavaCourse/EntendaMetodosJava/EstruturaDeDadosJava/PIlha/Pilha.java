package EntendaMetodosJava.EstruturaDeDadosJava.PIlha;

public class Pilha {
    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public void push(No novoNo){
       No refAuxiliar = refNoEntradaPilha;
       refNoEntradaPilha = novoNo;
       refNoEntradaPilha.setReNo(refAuxiliar);
    }

    public No pop(){
         if(!isEmpty()) {
         No noPoped =  refNoEntradaPilha;
         refNoEntradaPilha = refNoEntradaPilha.getRefNo();
         return noPoped;
         }
         return null;
     }

    public No top(){
        return refNoEntradaPilha;
    }

    public boolean isEmpty() { 
        return refNoEntradaPilha == null ? true : false;
    }
}
