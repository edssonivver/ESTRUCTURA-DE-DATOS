package Ejercicios_Defensa;

public class Departamento { //Creando la clase
    private String nombres; //atributo
    private Integer Nroprovincias; //atributo
    private Provincia[] provincias; //atributo (Llamamos a la clase provincia)

    // CONSTRUCTOR
    public Departamento(String nombres,Integer Nroprovincias, Provincia[] provincias)
    {
    this.nombres = nombres;
    this.Nroprovincias = Nroprovincias;
    this.provincias=provincias;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Integer getNroprovincias() {
        return Nroprovincias;
    }

    public void setNroprovincias(Integer nroprovincias) {
        Nroprovincias = nroprovincias;
    }

    public Provincia[] getProvincias() {
        return provincias;
    }

    public void setProvincias(Provincia[] provincias) {
        this.provincias = provincias;
    }

    public void muestraDepartamento ()
    {
        System.out.println("\nNombre departamento: " + getNombres());
        System.out.println("nro provincia: " + getNroprovincias());

        for (int i =0; i<provincias.length ; i++)
        {
            this.getProvincias()[i].muestraProvincia();
        }
    }

    // PARA AGREGAR NUEVAS PROVINCIAS
    public void agreganuevaProvincia (String depart,Provincia prov){

        if(depart == this.nombres)
        {
            Provincia[] provi = new Provincia[provincias.length + 1];
            for (int i = 0; i < provincias.length; i++) {
                provi[i] = this.provincias[i];
            }
            provi[this.provincias.length] = prov;
            setProvincias(provi);
            setNroprovincias(getNroprovincias() + 1);
        }else System.out.println("NO EXISTEN NUEVOS REGISTROS");
    }
}



