package NOMBRES;

public class Main {

    public static void main(String[] args) {

        String [] nombresEDD = new String[5];

        nombresEDD [0] = "Ana";
        nombresEDD [1] = "Juan";
        nombresEDD [2] = "Pepito";
        nombresEDD [3] = "Carla";
        nombresEDD [4] = "Freddy";

        Nombres edd = new Nombres("EDD",nombresEDD);


        MostrandoCantidad(edd);
    }

    /////// CREAR UN METODO ESTATICO QUE DETERMINE CUANTAS PERSONAS
    /////// DEL PARALELO EDD TIENE EL NOMBRE PEPITO

    public static void  MostrandoCantidad (Nombres edd)
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
    }



}
