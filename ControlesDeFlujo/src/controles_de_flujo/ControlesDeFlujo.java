package controles_de_flujo;

public class ControlesDeFlujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		}
	}