package com.meli.academy.grails.test

class Categoria {
	String nombre
	static hasMany = [productos:Producto]
	
    static constraints = {
    }
}
