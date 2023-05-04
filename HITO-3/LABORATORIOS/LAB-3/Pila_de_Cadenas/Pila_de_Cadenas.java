package Pila_de_Cadenas;

import Pila_de_numeros.Pila_Numeros;
import java.util.Scanner;

public class Pila_de_Cadenas {

    private int max;    //Siempre // Deternima el maximo de la pila
    private int tope;    //Siempre // Es la cantidad que tenemos la pila
    private String[] cadenas;

    //Constructor
    public Pila_de_Cadenas() {
        this.max = 10;
        this.tope = 0;
        this.cadenas = new String[this.max + 1];
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
        return this.tope;
    }

    public String adiciona(String nuevoCadena) {
        if (esLleno() == true) {
            System.out.printf("PILA LLENA");
        } else {
            tope = tope + 1;
            cadenas[tope] = nuevoCadena;
        }
        return nuevoCadena;
    }

    public String elimina() {
        String itemEliminado = " ";
        if (esLleno() == true) {
            System.out.printf("PILA VACIA");
        } else {
            itemEliminado = cadenas[this.tope];
            tope = tope - 1;
        }
        return itemEliminado;
    }

    public void vacia(Pila_de_Cadenas pila) {
        while (pila.esVacio() == false) {
            adiciona(pila.elimina());
        }
    }

    // leer nombres y agregar a la pila de cadenas
    public void llenar(int nroItems){
        Scanner leer  = new Scanner(System.in);  // nos permite leer desde consola
        String nombre = "";
        System.out.println("Llenando la pila de nombres(cadenas)");

        for (int i =0 ; i<nroItems;i++){
            System.out.print("Ingrese el nombre: " + (i+1)+ ": ");
            nombre = leer.nextLine();   // nos permite leer uma palabra
            adiciona(nombre);  //llamando al metodo adicionar "esta arriba"
            System.out.println();
        }
    }


    public void mostrar() {
        String item = " ";

        if (esVacio() == true) {
            System.out.printf("No hay items que mostrar");
        } else {
            System.out.println("\nMostrando la pila de Cadenas");
            Pila_de_Cadenas aux = new Pila_de_Cadenas();
            while (esVacio() == false) {
                item = elimina();
                System.out.println( "Cadena = " +item );
                aux.adiciona(item);
            }
            vacia(aux);
        }
    }

}
