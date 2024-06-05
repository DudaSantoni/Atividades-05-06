package arrayList;

import java.util.ArrayList;

public class SomaArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		int soma = 0;

		numeros.add(2);
		numeros.add(2);
		numeros.add(2);
		numeros.add(2);
		numeros.add(2);

		for (int i : numeros) {
			soma += i;

		}
		System.out.println("A soma dos números é: " + soma);

	}

}