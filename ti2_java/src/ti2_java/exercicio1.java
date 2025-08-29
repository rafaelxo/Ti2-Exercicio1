package ti2_java;
import java.util.*;

class exercicio1 {
	public static Scanner sc = new Scanner (System.in);
	public static void main (String[] args) {
		System.out.println("Soma de inteiros!\n");
		System.out.print("Insira o primeiro valor: ");
		int n1 = sc.nextInt(); // declaração e leitura do primeiro valor
		System.out.print("Insira o segundo valor: ");
		int n2 = sc.nextInt(); // declaração e leitura do segundo valor
		System.out.println("O resultado da soma de " + n1 + " com " + n2 + " é: " + (n1 + n2)); // saída na tela do resultado da soma dos dois inteiros
		System.out.println("\nFim do programa!");
	}
}
