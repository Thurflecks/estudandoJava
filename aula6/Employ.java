public class Employ {
    protected String name;
    protected int hora;
    protected double valor;
    
    public Employ(String name, int hora, double valor){
        this.name = name;
        this.hora = hora;
        this.valor = valor;
    }
    public Employ(){

    }

    public double pagamento(){
        return hora * valor;
    }

    public String toString(){
        return "nome: " + name + ", valor recebido: " + pagamento();
    }
}
