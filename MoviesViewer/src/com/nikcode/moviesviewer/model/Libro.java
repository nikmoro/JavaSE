package com.nikcode.moviesviewer.model;

import java.util.ArrayList;
import java.util.Date;

public class Libro extends Publicacion implements IVisualizable {

	private int id;	
	private String isbn;  // El ISBN ​ es un identificador único para libros
	private boolean leido;
	private int tiempoLeido;

	public Libro(String titulo, Date fechaEdicion, String editorial, String[] autores) {
		super(titulo, fechaEdicion, editorial);
		setAutores(autores);
	}
	
	public int getId() {
		return id;
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String isLeido() {
		String Readed = "";
		
		if (leido == true) {
			Readed = "Sí";
		}
		else {
			Readed = "No";
		}
		return Readed;
	}
	public void setLeido(boolean leido) {
		this.leido = leido;
	}

	public int getTiempoLeido() {
		return tiempoLeido;
	}
	public void setTiempoLeido(int tiempoLeido) {
		this.tiempoLeido = tiempoLeido;
	}

	@Override
	public String toString() {  // Reutlizando el método para mostrar los datos del objeto - Sobreescritura (Polimorfismo)
		return  "\n:. LIBRO .:"        +
				"\nTítulo: " 		   + getTitulo() +
				"\nFecha de Edición: " + getFechaEdicion() +
				"\nEditorial: " 	   + getEditorial() + 
				"\nAutores: " 		   + getAutores() +
				"\nISBN: " 			   + getIsbn();
	}

	// Métodos desde la interfaz - IVisualizable
	@Override
	public Date comenzarAVer(Date dateI) {
		return dateI;
	}
	@Override
	public void terminarDeVer(Date dateI, Date dateF) {
		if ( dateF.getTime() > dateI.getTime() ) {
			setTiempoLeido((int)(dateF.getTime() - dateI.getTime()));  // Casteo de Long a Int
		}
		else {
			setTiempoLeido(0); // No se usan negativos
		}
	}

	public static ArrayList<Libro> hacerListaDeLibros() {
		ArrayList<Libro> libros = new ArrayList();
		String[] autores = new String[3];
		
		for (int i = 0; i < 3; i++) {
			autores[i] = "Autor: " + 1;
		}
		
		// Generar Libros
		for (int i = 1; i < 5; i++) {
			libros.add(new Libro("Título " + i , new Date(), "Editorial" + i, autores));
		}
		return libros;
	}
}