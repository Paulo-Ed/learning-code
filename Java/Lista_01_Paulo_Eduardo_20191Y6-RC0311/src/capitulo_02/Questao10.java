package capitulo_02;

import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int numero1;
		int numero2;
		int soma;
		
		System.out.print("Informe o primeiro número: ");
		numero1 = input.nextInt();

		System.out.print("Informe o segundo número: ");
		numero2 = input.nextInt();
		
		soma = numero1 + numero2;
		
		System.out.printf("Soma é %d%n", soma);
	}

}
