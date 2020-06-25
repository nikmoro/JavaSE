package Viewer;

import java.util.Scanner;
//import Clases.Pelicula;

public class Main {

	public static void main(String[] args) {
		
		/* Pelicula pelicula = new Pelicula();  // Instanciando el objeto
			pelicula.titulo = "Klaus";  // Accediendo a los atributos de la clase
			pelicula.duracion = 140; */
		
		mostrarMenu();
		
	}

	public static void mostrarMenu() {
		
		int salir = 0;
		
		do {
			System.out.println("\nBIENVENIDO A VIEWER \n");
			System.out.println("Selecciona la opción deseada:");
			System.out.println("1. Películas");
			System.out.println("2. Series");
			System.out.println("3. Capítulos");
			System.out.println("4. Libros");
			System.out.println("5. Revistas");
			System.out.println("0. Salir");
			
			// Leer resuesta del usuario
			//Scanner sc = new Scanner(System.in);
			//int select = Integer.valueOf(sc.nextLine());
			
			int select = 1;
			
			switch (select) {
				case 0:
					System.out.println("\nUsted ha salido");
					salir = 0;
					break;
				case 1:
					mostrarPeliculas();
					break;
				case 2:
					mostrarSeries();
					break;
				case 3:
					mostrarCapitulos();
					break;
				case 4:
					mostrarLibros();
					break;
				case 5:
					mostrarRevistas();
					break;
				default:
					System.out.println("\nNo haz seleccionado una opción válida");
					break;
			}
			
		} while(salir != 0);
	}
	public static void mostrarPeliculas() {
		int exit = 0;
		
		do {
			System.out.println("\n:. Películas :.\n");
		} while(exit != 0);
	}
	public static void mostrarSeries() {
		int exit = 0;
		
		do {
			System.out.println("\n:. Series :.\n");
		} while(exit != 0);
	}
	public static void mostrarCapitulos() {
		int exit = 0;
		
		do {
			System.out.println("\n:. Capítulos :.\n");
		} while(exit != 0);
	}
	public static void mostrarLibros() {
		int exit = 0;
		
		do {
			System.out.println("\n:. Libros :.\n");
		} while(exit != 0);
	}
	public static void mostrarRevistas() {
		int exit = 0;
		
		do {
			System.out.println("\n:. Revistas :.\n");
		} while(exit != 0);
	}
	

}
