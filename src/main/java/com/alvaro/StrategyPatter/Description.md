* Descripcion: En el patron Strategy creamos objetos que representa varias estrategias y un objeto de contexto cuyo comportamiento 
varia por cada objeto strategy. El objeto strategy permite decidir en tiempo de ejecucion el algoritmo que debe ejecutar.
* Ventajas
* Usando la encapsulacion separamos el algoritmo, asi nuevos algoritmos con la misma interface pueden ser facilmente introducidos.
* El mismo objeto Strategy puede ser estrategicamente compartido entre diferentes objetos de contexto.
* Desventajas
* La aplicacion debe estar conciente que todas las estrategias selecciones sean correctas.
* La aplicacion configura el contexto con el objeto Strategy requerido. Por lo tanto, la aplicacion necesita crear y mantener dos objetos en lugar de uno.
