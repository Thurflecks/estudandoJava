package aula1;
public class main
{
	public static void main(String[] args) {
		Familiakoki koki = new Familiakoki();
		Doido kokii = new Doido();
		koki.pessoa = kokii;
		koki.nome = "koki";
		koki.idade = 24;
		koki.pessoa.tipoDeLoucura = "esquizofrenico";
		koki.pessoa.grauDeLoucura = 70;
		
		
		System.out.println(koki.nome +" " + koki.idade + " " +koki.pessoa.grauDeLoucura + " "
		+ koki.pessoa.tipoDeLoucura);
	}
}
