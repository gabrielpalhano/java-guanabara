import java.util.Scanner;

class Divisao {
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		double n1;
		double n2;
		double divi;
		double restDivi;
		double raizQ;
		
		System.out.print("Digite o primeiro numero: ");
		n1 = leia.nextDouble();
		System.out.print("Digite o segundo numero: ");
		n2 = leia.nextDouble();
		divi = (n1 / n2);
		restDivi = (n1 % n2);
		raizQ = Math.sqrt(n1);
		
		
		System.out.printf("O resutado da divisao eh: %.2f \nE o resto da divisao eh de: %.2f \nE raiz quadrada do primeiro valor eh de: %.2f", divi, restDivi, raizQ);
	}
}