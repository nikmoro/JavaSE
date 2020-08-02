package com.nikcode.hacerreporte;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Reporte {
	private String nombreArchivo;
	private String titulo;
	private String extension;
	private String contenido;
	
	public String getNombreArchivo() {
		return nombreArchivo;
	}
	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}
	
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	
	public void hacerReporte() {
		if ( (getNombreArchivo() != null) && (getTitulo() != null) && (getContenido() != null) ) {
			try {
				File file = new File(getNombreArchivo()+"."+getExtension());
				FileOutputStream fos = new FileOutputStream(file);
				OutputStreamWriter osw = new OutputStreamWriter(fos);
				BufferedWriter bw = new BufferedWriter(osw);
				bw.write(getContenido());
				bw.close();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		} else {

		}
	}
}
