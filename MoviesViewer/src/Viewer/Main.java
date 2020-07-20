package Viewer;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import Clases.Pelicula;

public class Main {

	public static void main(String[] args) {
		
		/* Pelicula pelicula = new Pelicula("Klaus", "Animación", "", 120, (short)2020 ); // Creando un objeto y Cast
		System.out.println(pelicula);  //toString() es opcional, ya lo hace directamente */
		
		mostrarMenu();
	}
	
	public static void mostrarMenu() {
		
		int salir = 0;
		
		do {
			System.out.println("BIENVENIDO A VIEWER \n");
			System.out.println("Selecciona la opción deseada:");
			System.out.println("1. Películas");
			System.out.println("2. Series");
			System.out.println("3. Capítulos");
			System.out.println("4. Libros");
			System.out.println("5. Revistas");
			System.out.println("6. Reporte");
			System.out.println("7. Reporte de hoy");
			System.out.println("0. Salir");
			
			// Leer respuesta del usuario
			Scanner sc = new Scanner(System.in);  // System.in: Imput Stream
			int select = Integer.valueOf(sc.nextLine());  // Parseo; Validar que si sea un número
						
			switch (select) {
				case 0:
					System.out.println("\nHas salido\n");
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
				case 6:
					hacerReporte();
					break;
				case 7:
					//Date date = new Date()
					hacerReporte(new Date());
					break;
				default:
					System.out.println("\nNo haz seleccionado una opción válida");
					break;
			}
		} while(salir != 0);
	}
	public static void mostrarPeliculas() {
		int exit = 1;
		
		ArrayList<Pelicula> peliculas = Pelicula.hacerListaDePeliculas();
		
		do {
			System.out.println("\n:. Películas :.\n");
			
			for (int i = 0; i < peliculas.size(); i++) {
				System.out.println(i+1 + ". " + peliculas.get(i).getTitulo() + " Visto: " + peliculas.get(i).isVisto());
			}
			
			System.out.println("0. Regresar al Menú \n");
			
			// Leer respuesta del usuario
			Scanner sc = new Scanner(System.in);
			int select = Integer.valueOf(sc.nextLine());  // Casteo
			
			if (select == 0) {
				mostrarMenu();
			}
			
			Pelicula elegirPelicula = peliculas.get(select - 1);
			elegirPelicula.setVisto(true);  // Seleccionarla como vista
			Date dateI = elegirPelicula.comenzarAVer(new Date());  // Date() Toma la fecha em ese momento
			
			// Simulación
			for (int i = 0; i < 100000; i++) {
				System.out.println("(0 - 0)");
			}
			
			// Terminar de verla
			elegirPelicula.terminarDeVer(dateI, new Date());
			System.out.println("\nViste: " + elegirPelicula);
			System.out.println("Por: " + elegirPelicula.getTiempoVisto() + " milisegundos");
			
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
	public static void hacerReporte() {
	}
	public static void hacerReporte(Date date) {
	}
}