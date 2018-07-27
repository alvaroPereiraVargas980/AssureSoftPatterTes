Descripcion:
      El patron de Abstract Factory define una interface o una abstraccion de una clase para crear una familia de objetos relacionados, pero sin especificar sus sub-clases en concreto.
	El patron de Abstract Factory es un patron de diseño creacional, un Abstract Factory es un factory que retorna factories. Esta capa de abstraccion es muy util. un factory normal puede ser usada para crear un grupo de objetos relacionados. Un Abtract factory retorna factories. Como que un Abstract Factory es usado para retornar factories que pueden ser usados para crear un grupo de objetos relacionados.
* Ventajas
* Aislamiento de clases concretas: El patron Abstract Factory nos ayuda controlando los objetos de clases que una aplicacion crea. Porque un factory encapsula la responsabilidad y el proceso de crear objetos, este patron aisla a los clientes de la implementacion de las clases. 
* Desventajas
* Dificultad en respaldar nuevos tipos de productos: Extender Abstract Factories para producir nuevos tipos de productos es dificil. Eso es porque los interfaces de Abstrac Factory arreglan el grupo de productos que pueden ser creados. Respaldar nuevos tipos de productos requiere extender la interface del factory, el cual involucra cambiar la clase Abstract Factory y todas las subclases.

