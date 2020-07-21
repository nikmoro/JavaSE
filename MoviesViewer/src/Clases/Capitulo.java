package Clases;

import java.util.ArrayList;

public class Capitulo extends Pelicula {
	
	private int id;
	private int temporada;
	
	public Capitulo(String titulo, String genero, String creador, int duracion, short Anio, int temporada) {
		super(titulo, genero, creador, duracion, Anio);
		this.setTemporada(temporada);  //  Sobreescritura del constructor (Polimorfismo)
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

	@Override 
	public String toString() {  // Reutlizando el método para mostrar los datos del objeto - Sobreescritura (Polimorfismo)
		return  ":. CAPITULO .:"+
				"Título : "     + getTitulo() + 
				"\nGénero: "    + getGenero() +
				"\nCreador: "   + getCreador() + 
				"\nDiración: "  + getDuracion() + 
				"\nAño: "       + getAnio() + 
				"\nTemporada: " + getTemporada();
	}
	
	public static ArrayList<Capitulo> hacerListDeCapitulos() {
		ArrayList<Capitulo> capitulos = new ArrayList();
		
		for (int i = 0; i < 5; i++) {
			capitulos.add(new Capitulo("Título" + i, "Género" + i, "Creador" + i, 120, (short)2020, 1));
		}
		return capitulos;
	}
}