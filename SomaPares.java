package arrayList;
import java.util.ArrayList;

public class SomaPares {

	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<Integer>();
		int soma = 0;

		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		numeros.add(6);

		for (int i : numeros) {
			if (i %2 == 0) {
				soma += i;
			}
		}
		System.out.println("A soma dos números pares é: " + soma);

	}

}
