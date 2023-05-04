package H3_Libros;

import Pila_de_Cadenas.Pila_de_Cadenas;

import java.util.Scanner;

public class Pila_de_Libros {
    private int max;    //Siempre // Deternima el maximo de la pila
    private int tope;    //Siempre // Es la cantidad que tenemos la pila
    private Libro[] libros;

    //Constructor
    public Pila_de_Libros() {
        this.tope = 0;
        this.max = 10;
        this.libros = new Libro[this.max + 1];
    }

    public boolean esVacio() {
        if (this.tope == 0) {
            return true;
        } else {
            return false;
        }
    }

    private boolean esLleno() {
        if (tope == max) {
            return true;
        } else {
            return false;
        }
    }

    public int nroElementos() {
        return tope;
    }

    public void adicionar(Libro nuevoLibro) {
        if (esLleno()) {
            System.out.println("PILA DE LIBROS LLENA");
        } else {
            tope = tope + 1;
            libros[tope] = nuevoLibro;
        }
    }

    public Libro eliminar() {
        Libro libroEliminado = null;

        if (esLleno() == true) {
            System.out.println("PILA DE LIBROS VACIA");
        } else {
            libroEliminado = libros[this.tope];
            tope = tope - 1;
        }
        return libroEliminado;
    }

    public void vaciar(Pila_de_Libros pila) {
        while (pila.esVacio() == false) {
            adicionar(pila.eliminar());
        }
    }

   /*
    // leer nombres y agregar a la pila de cadenas
    public void llenar(int nroItems){
        Scanner leer  = new Scanner(System.in);  // nos permite leer desde consola
        String nombre = "";
        System.out.println("Llenando la pila de nombres(cadenas)");

        for (int i =0 ; i<nroItems;i++){
            System.out.print("Ingrese el nombre: " + (i+1)+ ": ");
            nombre = leer.nextLine();   // nos permite leer uma palabra
            adicionar(nombre);  //llamando al metodo adicionar "esta arriba"
            System.out.println();
        }
    }
*/

    public void mostrar() {
        Libro item = null;

        if (esVacio() == true) {
            System.out.printf("No hay items que mostrar");
        } else {
            System.out.println("\nMostrando la pila de Libros");
            Pila_de_Libros aux = new Pila_de_Libros();
            while (esVacio() == false) {
                item = eliminar();
                aux.adicionar(item);
                item.mostrarLibro();
            }
            vaciar(aux);
        }
    }
}
