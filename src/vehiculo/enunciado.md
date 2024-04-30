Ejercicio 2: PruebaVehiculo.
    1.- Crear una clase Vehículo que contendrá propiedades básicas comunes a todos los vehículos.

        • Los atributos serán: matricula, color del vehículo, número de ruedas, cilindrada, potencia.
        • Métodos constructores:
        ✓ Uno con matricula, color y número de ruedas.(realizado)
        ✓ Otro con matricula, el color, número de ruedas y cilindrada.(realizado)
        ✓ Otro con la matricula, el color, numero de ruedas, cilindrada, potencia.(realizado)
       
        • Otros métodos:
            ✓ Un método que permite asignar la cilindrada.
            ✓ Un método que permita asignar la potencia.
            ✓ Un método para cada uno de los atributos que permita devolver su valor.
            ✓ Sobrescribir el método toString de forma que retorne una cadena con los valores
                de los atributos.


    2.- Crear una clase Coche que derive de la clase vehículos con:

        • Los siguientes atributos: numPuertas
        • Métodos constructores: (al invocar con “super” al constructor de la clase base/padre hay
          que pasarle también el número de ruedas que para un coche es siempre 4).
            ✓ Uno con la matrícula y color.(realizado)
            ✓ Otro con la matricula, color y cilindrada.(realizado)
            ✓ Otro con la matricula, color, cilindrada y potencia.(realizado)
            ✓ Otro con la matricula, color, cilindrada, potencia y numPuertas.(realizado)
            
        • Otros métodos:
            ✓ Un método que permite asignar el numPuertas.
            ✓ Un método que permita devolver el numPuertas.
            ✓ Sobrescribir el método toString de forma que retorne una cadena con los valores
             de los atributos.


    3.- Crear una clase PruebaVehiculo con un método main. En él se deberán:
    
        • Crear dos variables objetos una cochePepe y otro cocheMaria. Utilizar los constructores
        oportunos para crear los correspondientes objetos, teniendo en cuenta que:
        ✓ Los datos del cochePepe serán matricula =“0000BBB” color “gris plata” y el
        número de puertas es 3.
        ✓ Los datos del cocheMaria serán matrícula ”1111CCC” color rojo y 5 puertas.
        • Visualizar los datos del cochePepe y del cocheMaria.