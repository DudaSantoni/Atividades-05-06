package arrayList;
import java.util.ArrayList;
import java.util.Random;

public class ExemploRandom {
	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<>();

		Random random = new Random(); //Criação do objeto "random"

		for (int i = 0; i < 5; i++) {
			int numeroAleatorio = random.nextInt(100); // O 100 representa o limite para a geração aleatória
			numeros.add(numeroAleatorio);
		} //Substitui a repetição

		for (int numero : numeros) {
			System.out.println(numero);
		} //Exibe o ArrayList

	}

}
