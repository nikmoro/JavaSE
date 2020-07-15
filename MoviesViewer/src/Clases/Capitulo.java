package Clases;

public class Capitulo extends Pelicula {
	
	private int id;
	private int temporada;
	
	public Capitulo(String titulo, String genero, String creador, int duracion, short Anio, int temporada) {
		super(titulo, genero, creador, duracion, Anio);
		this.setTemporada(temporada);  //  Sobreecritura del constructor (Polimorfismo)
	}
	
	@Override
	public int getId() {  // Reutilizando el método desde la clase Pelicula
		return this.id;
	}
	
	public int getTemporada() {
		return temporada;
	}
	public void setTemporada(int temporada) {
		this.temporada = temporada;
	}	

	@Override // Sobreescritura (Polimorfismo)
	public String toString() {  // Reutlizando el método para mostrar los datos del objeto
		return  ":. CAPITULO .:"+
				"Título : "     + getTitulo() + 
				"\nGénero: "    + getGenero() +
				"\nCreador: "   + getCreador() + 
				"\nDiración: "  + getDuracion() + 
				"\nAño: "       + getAnio() + 
				"\nTemporada: " + getTemporada();
	}
}