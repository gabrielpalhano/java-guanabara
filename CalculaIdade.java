import java.util.Scanner;

class CalculaIdade {
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int anoAtual;
		int anoNasc;
		int idade;
		
		
		System.out.print("Qual o ano atual? ");
		anoAtual = leia.nextInt();
		
		System.out.print("Qual o ano em que voce nasceu? ");
		anoNasc = leia.nextInt();
		
		idade = anoAtual - anoNasc;
		
		System.out.printf ("A sua idade eh de: %d \n", idade);
		
	}
}