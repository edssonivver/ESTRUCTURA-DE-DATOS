package PilaDeClientes;

public class Main {
    public static void main(String[] args) {

        // EJERCICIO 1

        Cliente client1 = new Cliente("Carla", "Mendoza", 18, "Villa Fatima", "Femenino");
        Cliente client2 = new Cliente("Juan", "Gonzales", 27, "Mercedario", "Masculino");
        Cliente client3 = new Cliente("Oscar", "Choque", 25, "Rio Seco", "Masculino");
        Cliente client4 = new Cliente("Ximena", "Ramos", 19, "Alto Tejar", "Femenino");
        Cliente client5 = new Cliente("Pablo", "Gutierrez", 28, "Calacoto", "Masculino");

        PilaCliente pila = new PilaCliente();

        pila.adicionar(client1);
        pila.adicionar(client2);
        pila.adicionar(client3);
        pila.adicionar(client4);
        pila.adicionar(client5);

        // EJERCICIO 1
        System.out.println("=====================================");
        System.out.println("=========== EJRCICIO 1 ==============");
        System.out.println("=====================================");

        pila.mostrar();

        // EJERCICIO 2
        // Determinar cuántos CLIENTES son mayores de 20 años.
        // ○ El método deberá llamarse mayoresCiertaEdad(Pila, edadMayor)
        // ○ El método debe ser creado en la clase MAIN como un método estático.
        // ○ El método/ recibe 2 parámetros
        //■ La Pila de Clientes
        //■ El valor de la edad.
        System.out.println("-------------------------------------");
        System.out.println("=========== EJRCICIO 2 ==============");
        System.out.println("-------------------------------------");
        EdadMayor_20(pila, 20);

        // EJERCICIO 3
        System.out.println("\n\n+++++++++++++++++++++++++++++++++++++");
        System.out.println("=========== EJRCICIO 3 ==============");
        System.out.println("+++++++++++++++++++++++++++++++++++++");

        kEsimoPosicion(pila,3);
        pila.mostrar();

        // EJERCICIO 4
        System.out.println("=====================================");
        System.out.println("=========== EJRCICIO 4 ==============");
        System.out.println("=====================================");

        asignaDireccion(pila,"BELLA VISTA");
        pila.mostrar();

        //EJERCICIO 5

        System.out.println("=====================================");
        System.out.println("=========== EJRCICIO 5 ==============");
        System.out.println("=====================================");
        reordenaPila(pila);
        pila.mostrar();
    }

    // EJERCICIO 2
    // DETERMINAR CUANTOS CLIENTES TIENEN UNA EDAD MAYOR DE 20
    public static void EdadMayor_20(PilaCliente pila, int edad) {

        PilaCliente aux = new PilaCliente();
        Cliente item = null;
        int cont = 0;

        while (!pila.esVacio()) {
            item = pila.eliminar();
            if (item.getEdad() > edad) {
                cont = cont + 1;
            }
            aux.adicionar(item);
        }
        pila.vaciar(aux);
        System.out.printf("\nClientes con una edad mayor a " + edad + " años: " + cont);
    }

    // EJERCICIO 3
    // Mover el kEsimoPosicion elemento al final de la pila.
    public static void kEsimoPosicion(PilaCliente pila, int valorTope) {
        PilaCliente aux = new PilaCliente();
        Cliente nombKesimo = null; // almacena el cliente del kEsimo elemento
        Cliente clienteBorado; // almacena temporalmente el cliente de cada elemento

        while (!pila.esVacio()) {
            clienteBorado = pila.eliminar();
            if (pila.nroElementos() + 1 == valorTope) {
                nombKesimo = clienteBorado;
            } else {
                aux.adicionar(clienteBorado);
            }
        }
        pila.vaciar(aux);
        pila.adicionar(nombKesimo);
    }

    // EJERCICIO 4
    // Cambiar la dirección de algunos CLIENTES de la PILA.
    // SIEMPRE Y CUANDO ESTOS CLIENTES SEAN DEL GENERO FEMENINO
    public static void asignaDireccion(PilaCliente pila, String NuevaDireccion){

        PilaCliente aux = new PilaCliente();
        Cliente item = null;
        int cont = 0;

        while (!pila.esVacio())
        {
            item = pila.eliminar();
            if(item.getGenero()=="Femenino"){
                cont = cont +1;
            }
            if (item.getGenero()=="Femenino"){
                item.setDireccion(NuevaDireccion);
            }
            aux.adicionar(item);
        }
        pila.vaciar(aux);
    }

    //EJERCICIO5
    // REORDENAR LA PILA LOS DE GENERO MASCULINO MANDARLOS A LA BASE
    // LOS DE GENERO FENEMINO MANDARLOS ENCIMA DE LOS DE GENERO MASCULINO

   public static void reordenaPila(PilaCliente pila) {
        PilaCliente aux = new PilaCliente(); // ALMACENAMOS LOS ELEMENTOS DE LA PILA
        PilaCliente auxMasculinos = new PilaCliente(); // ALMACENAMOS LOS ELEMENTOS DE LA PILA del GENERO MASCULINO
        PilaCliente auxFemeninos = new PilaCliente(); // ALMACENAMOS LOS ELEMENTOS DE LA PILA el GENERO FEMEN INO
        Cliente item;

        // Separando los elementos en las pilas auxiliares correspondientes según su género
        while (!pila.esVacio()) {
            item = pila.eliminar();
            if (item.getGenero().equals("Masculino")) {  // para los de genero Masculino
                auxMasculinos.adicionar(item);
            } else {
                auxFemeninos.adicionar(item); // para los de genero femenino
            }
        }
        pila.vaciar(aux); // VACIAMOS LA PILA ORIGINAL

        // Agregando los elementos masculinos a la base de la pila
        while (!auxMasculinos.esVacio()) {
            item = auxMasculinos.eliminar();
            pila.adicionar(item);
        }

        // Agregando los elementos femeninos encima de los masculinos en la pila
        while (!auxFemeninos.esVacio()) {
            item = auxFemeninos.eliminar();
            pila.adicionar(item);
        }
    }
}


