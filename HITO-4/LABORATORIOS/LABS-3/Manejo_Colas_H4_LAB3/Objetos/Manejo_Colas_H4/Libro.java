package Manejo_Colas_H4.Objetos.Manejo_Colas_H4;

public class Libro {
    private int codigoLibro;
    private String autor;
    private String genero;
    private String categoria;
    private int paginas;

    public Libro(int codigoLibro, String autor, String genero, String categoria, int paginas) {
        this.codigoLibro = codigoLibro;
        this.autor = autor;
        this.genero = genero;
        this.categoria = categoria;
        this.paginas = paginas;
    }

    public int getCodigoLibro() {
        return codigoLibro;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setCodigoLibro(int codigoLibro) {
        this.codigoLibro = codigoLibro;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void mostrar()
    {
        System.out.println("Mostrando datos del Libro");
        System.out.println("Codigo: " + getCodigoLibro());
        System.out.println("Autor: " + getAutor());
        System.out.println("Genero: " + getGenero());
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Paginas: " + getPaginas());
        System.out.println();
    }
}

