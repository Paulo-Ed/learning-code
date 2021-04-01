/* É atribuído(a referência) a variável um dado de entrada */
package capitulo_02;
import java.util.Scanner;
public class Questao13 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int numero1;
		int numero2;
		
		System.out.print("Informe o primeiro inteiro: ");
		numero1 = input.nextInt();
		
		System.out.print("Informe o segundo inteiro: ");
		numero2 = input.nextInt();
		
		if (numero1 == numero2)
			System.out.printf("%d == %d%n", numero1, numero2);
		
		if (numero1 != numero2)
			System.out.printf("%d != %d%n", numero1, numero2);
		
		if (numero1 < numero2)
			System.out.printf("%d < %d%n", numero1, numero2);
		
		if (numero1 > numero2)
			System.out.printf("%d > %d%n", numero1, numero2);
		
		if (numero1 <= numero2)
			System.out.printf("%d <= %d%n", numero1, numero2);
		
		if (numero1 >= numero2)
			System.out.printf("%d >= %d%n", numero1, numero2);
		
		
	}

}
