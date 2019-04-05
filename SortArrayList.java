package prueba;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

	private static List<Integer> listaNumero = new ArrayList<Integer>();
	private static List<Integer> listaOrdenada = new ArrayList<Integer>();

	public static void main(String args[]) {
		for (int i = 0; i <= 34; i++) {
			listaNumero.add(generarAleatorio());
		}

		System.out.println("Lista Original:");
		imprimirArray(listaNumero);

		int numLista = listaNumero.size();

		while (listaOrdenada.size() != numLista) {
			for (int i = 0; i <= listaNumero.size() - 1; i++) {
				int contadorMenor = 0;
				for (int j = 0; j <= listaNumero.size() - 1; j++)
					if ((listaNumero.get(i) < listaNumero.get(j))
							|| (listaNumero.get(i) == listaNumero.get(j)))
						contadorMenor += 1;
				if (contadorMenor == listaNumero.size()) {
					listaOrdenada.add(listaNumero.get(i));
					listaNumero.remove(listaNumero.get(i));
				}
			}
		}

		System.out.println();
		System.out.println("Lista Ordenada:");
		imprimirArray(listaOrdenada);
	}

	private static void imprimirArray(List<Integer> lista) {
		for (Integer numero : lista)
			System.out.print(numero + " ");
	}

	private static int generarAleatorio() {
		Random r = new Random();
		int low = 1;
		int high = 50;
		return r.nextInt(high - low) + low;
	}
}
