package arrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class SomaNegativos {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		Scanner ler = new Scanner(System.in);
		int soma = 0, num1 = 0, num2 = 0, num3 = 0;

		System.out.println("Informe o primeiro número negativo:" );
		num1 = ler.nextInt();
		numeros.add(num1); 

		System.out.println("Informe o segundo número negativo:" );
		num2 = ler.nextInt();
		numeros.add(num2);

		System.out.println("Informe o terceiro número negativo:" );
		num3 = ler.nextInt();
		numeros.add(num3);

		for (int i : numeros) {
			soma += i;
		}

		System.out.println("A soma dos números negativos é: " + soma);

		ler.close();
	}

}
