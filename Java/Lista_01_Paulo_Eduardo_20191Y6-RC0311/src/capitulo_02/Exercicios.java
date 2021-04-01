package capitulo_02;
import java.util.Scanner;
public class Exercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//2.3
		int c = 2, eUmaVariavel, q76354, numero; //a)
		System.out.println("Insira um inteiro: ");//b)
		int valor;//c)
		Scanner input = new Scanner(System.in);//c)
		valor = input.nextInt();//c)
		System.out.println("Este é um programa em java");//d)
		System.out.printf("%s%n%s%n, Este é um programa, java");
		numero = 7;
		if (numero != 7)
			System.out.println("A variável numero é diferente de 7");
		
		//2.4
		//a) Não se coloca pont e virgula após o if
		if (c < 7)
			System.out.println("c é menor que 7");
		//b) o operador relacional está escrito errado
		if (c >= 7)
			System.out.println("c é maior ou igual a 7");
		
		//2.5
		//Programa que calcula o produto de 3 inteiros//a)
		//Scanner input = new Scanner(System.in);//b)
		int x, y, z, resultado;//c)
		System.out.print("Insira o primeiro número ");//d)
		x = input.nextInt();//e)
		System.out.print("Insira o segundo número ");//f)
		y = input.nextInt();//g)
		System.out.print("Insira o terceiro número ");//h)
		z = input.nextInt();//i)
		resultado = x * y * z;
		System.out.printf("O produto é %d%n", resultado);
		
		//2.6
		System.out.println("Programa que calcula o produto de 3 inteiros\n");//a)
		//Scanner input = new Scanner(System.in);//b)
		//int x, y, z, resultado;//c)
		System.out.print("Insira o primeiro número ");//d)
		x = input.nextInt();//e)
		System.out.print("Insira o segundo número ");//f)
		y = input.nextInt();//g)
		System.out.print("Insira o terceiro número ");//h)
		z = input.nextInt();//i)
		resultado = x * y * z;
		System.out.printf("O produto é %d%n", resultado);
	}

}
