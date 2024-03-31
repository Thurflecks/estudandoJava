public class main {
    public static void main(String[] args) {
        Turma computacao = new Turma(7, "8:00");
        Aluno donamorte = new Aluno("donamorte", 32);
        System.out.println(computacao.horario + " " +  computacao.sala);
        System.out.println(donamorte.nome + " " + donamorte.idade);
        
        
        
    }
}
