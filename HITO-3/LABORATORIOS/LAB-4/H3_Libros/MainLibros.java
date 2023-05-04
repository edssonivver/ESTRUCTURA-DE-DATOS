package H3_Libros;

import Pila_de_numeros.Pila_Numeros;

public class MainLibros {
    public static void main(String[] args) {

        Libro lib1 = new Libro("Homero",500,30.00,"La odisea","Historia");
        Libro lib2 = new Libro("Homero",300,20.00,"La iliada","Historia");

       Pila_de_Libros pila = new Pila_de_Libros();

       pila.adicionar(lib1);
       pila.adicionar(lib2);

       pila.mostrar();

       MostrarCostoLibrosMayor25(pila,25);
       //METODO DEL INGE
        Mayora25(pila,25);

        MostrarLibroConDescuento(pila,"Historia");
        pila.mostrar();


        // PILA DE LIBROS 2 B

        Libro lib1B = new Libro("Juanito",250,50.00,"Pinocho","Fantasia");
        Libro lib2B = new Libro("Jhona",100,10.00,"Pinocho2","Fantasia");

        Pila_de_Libros pilaB = new Pila_de_Libros();

        pilaB.adicionar(lib1B);
        pilaB.adicionar(lib2B);

        pilaB.mostrar();

        PrecioMayor(pila);
        PrecioMayor(pilaB);

    }

// ======================================================================
// ======================        Pila A           =======================
// ======================================================================


    // DETERMINAR CUANTOS LIBROS TIENE UN COSTO DE 25
    public static void MostrarCostoLibrosMayor25(Pila_de_Libros pila, double precio){

        Libro auxitem = null;
        Pila_de_Libros aux = new Pila_de_Libros();

        int contador = 0 ;

        while (pila.esVacio() == false)
        {
            auxitem = pila.eliminar();
            if(auxitem.getPrecio() > precio){
                contador++;
            }
            aux.adicionar(auxitem);
        }
        pila.vaciar(aux);
        System.out.printf("\nLibros con precio mayor a "+ precio + " bs ="+ contador);

    }


    // METODO DEL INGE
// DETERMINAR CUANTOS LIBROS TIENE UN COSTO DE 25
    public static void Mayora25(Pila_de_Libros pila, double precio){

        Pila_de_Libros aux = new Pila_de_Libros();
        Libro item = null;
        int cont =0;

        while (!pila.esVacio())
        {
          item = pila.eliminar();
          if(item.getPrecio()>precio){
              cont = cont +1;
            }
            aux.adicionar(item);
        }
        pila.vaciar(aux);
        System.out.printf("\nLibros con precio mayor a "+ precio + " bs ="+ cont);
    }

    // A LOS LIBROS DE LA CATEGORIA HISTORIA HACER UN DESCUENTO DEL 10% AL PREIO DEL LIBRO
    // EL METODO DEBERA CAMBIAR EL PRECIO

    public static void MostrarLibroConDescuento(Pila_de_Libros pila , String categoria)
    {
        Pila_de_Libros aux = new Pila_de_Libros();

        Libro item = null;
        int descont = 0;

        while (!pila.esVacio())
        {
            item = pila.eliminar();
            if(item.getCategoria() == categoria){
                item.setPrecio(item.getPrecio() - item.getPrecio()*0.1);;
            }
            aux.adicionar(item);
        }
        pila.vaciar(aux);

    }

    // ======================================================================
    // ======================        Pila B           =======================
    // ======================================================================

    public static double PrecioMayor(Pila_de_Libros pila) {

        Pila_de_Libros aux = new Pila_de_Libros();
        Libro lib = null;

        double max = Integer.MAX_VALUE;

        while (!pila.esVacio()) {
            lib = pila.eliminar();
            if (lib.getPrecio() > max) {
                max = lib.getPrecio();
            }
            aux.adicionar(lib);
        }
        pila.vaciar(aux);
        System.out.println("PRECIO MAYOR = " + max);
        return max;
    }


}






