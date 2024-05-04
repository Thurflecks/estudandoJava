public class Visitante {
    private String nome;
    private int idade;
    private String modeloCarro;
    private String placaCarro;
    private String vaga;

    public Visitante(String nome, int idade, String modeloCarro, String placaCarro, String vaga){
        this.nome = nome;
        this.idade = idade;
        this.modeloCarro = modeloCarro;
        this.placaCarro = placaCarro;
        this.vaga = vaga;
    }
    public String toString(){
        return ("o nome do fdp é " + this.nome + ", ele tem " + this.idade + " ANOS. O modelo do seu carro é " + this.modeloCarro + " com placa " + this.placaCarro + " e esta estacionado na vaga " + this.vaga );
    }





    
    
}
