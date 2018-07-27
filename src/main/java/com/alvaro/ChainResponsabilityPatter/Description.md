* Descripcion
  Permite establecer una cadena de objetos receptores a travez de los cuales se pasa una peticion formulada por un objeto emisor
  La idea es que cualquiera de los receptores puede responder la peticion en funcion a un criterio dado.
 * Ventajas
 * El uso del patron reduce el acoplamiento.
 * El patron añade flexibilidad mientras asigna responsabilidades a los objetos.
 * Desventajas
 * Puede existir un error en el reenvio (mensajes que no pueden ser manejados por un handler y por lo tanto no tiene respuesta).
 * Si muchos mensajes son enviados en un peridos corto de tiempo, entonces el sistema puede volverse lento.
  
