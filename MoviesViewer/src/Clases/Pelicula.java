package Clases;

public class Pelicula {
	
	// Atributos
	private int id;
	private String titulo;
	private String genero;
	private String creador;
	private int duracion;
	private short anio;
	private boolean visto;
	private int tiempoVisto;
	
	
	// Mayús+Alt+S : Generar Constructror usando Fields 

	// Constructor
	public Pelicula(String titulo, String genero, short anio) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.anio = anio;
	}
	
	// Sobre carga del Constructor
	public Pelicula(String titulo, String genero, String creador, int duracion, short anio) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.creador = creador;
		this.duracion = duracion;
		this.anio = anio;
	}
	
	// Métodos
	public void mostrarDatos() {
		System.out.println("Título: " + titulo);
		System.out.println("Género: " +  genero);
		System.out.println("Año: " +  anio);
	}
}