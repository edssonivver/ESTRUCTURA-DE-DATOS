package Pila_de_numeros;

public class Pila_Numeros {

    private int max;    //Siempre // Deternima el maximo de la pila
    private int tope;    //Siempre // Es la cantidad que tenemos la pila
    private int[] numeros;

    //Constructor
    public Pila_Numeros() {
        this.max = 10;
        this.tope = 0;
        this.numeros = new int[this.max + 1];
    }

    public boolean EsVacio() {
        if (this.tope == 0) {
            return true;
        } else {
            return false;
        }
    }

    private boolean esLlena() {
        if (tope == max) {
            return true;
        } else {
            return false;
        }
    }

    public int nroElementos() {
        return this.tope;
    }

    public void adicionar(int nuevoNumero) {
        if (esLlena() == true) {
            System.out.printf("PILA LLENA");
        } else {
            tope = tope + 1;
            numeros[tope] = nuevoNumero;
        }
    }

    public int eliminar() {
        int itemEliminado = 0;
        if (esLlena() == true) {
            System.out.printf("PILA VACIA");
        } else {
            itemEliminado = numeros[this.tope];
            tope = tope - 1;
        }
        return itemEliminado;
    }

    public void vaciar(Pila_Numeros pila) {
        while (pila.EsVacio() == false) {
            adicionar(pila.eliminar());
        }
    }

    public void mostrar() {
        int item = 0;

        if (EsVacio() == true) {
            System.out.printf("No hay items que mostrar");
        } else {
            System.out.println("\nMostrando la pila de numeros");
            Pila_Numeros aux = new Pila_Numeros();
            while (EsVacio() == false) {
                item = eliminar();
                System.out.println( "Numero = " +item );
                aux.adicionar(item);
            }
            vaciar(aux);
        }
    }
}
