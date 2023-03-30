package manejo_de_pilas;

public class Main {

    public static void main (String[] args){
        int[] edades = new int[5];
        edades[0] =33;
        edades[1] =20;
        edades[2] =19;
        edades[3] =42;
        edades[4] =25;
        Edades obj1= new Edades("Unifranz","EDD",edades);
        obj1.Mostrar();
        determinaMayorEdad(obj1);
        determinaMayorEdadPar(obj1);
        obj1.Mostrar();
        intercambiarValores(obj1,obj2);
    }
    //DETERMINA EDAD MAYOR
    public static void determinaMayorEdad(Edades obj1)
    {
       int[] edades = obj1.getEdades();
       int mayorDeEdad = edades[0];
        for(int i=1; i<edades.length ; i++)
        {
            if(edades[i]>mayorDeEdad)
            {
                mayorDeEdad = edades[i];
            }
        }
        System.out.println("EDAD MAYOR: "+ mayorDeEdad);
    }
  //AUMENTAR 5 A LOS NUMEROS PARES
    public static void determinaMayorEdadPar (Edades obj1)
    {
        int[] edades = obj1.getEdades();

        for(int i=0; i<edades.length ; i++)
        {
            if(edades[i]%2==0)
            {
                edades[i]=edades[i]+5;
            }
        }
        obj1.setEdades(edades);
    }
    // PARA CASA con 2 vectores el valor maximo cambiar al valor en pocision 0 del 2do vector
    // y el valor del vector en pocision 0 cambiarlo en la pocision del mayor
    public static void intercambiarValores (Edades obj1)
    {
        int[] edades = obj1.getEdades();

        for(int i=0; i<edades.length ; i++)
        {
            if(edades[i]%2==0)
            {
                edades[i]=edades[i]+5;
            }
        }
        obj1.setEdades(edades);
    }
}
