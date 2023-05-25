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
    
       public static void BorraRepetidos(Numeros numeros){

        int valorExtraido= 0;

        int numelementos = numeros.nroElementos();

        int i;

        for ( i=1; i<= numelementos;i++){

            valorExtraido = numeros.eliminar();



            if(!verificarRepetido(valorExtraido, numeros)){

                // si el valor eliminado de la cola aun existe entonces eso valor se repite;

                numeros.insertar(valorExtraido);

            }

        }

        numeros.mostrar();

    }

    public static boolean verificarRepetido(int numeroBuscar, Numeros numeros)

    {     int valorExtraidodelacola;

        int nroElemento= numeros.nroElementos();

        int repetidos=0;

        for( int i=1; i<= nroElemento; i++){

            valorExtraidodelacola =numeros.eliminar();

            if(numeroBuscar == valorExtraidodelacola){

                repetidos=repetidos+1;

            

            else {

                numeros.insertar(valorExtraidodelacola);

            }

        }

        if (repetidos>0){

            return true;

        }else {

            return false;

        }

    }
    
    
}


