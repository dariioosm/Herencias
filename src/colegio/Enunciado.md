Ejercicio 1: Curso.
Se trata de crear un nuevo proyecto con el nombre ProyectoDistancia en que definamos las
siguientes clases:

    1. Crear una clase llamada Persona con:
        ▪ Tres atributos para almacenar el nombre, los apellidos y el año de nacimiento
        ▪ Definir los métodos getter y setter
        ▪ Un método public llamado “imprime” que permita visualizar el siguiente mensaje
        “Datos Personales: .nombre..... nació en el año .......”

    2. Crear una clase llamada Alumno, que hereda de la clase Persona, que tenga:
        ▪ Dos atributos protected: grupo (tipo String) y horario (tipo String)
        ▪ Un método public llamado grupo_turno que pasados dos parámetros (grupo y horario)
        permita asignar los correspondientes atributos.
        ▪ Un método para ver los datos del alumno.

    3. Definir una clase Curso con un método main.
        Crear un objeto llamado “alum1” de tipo alumno y asignarle como atributos
        nombre, apellidos y añoDeNacimiento tus datos personales y como grupo (daw1) y horario
        (mañana).
        Visualizar utilizando los métodos definidos en las clases los datos personales y los del grupo.

        Crear el objeto “alum2” con los datos: Álvarez Pérez Pepito;1975; Distancia ; Tarde.
    
    4. Crear la clase Profesor que hereda de la clase Persona y tiene como atributos: Departamento
    al que pertenece y NRP (número de registro personal). Crear dos objetos profesor y visualizar
    todos sus datos.