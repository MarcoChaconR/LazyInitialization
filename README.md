# LazyInitialization
Lazy Initialization es la técnica de retrasar la creación de un objeto, el cálculo de un valor o algún otro proceso costoso hasta la primera vez que se necesita. 
Es un tipo de evaluación perezosa que se refiere específicamente a la creación de instancias de objetos u otros recursos.

Esto generalmente se logra aumentando un método de acceso (o captador de propiedades) para verificar si un miembro privado, que actúa como un caché, ya se ha inicializado. 
Si es así, se devuelve inmediatamente. De lo contrario, se crea una nueva instancia, se coloca en la variable miembro y se devuelve a la persona que llama justo a tiempo
para su primer uso.

Si los objetos tienen propiedades que rara vez se usan, esto puede mejorar la velocidad de inicio. 
El rendimiento promedio promedio del programa puede ser ligeramente peor en términos de memoria (para las variables de condición) y ciclos de ejecución (para verificarlos), pero el impacto de la creación de instancias de objetos se distribuye en el tiempo ("amortizado") en lugar de concentrarse en la fase de inicio de un sistema y, por lo tanto, los tiempos de respuesta promedio se pueden mejorar considerablemente.
