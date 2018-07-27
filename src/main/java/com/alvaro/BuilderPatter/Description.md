* Descripcion: permite la creacion de un objeto complejo, a partir de una variedad de partes que contribuyen individualmente 
a la creacion y ensamblado del objeto mencionado. Ademas, centraliza el proceso de creacion en un unico punto, de tal forma 
que el mismo proceso de construccion pueda crear representaciones diferentes.
  Este patron debe utilizarse cuando el algoritmo para crear un objeto suele ser complejo e implica la interaccion de otras
  partes independientes.
  * Ventajas
  * Da mayor control en el proceso de construccion.
  * Cada concreteBuilder contiene el codigo para crear y juntar una clase especifica del producto.
  * Desventajas
  * Necesita crear un concreteBuilder para cada tipo de producto.
  * Las injecciones de dependencia pueden ser menos soportados en este patron.
  
