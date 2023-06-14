package ColaDeClientes;

public class ColaDeClientes {
    private int max;
    private int ini;
    private int fin;
    private Cliente[] client;


    public ColaDeClientes(){
        this.max = 100;
        this.ini = 0;
        this.fin = 0;
        this.client = new Cliente[this.max+1];
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

    public void adicionar(Cliente NuevoCliente) {
        if (esLlena()) {
            System.out.println("COLA DE CLIENTES LLENA");
        } else {
            fin = fin + 1;
            client [fin] = NuevoCliente;
        }
    }

    public Cliente eliminar() {
            Cliente elemento = null;

        if (esLlena()) {
            System.out.println("COLA DE CLIENTES VACIA");
        } else {
            ini = ini + 1;
            elemento = client[this.ini];
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

    public void vaciar(ColaDeClientes cola) {
        while (!cola.esVacia()) {
            adicionar(cola.eliminar());
        }
    }

    public void mostrar() {
        if (esVacia()) {
            System.out.println("No hay items que mostrar");
        } else {
            Cliente elemEliminado;
            System.out.println("\nMOSTRANDO LA COLA DE CLIENTES\n");
            ColaDeClientes aux = new ColaDeClientes();
            while (!esVacia()) {
                elemEliminado = eliminar();
                elemEliminado.mostrar();
                aux.adicionar(elemEliminado);
            }
            vaciar(aux);
        }
    }

}
