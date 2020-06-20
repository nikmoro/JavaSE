package controles_de_flujo;

public class ControlesDeFlujo {

	public static void main(String[] args) {
		
		// Condicionales
		
		// If/else
		int a = 15;
		int b = 24;
		
		if (a < b) {
			//true
			System.out.println("A es mayor que B");
		} else if (a == b) {
			System.out.println("Son iguales");
		} else {
			System.out.println("No es mayor y tampoco es igual que B");
		}
		
		// Switch
		switch (a) {
			case 20:
				System.out.println("A vale 20");
				break;
			case 15:
				System.out.println("\nA vale 15\n");
				break;
			default:
				System.out.println("A no vale ni 15 ni 20");
				break;
		}
		
		// Bucle While y do while
		int i = 1;
		
		while (i <= 5) {
			System.out.println("i es menor o igual que 5");
			i++;  // Control de flujo
		}
		
		do {
			System.out.println("i es menor o igual que 5");
			i--;  // Control de flujo
		} while (i >= 5);
		
		/* Diferencias:
		 * for: permite el acceso a los índices
		 * foreach: es mas rápido y fácil de usar, solo permite el acceso a los datos */

		// For
		System.out.println();
		int[] nums = new int[5];  // Inicializar el arreglo

		for (int c = 0; c < 5; c++) {
			nums[c] = c + 1;
			System.out.println("Numeros["+c+"]: " + nums[c]);
		}

		// ForEach
		System.out.println();
		for (int j : nums) {
			System.out.println(j);
		}
		
		// Ciclos for anidados con arreglos 2D
		System.out.println();
		
		// Arreglo de 3 filas x 5 columnas
		int[][] numeros = { {1,2,3,4,5},
							{6,7,8,9,10},
							{11,12,13,14,15} };
		
		// Recorrer el arreglo
		for (int f = 0; f < numeros.length; f++) {
			for (int c = 0; c < numeros[0].length; c++) {  // Longitud de la fila[0], para saber la cantidad de columnas
				System.out.println(numeros[f][c]);
			}
		}
		
		// Recorrer el arreglo
		System.out.println();
		for (int[] c : numeros) {  // "numeros" son las filas
			for (int n : c) {  // "c" recorre la fila
				System.out.println(n);
			}
		}
		
		/* numeros = 0, c = 0, n = 1 */
	}
}