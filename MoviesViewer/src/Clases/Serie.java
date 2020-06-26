package Clases;

public class Serie {
	
	// Atributos
	private int id;
	private String titulo;
	private String genero; 
	private String creador;
	private int duracion;
	private short anio;
	private boolean visto;
	private int tiempoVisto;
	//private int temporadas;
	//private int cantidadSesion;

	// Constructor
	public Serie(String titulo, String genero, int duracion) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.duracion = duracion;
	}	
}
