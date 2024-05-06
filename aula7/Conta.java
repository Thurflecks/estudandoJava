public abstract class Conta {

    private String nome;
    private double rendaAnual;

    public Conta(){

    }

    public Conta(String nome, double rendaAnual){
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public double getRendaAnual(){
        return this.rendaAnual;
    }

    public String getNome(){
        return this.nome;
    }

    public abstract double imposto();


}
