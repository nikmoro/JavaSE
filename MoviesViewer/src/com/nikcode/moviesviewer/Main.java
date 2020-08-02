package com.nikcode.moviesviewer;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import com.nikcode.hacerreporte.Reporte;
import com.nikcode.moviesviewer.model.Capitulo;
import com.nikcode.moviesviewer.model.Libro;
import com.nikcode.moviesviewer.model.Pelicula;
import com.nikcode.moviesviewer.model.Revista;
import com.nikcode.moviesviewer.model.Serie;

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
			System.out.println("3. Libros");
			System.out.println("4. Revistas");
			System.out.println("5. Reporte");
			System.out.println("6. Reporte de hoy");
			System.out.println("0. Salir");
			
			// Leer respuesta del usuario
			Scanner sc = new Scanner(System.in);  // System.in: Input Stream (Entrada del teclado)
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
					mostrarLibros();
					break;
				case 4:
					mostrarRevistas();
					break;
				case 5:
					hacerReporte();
					salir = 1;
					break;
				case 6:
					hacerReporte(new Date());  // Date date = new Date()
					salir = 1;
					break;
				default:
					System.out.println("\nNo haz seleccionado una opción válida");
					break;
			}
		} while(salir != 0);
	}
	
	static ArrayList<Pelicula> peliculas = Pelicula.hacerListaDePeliculas();  // Usar la lista ya creada (Globalmente)
	public static void mostrarPeliculas() {
		int exit = 1;
		
		do {
			System.out.println("\n:. Películas :.\n");
			System.out.println("Elije una Película:");
			
			// Imprimir la lista de series
			for (int i = 0; i < peliculas.size(); i++) {
				System.out.println(i+1 + ". " + peliculas.get(i).getTitulo() + " Visto: " + peliculas.get(i).isVisto());
			}
			System.out.println("0. Regresar al Menú \n");
			
			// Leer respuesta del usuario
			Scanner sc = new Scanner(System.in);
			int select = Integer.valueOf(sc.nextLine());  // Casteo (Convertir la entrada String a Int)
			
			if (select == 0) {
				exit = 0;
				mostrarMenu();
				break;
			}
			
			if (select > 0) {
				// Iniciar a verla
				Pelicula elegirPelicula = peliculas.get(select - 1);  // Oara romar el índice correcto de la lista
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
			}
			
		} while(exit != 0);
	}
	static ArrayList<Serie> series = Serie.hacerListaDeSeries();
	public static void mostrarSeries() {
		int exit = 1;
		
		do {
			System.out.println("\n:. Series :.\n");
			System.out.println("Elige una Serie:");
			
			for (int i = 0; i < series.size(); i++) {
				System.out.println(i+1 + ". " + series.get(i).getTitulo() + " Visto: " + series.get(i).isVisto());
			}
			
			System.out.println("0. Regresar al Menú \n");
			
			// Leer respuesta del usuario
			Scanner sc = new Scanner(System.in);
			int select = Integer.valueOf(sc.nextLine());
			
			if (select == 0) {
				exit = 0;
				mostrarMenu();
			}
			
			if (select > 0) {
				mostrarCapitulos(series.get(select - 1).getCapitulos());
			}
			
		} while(exit != 0);
	}
	public static void mostrarCapitulos(ArrayList<Capitulo> capitulosDeSerieElegida) {
		int exit = 0;
		
		do {
			System.out.println("\n:. Capítulos :.\n");
			
			for (int i = 0; i < capitulosDeSerieElegida.size(); i++) {
				System.out.println(i+1 + ". " + capitulosDeSerieElegida.get(i).getTitulo() + " Visto: " +  capitulosDeSerieElegida.get(i).isVisto());
			}
			
			System.out.println("0. Regresar al Menú \n");
			
			// Leer respuesta del usuario
			Scanner sc = new Scanner(System.in);
			int select = Integer.valueOf(sc.nextLine());
			
			if (select == 0) {
				//mostrarMenu();
				exit = 0;
			}
			
			if (select > 0) {
				Capitulo elegirCapitulo = capitulosDeSerieElegida.get(select - 1);
				elegirCapitulo.setVisto(true);
				Date dateI = elegirCapitulo.comenzarAVer(new Date());
				
				// Simulación
				for (int i = 0; i < 100000; i++) {
					System.out.println("(0 - 0)");
				}
				
				elegirCapitulo.terminarDeVer(dateI, new Date());
				System.out.println("\nViste: " + elegirCapitulo);
				System.out.println("Por: " + elegirCapitulo.getTiempoVisto() +  "milsegundos");
			}
			
		} while(exit != 0);
	}
	static ArrayList<Libro> libros = Libro.hacerListaDeLibros();
	public static void mostrarLibros() {
		int exit = 1;
		
		do {
			System.out.println("\n:. Libros :.\n");
			System.out.println("Elije un Libro:");
			
			for (int i = 0; i < libros.size(); i++) {
				System.out.println(i+1 + ". " + libros.get(i) + "Visto: " + libros.get(i).isLeido() );
			}
			
			System.out.println("0. Regresar al Menú \n");
			
			// Leer respuesta del usuario
			Scanner sc = new Scanner(System.in);
			int select = Integer.valueOf(sc.nextLine());
			
			if (select == 0) {
				exit = 0;
				mostrarMenu();
			}
			
			if (select > 0) {
				Libro elegirLibro = libros.get(select - 1); // El valor select - 1: (usando el índice de la lista que comienza en cero)
				elegirLibro.setLeido(true);
				Date dateI = elegirLibro.comenzarAVer(new Date());
				
				// Simulación de lectura
				for (int i = 0; i < 100000; i++) {
					System.out.println("(0 - 0)");
				}
				
				// Terminar de verla
				elegirLibro.terminarDeVer(dateI, new Date());
				System.out.println("\nViste: " + elegirLibro);
				System.out.println("Por: " + elegirLibro.getTiempoLeido() +  "milisegundos");
			}
			
		} while(exit != 0);
	}
	public static void mostrarRevistas() {
		ArrayList<Revista> revistas = Revista.hacerListaDeRevistas();
		int exit = 0;
		
		do {
			System.out.println("\n:. Revistas :.\n");
			
			for (int i = 0; i < revistas.size(); i++) {
				System.out.println(i+1 + ". " + revistas.get(i).getTitulo());
			}
			System.out.println("\n0. Regresar al Menú");
			
			Scanner sc = new Scanner(System.in);
			int select = Integer.valueOf(sc.nextLine());
			
			if (select == 0) {
				exit = 0;
				mostrarMenu();
			}
			
		} while(exit != 0);
	}
	
	public static void hacerReporte() {
		Reporte reporte = new Reporte();
		reporte.setNombreArchivo("reporte");
		reporte.setTitulo(".: VISTOS :.");
		reporte.setExtension("txt");
		String contenidoReporte = "";
		
		for (Pelicula pelicula : peliculas) {
			if (pelicula.getIsVisto()) {
				contenidoReporte += pelicula.toString() + "\n";
			}
		}
		reporte.setContenido(contenidoReporte);
		reporte.hacerReporte();
	}
	public static void hacerReporte(Date date) {
		SimpleDateFormat df = new SimpleDateFormat("yyy-MM-dd");
		String cadanaFecha = df.format(date);
		
		Reporte reporte = new Reporte();
		reporte.setNombreArchivo("reporte " + cadanaFecha);
		reporte.setTitulo(".: VISTOS :.");
		reporte.setExtension("txt");
		String contenidoReporte = "";
		
		for (Pelicula pelicula : peliculas) {
			if (pelicula.getIsVisto()) {
				contenidoReporte += pelicula.toString() + "\n";
			}
		}
		reporte.setContenido(contenidoReporte);
		reporte.hacerReporte();
	}
}