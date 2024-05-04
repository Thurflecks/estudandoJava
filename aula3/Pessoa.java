public abstract class Pessoa {
    private String nome;
    private int idade;
   

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String Setnome(String nome){
        this.nome = nome;
        return this.nome;

    }

    public String Getnome(){
        return this.nome;
    }

    public int Getidade(){
        return this.idade;
    }

    public abstract String vasco(String nome);

    
    

}
