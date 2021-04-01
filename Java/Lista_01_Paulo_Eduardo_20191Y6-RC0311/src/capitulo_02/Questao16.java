package capitulo_02;

import java.util.Scanner;

public class Questao16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int numero1;
		int numero2;
		int soma, subtracao, divisao, multiplicacao, resto;
		
		System.out.print("Informe o primeiro número: ");
		numero1 = input.nextInt();

		System.out.print("Informe o segundo número: ");
		numero2 = input.nextInt();
		if(numero2 == 0)
			System.out.println("Informe um valor diferente de zero para o segundo número");
		soma = numero1 + numero2;
		subtracao = numero1 - numero2;
		multiplicacao = numero1 * numero2;
		divisao = numero1 / numero2;
		resto = numero1 % numero2;
		System.out.printf("A Soma de %d e %d é %d%n", numero1, numero2, soma);
		System.out.printf("A Subtracao de %d e %d é %d%n", numero1, numero2, subtracao);
		System.out.printf("A Multiplicacao de %d e %d é %d%n", numero1, numero2, multiplicacao);
		System.out.printf("A Divisao de %d e %d é %d%n", numero1, numero2, divisao);
		System.out.printf("O resto de %d e %d é %d%n", numero1, numero2, resto);
	}

}
