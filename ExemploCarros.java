package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ExemploCarros {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		ArrayList<String> carros = new ArrayList<String> ();
		int num = 0;

		carros.add("Camaro");
		carros.add("Brasília");
		carros.add("Chevette");
		carros.add("Monza");
		carros.add("Fox");
		carros.add("Celta");
		carros.add("Jeep");
		carros.add("Honda Civic");
		carros.add("Fusca");
		carros.add("Gol");

		System.out.println(carros);

		System.out.println("Escolha um número entre 0 a 9: ");
		num = ler.nextInt();

		System.out.println(carros.get(num));

		ler.close();

	}

}
