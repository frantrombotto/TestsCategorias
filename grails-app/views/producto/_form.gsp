<%@ page import="com.meli.academy.grails.test.Producto" %>



<div class="fieldcontain ${hasErrors(bean: productoInstance, field: 'categoria', 'error')} required">
	<label for="categoria">
		<g:message code="producto.categoria.label" default="Categoria" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="categoria" name="categoria.id" from="${com.meli.academy.grails.test.Categoria.list()}" optionKey="id" required="" value="${productoInstance?.categoria?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: productoInstance, field: 'codigo', 'error')} required">
	<label for="codigo">
		<g:message code="producto.codigo.label" default="Codigo" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="codigo" required="" value="${productoInstance?.codigo}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: productoInstance, field: 'estaDisponible', 'error')} ">
	<label for="estaDisponible">
		<g:message code="producto.estaDisponible.label" default="Esta Disponible" />
		
	</label>
	<g:checkBox name="estaDisponible" value="${productoInstance?.estaDisponible}" />

</div>

<div class="fieldcontain ${hasErrors(bean: productoInstance, field: 'nombre', 'error')} required">
	<label for="nombre">
		<g:message code="producto.nombre.label" default="Nombre" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="nombre" required="" value="${productoInstance?.nombre}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: productoInstance, field: 'urlImagen', 'error')} required">
	<label for="urlImagen">
		<g:message code="producto.urlImagen.label" default="Url Imagen" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="urlImagen" required="" value="${productoInstance?.urlImagen}"/>

</div>

