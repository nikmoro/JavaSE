package Viewer;

public class Main {

	public static void main(String[] args) {
		
		int salir = 0;
		
		do {
			System.out.println("BIENVENIDO A MOVIES VIEWER \n");
			System.out.println("Selecciona el género deseado:");
			System.out.println("1. Drama");
			System.out.println("2. Terror");
			System.out.println("3. Comedia");
			System.out.println("4. Acción");
			System.out.println("0. Salir");
			
			int select = 0;
			
			switch (select) {
				case 1:
					System.out.println("Haz seleccionado el género Drama");
					break;
				case 2:
					System.out.println("Haz seleccionado el género Terror");
					break;
				case 3:
					System.out.println("Haz seleccionado el género Comedia");
					break;
				case 4:
					System.out.println("Haz seleccionado el género Acción");
					break;
				default:
					System.out.println("No haz seleccionado una opción válida");
					break;
			}
			
		} while (salir != 0);
	}
}
