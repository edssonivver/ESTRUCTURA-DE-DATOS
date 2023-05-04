package Pila_de_Cadenas;

public class Main_Pila_de_Cadenas {
    public static void main(String[] argv) {

        Pila_de_Cadenas pila2 = new Pila_de_Cadenas();

        pila2.adiciona("William");
        pila2.adiciona("Andres");
        pila2.adiciona("Josias");
        pila2.adiciona("Iris");
        pila2.adiciona("Jonathan");
        pila2.adiciona("Ilia");

        pila2.mostrar();


        //   pila2.llenar(6);
        //   pila2.mostrar();

        cuentaNombre(pila2, "Andres"); // buscando el nombre


        //incorporarNombre(pila2,"Ana");
        //pila2.mostrar();

        moverPosiciones(pila2);
        pila2.mostrar();


        kesimo(pila2,3);
        pila2.mostrar();

    }

    public static void kesimo (Pila_de_Cadenas pila, int nroKesimo){
        Pila_de_Cadenas aux = new Pila_de_Cadenas();
        String nombreKesimo ="";
        String itemEliminado = "";

        while (!pila.esVacio()){
            itemEliminado = pila.elimina();
            if (pila.nroElementos()+1 == nroKesimo){
                nombreKesimo = itemEliminado;
            }else {
                aux.adiciona(itemEliminado);
            }
        }
        pila.vacia(aux);
        pila.adiciona(nombreKesimo);

    }

    // Cambair las posiciones el primero al ultimo y el ultimo al primero
    public static void moverPosiciones (Pila_de_Cadenas pila){
        Pila_de_Cadenas aux = new Pila_de_Cadenas();
        String item1 = pila.elimina(); // se almacena Ilia
        aux.vacia(pila);
        String item2 = aux.elimina(); // se almacena William
        pila.adiciona(item1);
        pila.vacia(aux);
        pila.adiciona(item2);
    }




    // Incorpora un nombre a la pila
    public static void incorporarNombre(Pila_de_Cadenas pila, String nombre){

        Pila_de_Cadenas aux = new Pila_de_Cadenas();

        String itemEliminado = "";

        while (!pila.esVacio()) {
            itemEliminado = pila.elimina();
            if (itemEliminado.equals("Andres"))
            {
                aux.adiciona(nombre); //adicionamos el nombre
            }
            aux.adiciona(itemEliminado);
        }
        pila.vacia(aux);
    }



    //LLENAR CUANTAS PERSONAS QUE SE LLAMAN ANDRES
    public static void cuentaNombre(Pila_de_Cadenas pila, String nombre) {
        Pila_de_Cadenas aux = new Pila_de_Cadenas();

        String itemEliminado = "";
        int cont = 0;

        while (!pila.esVacio()) {
            itemEliminado = pila.elimina();
            if (itemEliminado.equals(nombre)) // buscamos si existe el nombre // .equals es "==" en ingles
            {
                cont++; // vamos recorriendo "Pocisiones"
            }
            aux.adiciona(itemEliminado);
        }
        pila.vacia(aux);
        System.out.println(" \n El numero de nombres "+ nombre + "es: " + cont);
    }


}
