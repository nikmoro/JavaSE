package Clases;

import java.util.Date;

public class Publicacion {
	
	// Atributos (Variables globales)
	private String titulo;
	private Date fechaEdicion;
	private String editorial;
	private String[] autores;
		
	//--- Métodos ---//
	
	// Constructor | [ Mayús+Alt+S : Generar Constructror usando Fields (Eclise IDE) ]
	public Publicacion(String titulo, Date fechaEdicion, String editorial, String[] autores) {
		super();
		this.titulo = titulo;
		this.fechaEdicion = fechaEdicion;
		this.editorial = editorial;
		this.autores = autores;
	}

	// GET (Obtener) y SET (Establecer) | [ Mayús+Alt+S : Generar Getters and Setters (Eclise IDE) ]
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getFechaEdicion() {
		return fechaEdicion;
	}
	public void setFechaEdicion(Date fechaEdicion) {
		this.fechaEdicion = fechaEdicion;
	}

	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String[] getAutores() {
		return autores;
	}
	public void setAutores(String[] autores) {
		this.autores = autores;
	}	
}