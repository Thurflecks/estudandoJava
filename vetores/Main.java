import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Digite o tamanho do vetor: ");
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int n[] = new int[v];
        int m;

        for (int i = 0; i < n.length; i++) {
            System.out.println("Digite um valor: ");
            m = sc.nextInt();
            if (m < 0) {
                n[i] = m;
            }
        }
        System.out.println("Valores Negativos: ");
        for (int i : n) {
            if(i<0){
                System.out.println(i);
            }
        }


        sc.close();

    }
}