package Pila_de_numeros;

// conceptos
// Pilas: LOS PRIMEROS EN ENTRAR SON LOS ULTIMOS EN SALIR Y LOS ULTIMOS SON LOS PRIMEROS
// Tope: cantidad de elementos ue tiene una pila
// Max: el la cantidad de elemnetos maximos que tiene una pila



public class MainPilaNumeros {
    public static void main(String[] args) {
        Pila_Numeros pila1 = new Pila_Numeros();

        pila1.adicionar(10);
        pila1.adicionar(2);
        pila1.adicionar(5);
        pila1.adicionar(23);
        pila1.adicionar(5);


        /*
        pila1.mostrar();
        muestraNumeroMaximo(pila1);
        pila1.mostrar();
        MuestraSimilitud(pila1,5); */

        pila1.mostrar();
        cambioPosiciones(pila1);
        pila1.mostrar();

        cantidadParImpar(pila1);

        System.out.println("Metodo de inge");
        agrega_base(pila1,184);
        pila1.mostrar();

        System.out.println("Mi metodo");
        agregarNumeroalaBase(pila1);
        pila1.mostrar();

    }

    /*
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
    */

    // TAREA
    // intercambiar el valor maximo con el valor minimo

    public static int muestraNumMax(Pila_Numeros pila) {

        Pila_Numeros aux = new Pila_Numeros();
        int num = 0, max = 0;

        while (!pila.EsVacio()) {
            num = pila.eliminar();
            if (num > max) {
                max = num;
            }
            aux.adicionar(num);
        }
        pila.vaciar(aux);
        System.out.println("MAYOR = " + max);
        return max;
    }

    public static int muestraNumMin(Pila_Numeros pila) {
        Pila_Numeros aux = new Pila_Numeros();
        int num = 0, numaux = 0, min = 0;
        while (!pila.EsVacio()) {
            num = pila.eliminar();
            if (num < numaux) {
                min = num;
            }
            numaux = num;
            aux.adicionar(num);
        }
        pila.vaciar(aux);
        System.out.println("MENOR= " + min);
        return min;
    }

    public static void cambioPosiciones(Pila_Numeros pila) {

        Pila_Numeros aux = new Pila_Numeros();
        int max = muestraNumMax(pila);
        int min = muestraNumMin(pila);
        int num = 0;
        while (!pila.EsVacio()) {
            num = pila.eliminar();
            if (max == num) {
                aux.adicionar(min);
            } else {
                if (min == num) {
                    aux.adicionar(max);
                } else {
                    aux.adicionar(num);
                }
            }
        }
        pila.vaciar(aux);
    }

    // ============================================================
    //  ======================== CLASE 2 H3 =======================

    // MOSTRAR LA CANTIDAD DE PARES E IMPARES DENTRO DE LA PILA
    private static void cantidadParImpar(Pila_Numeros pila) {
        int item = 0;
        int cimpar = 0;
        int cpar = 0;

        Pila_Numeros aux = new Pila_Numeros();
        while (!pila.EsVacio()) {
            item = pila.eliminar();
            if (item % 2 == 0) {
                cpar++;
            } else {
                if (item % 2 != 0) {
                    cimpar++;
                }
            }
            aux.adicionar(item);
        }
        pila.vaciar(aux);

        System.out.println("Cantidad de pares: " + cimpar);
        System.out.println("Cantidad de impares: " + cpar);
    }

    // ============================================================
    // EJERCICIO 2
    // AGREGAR EN LA BASE DE LA PILA EL NUMERO 100

    // METODO DEL INGE

    public static void agrega_base(Pila_Numeros pila , int item){
        Pila_Numeros aux = new Pila_Numeros();
        aux.vaciar(pila); // vacia la pila en un auxiliar
        aux.adicionar(item); // agregamos el nuevo elemento
        pila.vaciar(aux); // ponemos la pila guardad en sobre el item
    }

    // Mi modo
    public static void agregarNumeroalaBase (Pila_Numeros pila){
        int numeroBase = 100;

        Pila_Numeros aux = new Pila_Numeros();

        while (!pila.EsVacio()) {
        aux.adicionar(pila.eliminar());
        }
        pila.adicionar(numeroBase);

        while (!aux.EsVacio()){
            pila.adicionar(aux.eliminar());
        }
    }

}
