public class Add extends Employ{

    double adicional;

    public Add(String name, int hora, double valor, double adicional){
        super(name, hora, valor);
        this.adicional = adicional;
    }

    @Override
    public double pagamento(){
        return valor * hora + adicional;
    }

    @Override
    public String toString(){
        return "nome: " + name + ", valor recebido mais o adicional: " + pagamento();
    }
}

