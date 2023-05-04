package Defena_pilas_hito3;

public class Main {
    public static void main(String[] args) {


        // EJERCICIO 1

        Estudiante est1 = new Estudiante("William", "Barra", 33, "El Alto", 62,"6778933LP");
        Estudiante est2 = new Estudiante("Juan", "Gonzales", 27, "La Paz", 60,"1234567LP");
        Estudiante est3 = new Estudiante("Oscar", "Choque", 25, "Santa Cruz",71,"1111111SC" );
        Estudiante est4 = new Estudiante("Ximena", "Ramos", 19, "El Alto",80 ,"2222222LP");
        Estudiante est5 = new Estudiante("Pablo", "Gutierrez", 28, "La Paz", 92,"3333333LP");

        PilaDeEstudiantes pila = new PilaDeEstudiantes();

        pila.adicionar(est1);
        pila.adicionar(est2);
        pila.adicionar(est3);
        pila.adicionar(est4);
        pila.adicionar(est5);

        // EJERCICIO 1
        System.out.println("=====================================");
        System.out.println("=========== EJRCICIO 1 ==============");
        System.out.println("=====================================");

        pila.mostrar();

        // EJERCICIO 2
        System.out.println("=====================================");
        System.out.println("=========== EJRCICIO 2 ==============");
        System.out.println("=====================================");

        estudiantesAprobadosElAlto(pila);

        System.out.println("\n===============================================");
        System.out.println("=========== EJRCICIO 2 version 2 ==============");
        System.out.println("===============================================");

        estudiantesAprobadosLp(pila);

        // ejercicioo 3
        System.out.println("\n===================================");
        System.out.println("=========== EJRCICIO 3 ==============");
        System.out.println("=====================================");
        kEsimoPosicion(pila,10);
        pila.mostrar();

        // EJERCICIO 4
        System.out.println("\n===================================");
        System.out.println("=========== EJRCICIO 4 ==============");
        System.out.println("=====================================");
        MandaFinalEstNotaBaja(pila);
        pila.mostrar();

        // EJERCICIO 5
        System.out.println("\n===================================");
        System.out.println("=========== EJRCICIO 5 ==============");
        System.out.println("=====================================");
        reordenaPilaExtSC(pila);
        pila.mostrar();
    }

    // EJERCICIO 2

    public static void estudiantesAprobadosElAlto(PilaDeEstudiantes pila) {

        PilaDeEstudiantes aux = new PilaDeEstudiantes();
        Estudiante item = null;
        int cont = 0;

        while (!pila.esVacio()) {
            item = pila.eliminar();

            if (item.getSede().equals("El Alto")){
                if (item.getNotaFinal() > 51) {
                    cont = cont + 1;
                }
            }
            aux.adicionar(item);

        }
        pila.vaciar(aux);
        System.out.printf("\nEstudiantes con una nota mayor a 51 y se Sede El Alto: " + cont);
    }

    // EJERCICIO 2 version 2

    public static void estudiantesAprobadosLp(PilaDeEstudiantes pila) {

        PilaDeEstudiantes aux = new PilaDeEstudiantes();
        Estudiante item = null;
        int cont = 0;

        while (!pila.esVacio()) {
            item = pila.eliminar();

            String str = item.getCI();
            String substr = str.substring(str.length() -2);


            if (substr.equals("LP")){
                if (item.getNotaFinal() > 51) {
                    cont = cont + 1;
                }
            }
            aux.adicionar(item);

        }
        pila.vaciar(aux);
        System.out.printf("\nEstudiantes con una nota mayor a 51 y se Sede El Alto: " + cont);
    }

    // EJERCICIO 3
    public static void kEsimoPosicion(PilaDeEstudiantes pila, int valorTope) {
        PilaDeEstudiantes aux = new PilaDeEstudiantes();
        Estudiante nombKesimo = null; // almacena el cliente del kEsimo elemento
        Estudiante estudianteBorrado; // almacena temporalmente el cliente de cada elemento

        // VALIDACION PARA QUE NO SE ROMPA
        if (valorTope > pila.nroElementos()){
            System.out.println("EL valor no existe, se mantiene la pila");
            return;
        }

        while (!pila.esVacio()) {
            estudianteBorrado = pila.eliminar();
            if (pila.nroElementos() + 1 == valorTope) {
                nombKesimo = estudianteBorrado;
            } else {
                aux.adicionar(estudianteBorrado);
            }
        }
        pila.vaciar(aux);
        pila.adicionar(nombKesimo);
    }

    //EJERCICIO 4

 public static void MandaFinalEstNotaBaja(PilaDeEstudiantes pila) {
        PilaDeEstudiantes aux = new PilaDeEstudiantes(); // ALMACENAMOS LOS ELEMENTOS DE LA PILA
        PilaDeEstudiantes auxNotasNormales = new PilaDeEstudiantes(); // ALMACENAMOS LOS ELEMENTOS DE LA PILA del GENERO MASCULINO
        PilaDeEstudiantes auxNotaBaja = new PilaDeEstudiantes(); // ALMACENAMOS LOS ELEMENTOS DE LA PILA el GENERO FEMEN INO
        Estudiante item;

        // Separando los elementos en las pilas auxiliares correspondientes según su género
        while (!pila.esVacio()) {
            item = pila.eliminar();
            if (item.getNotaFinal() < 61) {  // para los de genero Masculino
                auxNotasNormales.adicionar(item);
            } else {
                auxNotaBaja.adicionar(item); // para los de genero femenino
            }
        }
        pila.vaciar(aux); // VACIAMOS LA PILA ORIGINAL

        // Agregando los elementos masculinos a la base de la pila
        while (!auxNotasNormales.esVacio()) {
            item = auxNotasNormales.eliminar();
            pila.adicionar(item);
        }

        // Agregando los elementos femeninos encima de los masculinos en la pila
        while (!auxNotaBaja.esVacio()) {
            item = auxNotaBaja.eliminar();
            pila.adicionar(item);
        }
    }


    // EJERCICIO 5
    public static void reordenaPilaExtSC(PilaDeEstudiantes pila) {
        PilaDeEstudiantes aux = new PilaDeEstudiantes(); // ALMACENAMOS LOS ELEMENTOS DE LA PILA
        PilaDeEstudiantes auxExtNormal = new PilaDeEstudiantes(); // ALMACENAMOS LOS ELEMENTOS DE LA PILA del GENERO MASCULINO
        PilaDeEstudiantes auxExtSantaCruz = new PilaDeEstudiantes(); // ALMACENAMOS LOS ELEMENTOS DE LA PILA el GENERO FEMEN INO
        Estudiante item;

        // Separando los elementos en las pilas auxiliares correspondientes según su género
        while (!pila.esVacio()) {
            item = pila.eliminar();
            String str = item.getCI();
            String substr = str.substring(str.length() -2);

            if (substr.equals("SC")) {  // para los de genero Masculino
                auxExtSantaCruz.adicionar(item);
            } else {
                auxExtNormal.adicionar(item); // para los de genero femenino
            }

        }
        pila.vaciar(aux); // VACIAMOS LA PILA ORIGINAL

        // Agregando los elementos masculinos a la base de la pila
        while (!auxExtNormal.esVacio()) {
            item = auxExtNormal.eliminar();
            pila.adicionar(item);
        }

        // Agregando los elementos femeninos encima de los masculinos en la pila
        while (!auxExtSantaCruz.esVacio()) {
            item = auxExtSantaCruz.eliminar();
            pila.adicionar(item);
        }
    }

}
