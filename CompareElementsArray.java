public class Main {
	public static void main(String[] args) {
		int[] list = { 1, 855, 2, 2, 423, 4, 8, 8, 423, 1 };
		System.out.println(numeroRepetido(list));
	}

	public static String numeroRepetido(int[] list) {
		boolean existeNumeroRepetido = false;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= list.length - 1; i++)
			for (int j = i + 1; j <= list.length - 1; j++)
				if (list[i] == list[j]) {
					existeNumeroRepetido = true;
					sb.append(list[i]);
					sb.append(", ");
				}
		return (!existeNumeroRepetido ? "NO HAY REPETIDOS "
				: "EL SIGUIENTE(S) NÚMERO(S): "
						+ sb.toString().substring(0, sb.length() - 2)
						+ " ESTÁ(N) REPETIDO(S)");
	}
}
