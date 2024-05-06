import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Conta> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("quantos usuarios? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("qual o tipo de conta (fisica = 1 / juridica = 2)? ");
            int selecionada = sc.nextInt();
            sc.nextLine();
            System.out.println("qual o nome? ");
            String nome = sc.nextLine();
            System.out.println("qual a renda anual? ");
            double rendaAnual = sc.nextDouble();
            sc.nextLine();
            if (selecionada == 1) {
                System.out.println("qual seu gasto com saude? ");
                double gastosSaude = sc.nextDouble();
                sc.nextLine();
                list.add(new PessoaFi(nome, rendaAnual, gastosSaude));
            }else if(selecionada == 2){
                System.out.println("qual a quantidade de funcionarios? ");
                int funcionarios = sc.nextInt();
                sc.nextLine();
                list.add(new PessoaJu(nome, rendaAnual, funcionarios));
            }else{
                System.out.println("Você nao digitou um numero correspondente!!!");
                i--;
            }

        }
        for (Conta conta:list){
            System.out.println(conta);
        }


    

        sc.close();
    }

}