package com.meli.academy.grails.test

class Categoria {
	String nombre
	String prueba
	static hasMany = [productos:Producto]
	
    static constraints = {
    }
}
