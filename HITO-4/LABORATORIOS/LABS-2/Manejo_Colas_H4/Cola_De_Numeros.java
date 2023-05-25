package Manejo_Colas_H4;

public class Cola_De_Numeros{
    private int max;
    private int ini;
    private int fin;
    private int[] numeros;


    public Cola_De_Numeros(){
    this.max = 100;
    this.ini = 0;
    this.fin = 0;
    this.numeros = new int[this.max];
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


    public void adicionar(int Nuevonumeros) {
        if (esLlena()) {
            System.out.println("Cola de Numeros LLENA");
        } else {
            fin = fin + 1;
            numeros[fin] = Nuevonumeros;
        }
    }

    public int eliminar() {
        int NumeroElimimado = 0;

        if (esLlena()) {
            System.out.println("COLA DE NUMEROS VACIA");
        } else {
            ini = ini + 1;
            NumeroElimimado = numeros[this.ini];
            if (ini == fin) {
                ini = 0;
                fin = 0;
            }
        }
        return NumeroElimimado;
    }



    public int NrElementos() {
    return fin - ini;
    }

    public void vaciar(Cola_De_Numeros colaNum) {
        while (!colaNum.esVacia()) {
            adicionar(colaNum.eliminar());
        }
    }


    public void mostrar() {
        int item = 0;
        if (esVacia()) {
            System.out.println("No hay items que mostrar");
        } else {
            System.out.println("\nMostrando la cola de Numeros");
            Cola_De_Numeros aux = new Cola_De_Numeros();
            while (!esVacia()) {
                item = eliminar();
                System.out.println("Numeros: " + item);
                aux.adicionar(item);
            }
            vaciar(aux);
        }
    }

    public int getIni() {
        return ini;
    }

    public int getFin() {
        return fin;
    }
}



