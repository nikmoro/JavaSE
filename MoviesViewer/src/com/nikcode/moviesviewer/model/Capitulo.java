package com.nikcode.moviesviewer.model;

import java.util.ArrayList;

public class Capitulo extends Pelicula {
	
	private int id;
	private int temporada;
	private Serie serie; // Código de github
	
	public Capitulo(String titulo, String genero, String creador, int duracion, short Anio, int temporada, Serie serie) {
		super(titulo, genero, creador, duracion, Anio);
		this.setTemporada(temporada);  //  Sobreescritura del constructor y reutilización del método (Polimorfismo)
		this.setSerie(serie); // Código de github
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
	
	public Serie getSerie() {
		return serie;
	}

	public void setSerie(Serie serie) {
		this.serie = serie;
	}

	@Override 
	public String toString() {  // Reutilizando el método para mostrar los datos del objeto - Sobreescritura (Polimorfismo)
		return  ":. CAPITULO .:"+
				"Título : "     + getTitulo() + 
				"\nGénero: "    + getGenero() +
				"\nCreador: "   + getCreador() + 
				"\nDiración: "  + getDuracion() + 
				"\nAño: "       + getAnio() + 
				"\nTemporada: " + getTemporada();
	}
	
	public static ArrayList<Capitulo> hacerListaDeCapitulos(Serie serie) {
		ArrayList<Capitulo> capitulos = new ArrayList();
		
		for (int i = 1; i < 5; i++) {
			capitulos.add(new Capitulo("Título " + i, "Género " + i, "Creador " + i, 120, (short)(2020 + i), + i, serie));
		}
		return capitulos;
	}
}