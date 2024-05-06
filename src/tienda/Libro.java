package tienda;

public class Libro extends Articulo {
    private int isbn;
    private int numPag;
    private String autor;

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Libro() {
        super();
    }

    public Libro(int referencia, String nombre, int precio, int numPag, String autor) {
        super(referencia, nombre, precio);
        this.numPag = numPag;
        this.isbn = isbn;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return super.toString() + "Libro -> ISBN: " + isbn + ", NumPaginas: " + numPag + ", Autor: " + autor;
    }

}
