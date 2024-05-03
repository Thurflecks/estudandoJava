import java.util.*;

public class Main {

    public static void main(String[] args) {
        String name;
        int hora;
        double valor;
        double adicional;

        Scanner cs = new Scanner(System.in);

        List<Add> l = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            System.out.println("Insira nome: ");
            name = cs.nextLine();
            System.out.println("Insira hora trabalhadas: ");
            hora = cs.nextInt();
            cs.nextLine();
            System.out.println("Insira Valor por hora: ");
            valor = cs.nextDouble();
            cs.nextLine();
            System.out.println("Insira o adicional : ");
            adicional = cs.nextDouble();
            cs.nextLine();
            l.add(new Add(name, hora, valor, adicional));

        }

        for(Add qualira:l){
            System.out.println(qualira);

        }
        cs.close();

    }

}
