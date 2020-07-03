package Clases;

public class Pelicula extends Filme {
	
	private int id;
	private int tiempoVisto;
	
	public Pelicula(String titulo, String genero, String creador, int duracion, short Anio) { 
		super(titulo, genero, creador, duracion);  
		setAnio(Anio); // Método de la clase padre
	}
	
	public int getId() {
		return id;
	}
	
	public int getTiempoVisto() {
		return tiempoVisto;
	}
	public void setTiempoVisto(int tiempoVisto) {
		this.tiempoVisto = tiempoVisto;
	}	
	
	@Override  // Sobreescritura (Polimorfismo)
	public String toString() {  // Reutlizando el método para mostrar los datos del objeto
		return "Título: "     + getTitulo() +
			   "\nGénero: "   + getGenero() + 
			   "\nCreador: "  + getCreador() + 
			   "\nDuración: " + getDuracion() +
			   "\nAño: "      + getAnio();
	}
}