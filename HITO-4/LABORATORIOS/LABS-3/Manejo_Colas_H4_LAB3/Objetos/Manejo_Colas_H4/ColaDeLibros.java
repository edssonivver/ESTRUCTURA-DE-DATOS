package Manejo_Colas_H4.Objetos.Manejo_Colas_H4;

public class ColaDeLibros {
    private int max;
    private int ini;
    private int fin;
    private Libro[] libros;


    public ColaDeLibros(){
        this.max = 100;
        this.ini = 0;
        this.fin = 0;
        this.libros = new Libro[this.max+1];
    }

    public boolean esVacia(){
        if (ini == 0 && fin == 0)
        {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean esLlena(){
        if (fin == max)
        {
            return true;
        }
        else {
            return false;
        }
    }

    public void adicionar(Libro NuevoLibro) {
        if (esLlena()) {
            System.out.println("Cola de Libros LLENA");
        } else {
            fin = fin + 1;
            libros[fin] = NuevoLibro;
        }
    }

    public Libro eliminar() {
        Libro elemento = null;

        if (esLlena()) {
            System.out.println("COLA DE LIBROS VACIA");
        } else {
            ini = ini + 1;
            elemento = libros[this.ini];
            if (ini == fin) {
                ini = 0;
                fin = 0;
            }
        }
        return elemento;
    }

    public int NrElementos() {
        return fin - ini;
    }

    public void vaciar(ColaDeLibros cola) {
        while (!cola.esVacia()) {
            adicionar(cola.eliminar());
        }
    }

    public void mostrar() {
        if (esVacia()) {
            System.out.println("No hay items que mostrar");
        } else {
            Libro elemEliminado;
            System.out.println("\nMostrando la cola de Libros");
            ColaDeLibros aux = new ColaDeLibros();
            while (!esVacia()) {
                elemEliminado = eliminar();
                elemEliminado.mostrar();
                aux.adicionar(elemEliminado);
            }
            vaciar(aux);
        }
    }
}

