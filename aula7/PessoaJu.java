public class PessoaJu extends Conta{

    private int funcionarios;
    

    public PessoaJu(){

    }

    public PessoaJu(String nome, double rendaAnual, int funcionarios){
        super(nome, rendaAnual);
        this.funcionarios = funcionarios;
    }
    
    @Override
    public double imposto(){
        double porcentagem = 0.16;
        if (funcionarios > 10){
            porcentagem = 0.14;
        }
        return getRendaAnual() * porcentagem;
    }

    public String toString(){
        return "Nome: " +getNome() + " e o imposto é: " + this.imposto() ;
    }
    
}
