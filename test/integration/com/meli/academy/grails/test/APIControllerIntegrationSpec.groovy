package com.meli.academy.grails.test

import grails.test.spock.IntegrationSpec

class APIControllerIntegrationSpec extends IntegrationSpec {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
    }
	
	void "Prueba show categoria"(){
		def apiController = new APIController();
		def categoria = new Categoria(nombre:"Auto");
		apiController.showCategoria(categoria);
		assertEquals("Auto", apiController.response.contentAsString)
	}
}
