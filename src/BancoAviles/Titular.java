package BancoAviles;

class Titular {
private String nombre;
private String apellidos;
private int edad;

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellidos() {
	return apellidos;
}
public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}


public Titular() {
	super();
}


public Titular(String nombre, String apellidos, int edad) {
	super();
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.edad = edad;
}
//crea informacion
public String obtenerTitular() {
	return "Titular [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + "]";
}
//visualizar los atributos de la clase
@Override
public String toString() {
	return obtenerTitular();
}



}
