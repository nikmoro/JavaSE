package Clases;

public class Serie extends Filme { // Aplicando la herencia

	private int id;
	private int temporadas;
	private Capitulo[] capitulos;  

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
	
	public Capitulo[] getCapitulos() {
		return capitulos;
	}
	public void setCapitulos(Capitulo[] capitulos) {
		this.capitulos = capitulos;
	}

	@Override  // Sobreescritura (Polimorfismo)
	public String toString() {  // Reutlizando el método para mostrar los datos del objeto (Polimorfismo
		return "Título: "       + getTitulo() +
			   "\nGénero: "     + getGenero() + 
			   "\nCreador: "    + getCreador() + 
			   "\nDuración: "   + getDuracion() +
			   "\nTemporadas: " + getTemporadas();
	}
}