package com.meli.academy.grails.test

import grails.converters.deep.JSON

class APIController {

    def index() { 
		def categorias = Categoria.list()
		if(! categorias.empty){
			render categorias as JSON
		}
	}
	
	def showCategoria(Categoria categoria){
//		[categoriaInstance:categoria]
		render categoria.nombre
	}

	
}
