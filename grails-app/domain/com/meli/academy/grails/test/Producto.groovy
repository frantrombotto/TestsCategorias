package com.meli.academy.grails.test

class Producto {
	String codigo
	String nombre
	String urlImagen
	boolean estaDisponible
	
	static belongsTo = [categoria:Categoria]
	
    static constraints = {
    }
}
