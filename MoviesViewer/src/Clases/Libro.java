package Clases;

import java.util.Date;

public class Libro {
	
	// Atributos
	private int id;
	private String titulo;
	private Date fechaEdicion;
	private String editorial;
	private String[] autores;  // Arreglo
	private String isbn;  // El ISBN ​ es un identificador único para libros
	private boolean leido;
	private int tiempoLeido;

	// Constructor
	public Libro(String titulo, Date fechaEdicion, String editorial, String isbn) {
		super();
		this.titulo = titulo;
		this.fechaEdicion = fechaEdicion;
		this.editorial = editorial;
		this.isbn = isbn;
	}
	
}
