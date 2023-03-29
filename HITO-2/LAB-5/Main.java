package NOMBRES;


public class Main {

    public static void main(String[] args) {

        String[] nombresEDD = new String[5];

        nombresEDD[0] = "Ana";
        nombresEDD[1] = "Juan";
        nombresEDD[2] = "Pepito";
        nombresEDD[3] = "Carla";
        nombresEDD[4] = "Freddy";

        Nombres edd = new Nombres("EDD", nombresEDD);

        // LLAMANDO A LA FUNCION DEL INGE.
        int c = cuentaNombres(edd, "Ana"); // en qui mandar el dato del nombre
        System.out.println("El nombre  se repite: " + c + "\n");


        // ESTA DE AQUI ABAJO ES MI FUNCION

        //   MostrandoCantidad(edd);

     //   AgregarNombre(edd, "Edson");
    //    edd.MostrarNombre();



        // LLAMANDO AL METODO DE AGRAGAR NOMBRE PRINCIPIO

    //    agregarNombresPrincipio(edd, "Iver");
    //    edd.MostrarNombre();


        // LLAMANDO AL METODO DE NOMBRE AL FINAL
    edd.MostrarNombre();
    agregarnombrealfinal(edd, "Edson");
    edd.MostrarNombre();

    }

    /////// CREAR UN METODO ESTATICO QUE DETERMINE CUANTAS PERSONAS
    /////// DEL PARALELO EDD TIENE EL NOMBRE PEPITO

    public static int cuentaNombres(Nombres edd, String nombreBuscar)  // creacion de la funcion DINAMICA ing.
    {
        String[] nombres = edd.getNombres();
        int i = 0;
        int contador = 0;

        for (i = 0; i < nombres.length; i++)
        {
            if (nombres[i] == nombreBuscar)
            {
                contador = contador + 1;
            }
        }
        return  contador;
    }

    /*

    // CREACION DE LA FUNCION MIO

    public static void  MostrandoCantidad (Nombres edd)  // creando la funciom de mombre MostrandoCamtidad
    {
       int numenombrespepitos=0; // inicializando la variable

       for (int i=0; i < edd.getNombres().length ; i++)
       {
           if (edd.getNombres()[i]=="Pepito") // buscando donde esta pepito dento el vector
           {
               numenombrespepitos++;
           }
       }
       System.out.println("el numero de pepitos es: " + numenombrespepitos); // imprimiendo en el main     MostrandoCantidad(edd); (ARRIBA ↑)
    }  */



    // ******************** AGREGAR UN NUEVO NOMBRE AL PRINCIPIO **************** //
    // ********************************* MI MODO ******************************** //
    // ************************************************************************* //

    // AGREGAR UN NOMBREAL PRINCIPIO MI FUNCION
/*
    public static void AgregarNombre(Nombres edd , String nombresAgregado)
    {
        String[] Nombres = edd.getNombres();

        int i=0;
        int a=0, b =1;
        String[] aux = new String[10];

        aux[0] = Nombres [i];
        Nombres[i] = nombresAgregado;

        for (i=1; i<Nombres.length ; i++)
        {
            aux[0]=Nombres[i];
            Nombres[1]= aux[a];
            a++;
            b++;
        }
        edd.setNombres(Nombres);
    }

*/


    // ==================== AGREGAR UN NUEVO NOMBRE AL PRINCIPIO ================ //
    // ========================== METODO DEL INGENIERO ========================== //
    // ========================================================================== //

    /*
    public static void agregarNombresPrincipio(Nombres edd, String nombresAgregar)
    {
        String[] nombresOri = edd.getNombres();
        String[] nuevosNombres = new String[nombresOri.length+1];

        nuevosNombres[0] = nombresAgregar;

        for(int i=0; i<nombresOri.length; i++)
        {
            nuevosNombres[i+1] = nombresOri[i];
        }
        edd.setNombres(nuevosNombres);
    }
    */



    // ====================== AGREGAR UN NUEVO NOMBRE AL FINAL ================== //
    // ========================== METODO DEL INGENIERO ========================== //
    // ========================================================================== //
    public static void agregarnombrealfinal(Nombres edd, String nuevoNombre)
    {
        String[] nombresOri = edd.getNombres();
        String[] nuevosNombres = new String[nombresOri.length+1];

        for (int i =0; i < nombresOri.length ; i++)
        {
            nuevosNombres[i] = nombresOri[i];
        }
        nuevosNombres[nuevosNombres.length-1] = nuevoNombre;
        edd.setNombres(nuevosNombres);
    }
}
