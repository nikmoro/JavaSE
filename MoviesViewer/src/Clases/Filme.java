package Clases;

public class Filme {
	
	// Atributos (Variables globales)
	private String titulo;
	private String genero;
	private String creador;
	private int duracion;
	private short anio;
	private boolean visto;
	
	//--- Métodos ---//
	
	// Constructor | [ Mayús+Alt+S : Generar Constructror usando Fields (Eclise IDE) ]
	public Filme(String titulo, String genero, String creador, int duracion) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.creador = creador;
		this.duracion = duracion;
	}

	// GET (Obtener) y SET (Establecer) | [ Mayús+Alt+S : Generar Getters and Setters (Eclise IDE) ]
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	public short getAnio() {
		return anio;
	}
	public void setAnio(short anio) {
		this.anio = anio;
	}
	
	public String isVisto() {
		String viewed = "";
		
		if (visto == true) {
			viewed = "Sí";
		}
		else {
			viewed = "No";
		}
		return viewed;
	}
	public void setVisto(boolean visto) {
		this.visto = visto;
	}
}