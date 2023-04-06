package Ejercicios_Defensa;

public class Provincia { //Creando la clase
    private String nombre; //atributo

    // constructor
    public Provincia(String nombre)
    {
       this.nombre = nombre;
    }


    // Generando los Get y Set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Mostrar los datos de una provincia en este caso el nombre
    public void muestraProvincia()
    {
        System.out.println("Provincia: " + getNombre());
    }
}
