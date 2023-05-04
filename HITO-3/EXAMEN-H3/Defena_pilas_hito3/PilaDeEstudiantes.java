package Defena_pilas_hito3;

public class PilaDeEstudiantes {
    private int max;    //Siempre // Deternima el maximo de la pila
    private int tope;    //Siempre // Es la cantidad que tenemos la pila
    private Estudiante[] cliente;

    //Constructor
    public PilaDeEstudiantes() {
        this.tope = 0;
        this.max = 10;
        this.cliente = new Estudiante[this.max + 1];
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

    public void adicionar(Estudiante nuevoEstudiante) {
        if (esLleno()) {
            System.out.println("PILA DE CLIENTES LLENA");
        } else {
            tope = tope + 1;
            cliente[tope] = nuevoEstudiante;
        }
    }

    public Estudiante eliminar() {
        Estudiante estudianteEliminado = null;

        if (esLleno() == true) {
            System.out.println("PILA DE CLIENTES VACIA");
        } else {
            estudianteEliminado = cliente[this.tope];
            tope = tope - 1;
        }
        return estudianteEliminado;
    }

    public void vaciar(PilaDeEstudiantes pila) {
        while (pila.esVacio() == false) {
            adicionar(pila.eliminar());
        }
    }

    public void mostrar() {
        Estudiante item = null;

        if (esVacio() == true) {
            System.out.printf("No hay items que mostrar");
        } else {
            System.out.println("\nMostrando la pila de Estudiantes");
            PilaDeEstudiantes aux = new PilaDeEstudiantes();
            while (esVacio() == false) {
                item = eliminar();
                aux.adicionar(item);
                item.muestraEstudiante();
            }
            vaciar(aux);
        }
    }
}
