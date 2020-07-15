package Clases;

import java.util.Date;

public class Libro extends Publicacion implements IVisualizable {

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

	@Override // Sobreescritura (Polimorfismo)
	public String toString() {
		return  ":. LIBRO .:"          +
				"Título: " 			   + getTitulo() +
				"\nFecha de Edición: " + getFechaEdicion() +
				"\nEditorial: " 	   + getEditorial() + 
				"\nAutores: " 		   + getAutores() +
				"\nISBN: " 			   + getIsbn();
	}

	@Override
	public Date comenzarAVer(Date dateI) {
		return dateI;
	}

	@Override
	public void terminarDeVer(Date dateI, Date dateF) {
		if ( dateF.getSeconds() > dateI.getSeconds() ) {
			setTiempoLeido(dateF.getSeconds() - dateI.getSeconds());
		}
		else {
			setTiempoLeido(0); // No se usan negativos
		}
	}
}