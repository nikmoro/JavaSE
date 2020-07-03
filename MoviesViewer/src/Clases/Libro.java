package Clases;

import java.util.Date;

public class Libro extends Publicacion {

	private int id;	
	private String isbn;  // El ISBN ​ es un identificador único para libros
	private boolean leido;
	private int tiempoLeido;

	public Libro(String titulo, Date fechaEdicion, String editorial, String[] autores, String isbn) {
		super(titulo, fechaEdicion, editorial, autores);
		this.isbn = isbn;
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

	public boolean getLeido() {  // isLeido
		return leido;
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
	public String toString() {
		return "Título: " 			   + getTitulo() +
				"\nFecha de Edición: " + getFechaEdicion() +
				"\nEditorial: " 	   + getEditorial() + 
				"\nAutores: " 		   + getAutores() +
				"\nISBN: " 			   + getIsbn();
	}
}