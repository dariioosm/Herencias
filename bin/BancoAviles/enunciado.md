Ejercicio 4: BancoAvilés.

1. Diseñar una clase Titular con:
        • Tres atributos private correspondientes al nombre, apellidos y edad ✅✅
        • Escribir un método para que devuelva una cadena formada por el nombre, el apellido y
        los años que tiene. ✅✅


2. Diseñar una clase llamada CuentaCorriente con:
    • Tres atributos de tipo private:
        ✓ Uno de tipo Titular que almacenará el nombre, los apellidos y la edad. 
            (Llamada al toString de Titular)✅✅
        ✓ Uno de tipo String para el número de cuenta.✅✅
        ✓ Uno de tipo Double para el saldo.✅✅
    • Otros métodos
        ✓ Un método llamado setSaldo que permita asignar el saldo con un valor que se pasará como parámetro. ✅✅
        ✓ Un método llamado ingreso que permitirá ingresar en la cuenta una determinada cantidad que se pasará como parámetro.✅✅
        ✓ Un método llamado reintegro que permitirá sacar de la cuenta una determinada
        cantidad que se pasará como parámetro.✅✅
        ✓ Un método llamado getSaldo que devolverá un saldo.✅✅
        ✓ Un método llamado getNumCta que devolverá la cuenta.❓❓
        ✓ Sobrescribir el método toString para que visualice toda la información.✅✅


3. Diseñar una clase llamada BancoAviles con un método main con la siguiente información:
    • Definir una variable de tipo Titular llamada titular1.
    • Asignarle los valores nombre=”Noe”, apellidos “Tira Donada”, edad = 39.
    • Crear una cuenta corriente a ctaTitular1 y asignarle como número de cuenta “000001”.
    • Ingresar 1000 € en la cuenta.
    • Sacar 300€.
    • Visualizar todos los datos de la cuenta ctaTitular y su saldo.

4. Desarrollar una clase llamada CuentaAhorro que:
    • Es una especialización de la CuentaCorriente.✅✅
    • Atributos
        ✓ Tiene un atributo más de tipo privado llamado interes de tipo double.✅✅
    • Otros métodos
        ✓ Un método llamado setInteres que pasado un parámetro permita asignarlo como
        interés✅✅
        ✓ Un método llamado getInteres que devuelva el interes aplicado✅✅
        ✓ Un método llamado calcular los Intereses e ingresarlos en la cuenta.
        (Saldo+saldo*interes/100)
        ✓ Un método para visualizar todos los datos.

5. Modificar el main y crear al final una cuenta de ahorro para Noe. 
    El número de cuenta será: 000002, se abrirá sin saldo y se le aplicará un interés del 2.5%
    
    • Hacer un ingreso de 3000€ y visualizar el número de la cuenta, el nombre del titular y el
    saldo antes de calcular los intereses.
    
    • Calcular los intereses e ingresarlos en cuenta. Visualizar todos los datos de la cuenta de
    ahorro.