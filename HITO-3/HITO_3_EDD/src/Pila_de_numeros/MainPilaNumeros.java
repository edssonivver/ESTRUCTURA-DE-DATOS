package Pila_de_numeros;

public class MainPilaNumeros {
    public static void main(String[] args) {
        Pila_Numeros pila1 = new Pila_Numeros();

        pila1.adicionar(10);
        pila1.adicionar(2);
        pila1.adicionar(5);
        pila1.adicionar(23);
        pila1.adicionar(5);

        pila1.mostrar();

        muestraNumeroMaximo(pila1);

        pila1.mostrar();

        MuestraSimilitud(pila1,5);
    }


    public static void muestraNumeroMaximo(Pila_Numeros pila) {
        Pila_Numeros aux = new Pila_Numeros();
        int num = 0;
        int max =0;


        while (!pila.EsVacio())
        {
            num = pila.eliminar();
            if (num > max){
                max = num;
            }
            aux.adicionar(num);
        }
        pila.vaciar(aux);
        System.out.printf("\nMAYOR " + max);
    }


    // Determinar cauntos numeros 5 hay en la pila
    // crear el metodo estatico, imiliar a la anterior
    // el metodo estatico recibe dos parametros
    // la pila
    // el numero a busacar en la pila

    public static void MuestraSimilitud(Pila_Numeros pila, int Buscanumero) {
        Pila_Numeros aux = new Pila_Numeros();
        int contador = 0 ;
        int numerEliminado = 0 ;

    while (pila.EsVacio() == false)
    {
        numerEliminado = pila.eliminar();
        if(numerEliminado == Buscanumero){
            contador = contador+1;
        }
        aux.adicionar(numerEliminado);
    }
        pila.vaciar(aux);
        System.out.printf("\nEl numero "+ Buscanumero + " Se repite "+ contador +" veces");
    }

    // TAREA
    // intercambiar el valor maximo con el valor minimo
}
