package DominandoAlgaritimosBasicosComDesafiosJava.ProgramacaoOrientadaAObjetos;
    
public class Carro extends Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private String combustivel;
    private String cor;
    private String quantidadesDePortas;
    private int capacidadeDoTanque;

    Carro(String combustivel, int capacidade) {
        this.combustivel = combustivel;
        this.capacidadeDoTanque = capacidade;
    }

    public String getCombustivel () {
        return this.combustivel;
    }

    public void setCombustivel ( String combustivel) {
        this.combustivel = combustivel;
    }

     public int getCapacidadeDoTanque () {
        return this.capacidadeDoTanque;
    }

    public void setCombustivel ( int capacidade) {
        this.capacidadeDoTanque = capacidade;
    }

    public double gastoComCombustivel( double preco) {
       if( getCombustivel().equals("gasolina")) {
        preco = 2.00;
       }
       if( getCombustivel().equals("alcool")) {
        preco = 1.00;
       }
       if( getCombustivel().equals("disel")) {
        preco = 1.20;
       }
       preco = preco * getCapacidadeDoTanque();
       return preco;
    }
}
