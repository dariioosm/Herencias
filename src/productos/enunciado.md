Hacer un programa en Java POO que gestione una serie de productos.

Los productos tienen los siguientes atributos:
    ▪ Nombre (alfanumérico)✅
    ▪ Código (alfanumérico)✅
    ▪ Precio (real)✅

Tenemos dos tipos de productos:
    ▪ No perecedero: tiene un atributo llamado tipo (alfanumérico)✅
    ▪ Perecedero: tiene un atributo llamado días a caducar ( de 1 a 5)
    Crea sus constructores, getters, setters y toString.✅

    Tendremos un método llamada calcular, que según cada clase hará una cosa u otra, a
    este método le pasaremos un número siendo la cantidad de productos.
    
    ▪ En NoPerecedero, simplemente seria multiplicar el precio por la cantidad de productos pasados.✅
    ▪ En Perecedero, aparte de lo que hace producto, el precio se reducirá según los días a caducar:✅
    
        ▪ Si le queda 1 día para caducar, se reducirá 4% el precio final.✅
        ▪ Si le quedan 2 días para caducar, se reducirá 3.5% el precio final.✅
        ▪ Si le quedan 3 días para caducar, se reducirá 3% el precio final.✅
        ▪ Si le quedan 4 días para caducar, se reducirá 2.5% el precio final.✅
        ▪ Si le quedan 5 días para caducar, se reducirá 2% el precio final.✅

            NoPerecedero (“LataAtun”,”LT”,2.34,”Latas”)
            NoPerecedero (“Sopa Vegetal”,”SP”,1.24,”Sobres”)
            NoPerecedero (“PastaII”,”PT”,4.34,”Embasado”)
            Perecedero(“Lubina”,”LB”,16.34,2)
            Perecedero(“Tomates”,”TA”,11.44,3)
            Perecedero(“Naranjas”,”NJ”,6.34,1)
            Perecedero(“Tomates”,”TM”,3.55,4)

Crea una clase ejecutable donde se manejen distintas estructuras de datos y métodos.
Crear un menú que permita hacer lo siguiente:

    (Crear lo de abajo en una clase)

    ➢ Grabar los productos en un fichero.
    ➢ Añadir nuevos productos a través del teclado si el código esta repetido en algún producto, no se agregará .
    ➢ Calcular el importe total de vender una cantidad determinada de cada uno de los productos que figuran en el ArrayList.
        PRODUCTO: nombre (ej: Tomates)
        INTRODUCIR CANTIDAD VENDIDA: unidades (ej:10)

Mostrar datos:

    NoPerecederos : nombre, precio, cantidad, importe.
    Perecederos: nombre, precio, cantidad, importe, importe con descuento.
    ➢ Eliminar productos: dado un nombre, eliminar todos los productos con ese
    nombre.



    ✓ Diseñar las clases necesarias utilizando herencia, añadir los constructores
    adecuados, getters, setters, atributos y métodos.
    ✓ POO. Métodos.
    ✓ Controlar posibles errores en la entrada de datos.
    ✓ Utilizar Exceptions .
    ✓ Utilizar Arrays y ArraysList.
    ✓ Debe funcionar en su totalidad.