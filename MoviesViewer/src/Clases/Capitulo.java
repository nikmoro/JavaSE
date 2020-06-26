package Clases;

public class Capitulo {
	
	// Atributos
	private int id;
	private String titulo;
	private int duracion;
	private short anio;
	private boolean visto;
	private int tiempoVisto;
	//private int episodio;
	private int numeroSesion;
	
	// Constructor
	public Capitulo(String titulo, int duracion, short anio) {
		super();
		this.titulo = titulo;
		this.duracion = duracion;
		this.anio = anio;
	}
}
