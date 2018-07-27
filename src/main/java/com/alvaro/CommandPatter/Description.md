* Descripcion: El patron command encapsula una peticion bajo un objeto como un comando y es transportado a un objeto invoker. El objeto invoker busca un objeto apropiado el cual pueda solucionar la peticion, luego pasa el comando al objeto correspondiente el cual pueda ejecutar el comando.
 * ventajas
 - Separa el objeto que invoca, la operacion del objeto que en realidad soluciona la operacion.
 - Hace sencillo añadir nuevos comandos, debido a que las clases existentes se mantienen inalterables.
 * Desventajas
 - Hay un gran numero de clases y objetos trabajando juntos para solucionar el problema.El desarrollo de las clases
  tiene que ser con cuidado y muy minucioso.
  - Cada comando es un clase concreteCommand que incrementa el volumen de clases por implementar y mantener. 
