package com.nikcode.moviesviewer.model;

import java.util.ArrayList;

public class Serie extends Filme { // Aplicando la herencia

	private int id;
	private int temporadas;
	private ArrayList<Capitulo> capitulos;  // ArrayList<NombreDeLaClase>

	public Serie(String titulo, String genero, String creador, int duracion, int temporadas) {
		super(titulo, genero, creador, duracion); // super : Referencia a los elementos de la clase padre
		this.temporadas = temporadas;  			  // this : Referencia a los elementos de la misma clase
	}

	public int getId() {
		return id;
	}
	
	public int getTemporadas() {
		return temporadas;
	}
	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}
	
	public ArrayList<Capitulo> getCapitulos() {
		return capitulos;
	}
	public void setCapitulos(ArrayList<Capitulo> capitulos) {
		this.capitulos = capitulos;
	}

	@Override
	public String toString() {  // Reutlizando el método para mostrar los datos del objeto - Sobreescritura (Polimorfismo)
		return "\n:. SERIE .:"  +  
			   "\nTítulo: "     + getTitulo() +
			   "\nGénero: "     + getGenero() + 
			   "\nCreador: "    + getCreador() + 
			   "\nDuración: "   + getDuracion() +
			   "\nTemporadas: " + getTemporadas();
	}
	
	public static ArrayList<Serie> hacerListaDeSeries() {
		ArrayList<Serie> series = new ArrayList();
		
		for (int i = 1; i < 5; i++) {
			Serie serie = new Serie("Serie " + i, "Género " + i, "Creador " + i, 120, 3);
			serie.setCapitulos(Capitulo.hacerListaDeCapitulos(serie));
		}
		return series;
	}
}