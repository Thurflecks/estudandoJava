public class PessoaFi extends Conta{

    private double gastosSaude;
    

    public PessoaFi(){

    }
    public PessoaFi(String nome, double rendaAnual, double gastosSaude){
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    @Override
    public double imposto(){
        return (0.15 * getRendaAnual()) - (gastosSaude * 0.5);
    }

    public String toString(){
        return "Nome: " +getNome() + " e o imposto é: " + this.imposto() ;
    }
    
}
