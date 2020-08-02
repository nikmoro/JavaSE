package com.nikcode.moviesviewer.model;

import java.util.Date;

public interface IVisualizable {
	 // Solo la declaración de los métodos (Ninguna implementación)
	 Date comenzarAVer(Date dateI);
	 void terminarDeVer(Date dateI, Date dateF);
}