package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class AcaiIngredientes {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		ArrayList<String> ingr = new ArrayList<String> ();
		int num = 0, remover = 0;
		String novo;

		ingr.add("Leite Condensado = 0");
		ingr.add("Morango = 1");
		ingr.add("Leite em pó = 2");
		ingr.add("Nutella = 3");
		ingr.add("Granola = 4");
		ingr.add("Banana = 5");

		System.out.println(ingr);

		System.out.println("Digite 1 se deseja remover algo. Digite 2 se deseja adicionar algo. Digite 3 se deseja prosseguir: ");
		num = ler.nextInt();

		if(num == 1) {
			System.out.println("Digite o número correspondente ao ingrediente que deseja remover:");
			remover = ler.nextInt();
			if (remover > 5){
				System.out.println("Ingrediente inválido.");
			}
			else {
				ingr.remove(remover);	
				System.out.println ("Agora os ingredientes do seu açaí são: " + ingr);
			}
		}

		else if (num == 2) {
			System.out.println("Digite o ingrediente que deseja adicionar:");
			novo = ler.next();
			ingr.add(novo);
			System.out.println ("Agora os ingredientes do seu açaí são: " + ingr);
		}

		else if (num == 3) {
			System.out.println("Obrigada pela escolha!");
		}

		else  {
			System.out.println("Número inválido:");
		}

		ler.close();
	}

}




