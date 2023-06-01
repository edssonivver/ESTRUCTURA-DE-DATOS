package Manejo_Colas_H4;

public class Main_Colas_Num {
    public static void main(String[] args) {

        Cola_De_Numeros cola = new Cola_De_Numeros();
        cola.adicionar(4);
        cola.adicionar(6);
        cola.adicionar(8);
        cola.adicionar(10);
        cola.adicionar(5);
        cola.adicionar(6);

//        cola.mostrar();
//
//        DetNumMutl3(cola);
//
//        BorraRepetidos(cola);

        BorraRepetidos(cola);
        verifiacSiExisteUnoMas(cola,6);
    }

    // DETERMINA MULTIPLOS DE 3
    public static void DetNumMutl3(Cola_De_Numeros cola) {
        int item = 0;
        int cont = 0;

        Cola_De_Numeros aux = new Cola_De_Numeros();

        while (!cola.esVacia()) {
            item = cola.eliminar();
            if (item % 3 == 0)
                cont++;
            aux.adicionar(item);
        }
        cola.vaciar(aux);
        System.out.println("Multiplos :" + cont);
    }


    public static void BorraRepetidos(Cola_De_Numeros cola) {
        int nroElementos = cola.NrElementos();
        int item;

        for (int i = 1; i <= nroElementos; i++) {
            item = cola.eliminar();
            if(!verifiacSiExisteUnoMas(cola,item)){
                cola.adicionar(item);

                System.out.println("num: " +item);
            }

//            System.out.println("num =" + item);
//            cola.adicionar(item);
        }

        //     System.out.println("ini =" + cola.getIni());
//       System.out.println("Fin =" + cola.getFin());
    }


    public static boolean verifiacSiExisteUnoMas(Cola_De_Numeros cola, int num) {
        int cont = 0;
        int item = 0;
        int nroelem = cola.NrElementos();

        for (int i = 1; i <= nroelem; i++) {
            item = cola.eliminar();
            if (item == num) {
                cont = cont + 1;
            }
            cola.adicionar(item);
        }

        if (cont > 0)
            return true;
        return false;
    }
}


