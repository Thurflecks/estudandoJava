import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Turma computacao = new Turma(7, "8:00");
        Scanner cs = new Scanner(System.in);
        Aluno donamorte = new Aluno("donamorte", 32, computacao);
        System.out.println(donamorte.sala.horario + " " +  donamorte.sala.sala);
        System.out.println(donamorte.nome + " " + donamorte.idade);
        
        
        
    }
}
