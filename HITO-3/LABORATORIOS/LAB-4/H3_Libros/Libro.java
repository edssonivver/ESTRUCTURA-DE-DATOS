package H3_Libros;

import java.util.SortedSet;

public class Libro {
    private String autor;
    private int nroPag;
    private double precio;
    private String titulo;
    private String categoria;


    public Libro(String autor, int nroPag, double precio, String titulo, String categoria) {
        this.autor = autor;
        this.nroPag = nroPag;
        this.precio = precio;
        this.titulo = titulo;
        this.categoria = categoria;
    }


    public String getAutor() {
        return autor;
    }

    public int getNroPag() {
        return nroPag;
    }

    public double getPrecio() {
        return precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNroPag(int nroPag) {
        this.nroPag = nroPag;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

public void mostrarLibro(){
    System.out.println("Mostrando Libro");
    System.out.println("Autor: "+ autor);
    System.out.println("NroPag: "+ nroPag);
    System.out.println("Precio: "+ precio);
    System.out.println("Titulo: "+ titulo);
    System.out.println("Categoria: "+ categoria);
    System.out.println();

}

}


