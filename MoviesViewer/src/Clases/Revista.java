package Clases;

import java.util.Date;

public class Revista extends Publicacion{

	private int id;
	
	public Revista(String titulo, Date fechaEdicion, String editorial, String[] autores) {
		super(titulo, fechaEdicion, editorial, autores);
	}
	
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Título: " 			   + getTitulo() +
				"\nFecha de Edición: " + getFechaEdicion() +
				"\nEditorial: " 	   + getEditorial() + 
				"\nAutores: " 		   + getAutores();
	}
}