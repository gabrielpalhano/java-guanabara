import java.util.*;

class MathLibrary {
	public static void main (String[] args) {
		
		//ALGUNS COMANDOS USANDO MATH
		
		System.out.println(Math.PI); // PI = 3,14
		System.out.println(Math.pow(6,5)); // pow = exponenciação
		System.out.println(Math.sqrt(6)); // sqrt = raiz quadrada
		System.out.println(Math.cbrt(6)); // cbrt = raiz cúbica
		System.out.println(Math.abs(-10)); // abs = valor absoluto, ou seja, sem sinais, apenas o valor
		System.out.println(Math.floor(6.5)); // floor = arrendondamento para baixo
		System.out.println(Math.ceil(6.5)); // ceil = arrendondamento para cima
		System.out.println(Math.round(6.6)); // round = arrendondamento tradicional
		System.out.println(Math.round(6.4)); // round = arrendondamento tradicional
		System.out.println(Math.round(6.5)); // round = arrendondamento tradicional (quando é .5 ele joga a nota pra cima)
		
		// MATH.RANDOM();
		
		System.out.println(5 + Math.random() * (10-5)); //para acahr números aleatorios entre 5 e 10
		System.out.println(1 + Math.random() * (10-1)); //para achar números aleatorios entre 1 e 10
	}
	
}