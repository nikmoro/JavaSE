package Clases;

import java.util.Date;

public class Revista {

	// Atributo
	private int id;
	private String titulo;
	private Date fechaEdicion;
	public String editorial;
	public String[] autores; // Arreglo
	
	// Constructor
	public Revista(String titulo, Date fechaEdicion, String editorial) {
		super();
		this.titulo = titulo;
		this.fechaEdicion = fechaEdicion;
		this.editorial = editorial;
	}
}
