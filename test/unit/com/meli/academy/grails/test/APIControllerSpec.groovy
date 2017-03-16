package com.meli.academy.grails.test

import grails.test.mixin.Mock
import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(APIController)
@Mock(Categoria)
class APIControllerSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "Prueba show categoria"() {
		when:
			//Categoria.save(new Categoria(nombre:"NuevaCategoria"))
			//def primerCategoria = Categoria.first()
			def categoria = new Categoria(nombre:"NuevaCategoria")
			controller.showCategoria(categoria)
			
		then:
			response.text == "NuevaCategoria"
			
    }
}
