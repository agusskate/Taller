### Simulación de un taller
Este proyecto consiste en un programa Java que permite gestionar diferentes tipos de vehículos (coches, motos, tractores, grúas y camiones) mediante una interfaz gráfica basada en JOptionPane.

#### Características Principales
Clases de Vehículos: El programa incluye clases para cada tipo de vehículo, como Coche, Moto, Tractor, Grua y Camion, que heredan de una clase principal llamada Vehiculo. Cada clase de vehículo contiene propiedades y métodos específicos para su funcionamiento y reparación.

ArrayList de Vehículos: Utiliza un ArrayList para almacenar y gestionar los vehículos creados en el programa.

Interfaz Gráfica: La interfaz permite al usuario seleccionar un vehículo y realizar una acción de reparación sobre él.

Manejo de Excepciones: Implementa un manejo básico de excepciones para capturar errores en la entrada del usuario.

#### Uso del Programa
El usuario puede realizar las siguientes acciones:

Seleccionar Vehículo para Reparación: Elige un tipo de vehículo entre Coche, Moto, Tractor, Grua y Camion. Luego, el programa realiza una simulación de reparación en el vehículo seleccionado.

Salir del Programa: Termina la ejecución del programa.

#### Ejecución del Programa
Para ejecutar el programa, se debe compilar y ejecutar el archivo App.java. Una vez en ejecución, el usuario puede interactuar con la interfaz gráfica para gestionar los vehículos.


------------

#### Preguntas adicionales
##### ¿Puede existir una clase que sea heredada de una ya heredada?
Sí, en la programación orientada a objetos también es posible tener lo que se llama una "nieta", es decir, una clase que hereda de una clase hija. Esta situación forma parte de la jerarquía de herencia y es perfectamente válida en muchos lenguajes de programación.


##### ¿Puede existir una clase que sea heredada de 2 padres?
En principio solo puede heredar de una única clase padre, lo que se conoce como herencia simple. Esto significa que una clase solo puede extender otra clase directamente. Sin embargo, se puede simular la herencia múltiple a través de interfaces en Java.
