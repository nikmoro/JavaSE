package Clases;

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

	@Override  // Sobreescritura (Polimorfismo)
	public String toString() {  // Reutlizando el método para mostrar los datos del objeto (Polimorfismo
		return ":. SERIE .:"    +  
			   "Título: "       + getTitulo() +
			   "\nGénero: "     + getGenero() + 
			   "\nCreador: "    + getCreador() + 
			   "\nDuración: "   + getDuracion() +
			   "\nTemporadas: " + getTemporadas();
	}
}