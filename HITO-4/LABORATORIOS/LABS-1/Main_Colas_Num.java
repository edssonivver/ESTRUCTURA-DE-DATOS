package Manejo_Colas_H4;

public class Main_Colas_Num {
    public static void main(String[] args) {

        Cola_De_Numeros cola = new Cola_De_Numeros();
        cola.adicionar(1);
        cola.adicionar(2);
        cola.adicionar(3);
        cola.adicionar(4);
        cola.adicionar(5);
        cola.adicionar(6);
        cola.adicionar(4);

        cola.mostrar();

        DetNumMutl3(cola);
    }

    // DETERMINA MULTIPLOS DE 3
    public static void DetNumMutl3 (Cola_De_Numeros cola)
    {
        int item = 0;
        int cont = 0;

        Cola_De_Numeros aux = new Cola_De_Numeros();

        while (!cola.esVacia())
        {
            item = cola.eliminar();
            if ( item%3 == 0)
                cont++;
            aux.adicionar(item);
        }
        cola.vaciar(aux);
        System.out.println("Multiplos :"+cont);
    }

    // ELIMINA NUMEROS REPETIDOS
    /*public static void eliminarElementosRepetidos(Cola_De_Numeros cola)
    {

    }*/
}


