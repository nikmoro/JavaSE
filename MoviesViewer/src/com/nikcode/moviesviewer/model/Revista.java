package com.nikcode.moviesviewer.model;

import java.util.ArrayList;
import java.util.Date;

public class Revista extends Publicacion{

	private int id;
	
	public Revista(String titulo, Date fechaEdicion, String editorial) {
		super(titulo, fechaEdicion, editorial);
	}
	
	public int getId() {
		return id;
	}

	@Override
	public String toString() {  // Reutlizando el método para mostrar los datos del objeto - Sobreescritura (Polimorfismo)
		String 	detalleRevista = ":. REVISTA .:" +
								 "Título: " 			   + getTitulo() +
								 "\nFecha de Edición: " + getFechaEdicion() +
								 "\nEditorial: " 	   + getEditorial() + 
								 "\nAutores: " 		   + getAutores();
		
		for (int i = 0; i < getAutores().length; i++) {
			detalleRevista += "\t" + getAutores()[i] + " ";
		}
		return detalleRevista;
	}
	
	public static ArrayList<Revista> hacerListaDeRevistas() {
		ArrayList<Revista> revistas = new ArrayList();
		String[] autores = new String[3];
		
		for (int i = 0; i < 3; i++) {
			autores[i] = "Autor: " + i;
		}
		for (int i = 1; i <= 5; i++) {
			revistas.add(new Revista("Revista " + i, new Date(), "Editorial" + i));
		}
		return revistas;
	}
}