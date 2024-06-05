package arrayList;

import java.util.ArrayList;

public class ExemploFrutas {

	public static void main(String[] args) {

		ArrayList<String> frutas = new ArrayList<String> ();

		frutas.add("Maçã");
		frutas.add("Morango");
		frutas.add("Uva");
		frutas.add("Abacaxi");
		frutas.add("Maracujá");
		frutas.add("Melancia");
		frutas.add("Banana");
		frutas.add("Kiwi");
		frutas.add("Mamão");
		frutas.add("Melão");

		System.out.println(frutas);

		frutas.remove(9);

		frutas.remove(8);

		frutas.remove(7);

		frutas.remove(6);

		frutas.remove(5);

		System.out.println(frutas);
		System.out.println(frutas.size());
	}

}
