package Ejercicios_Defensa;

public class Pais {
    private String nombre;
    private Integer nroDepartamento;
    private Departamento[] departamento;

    public Pais(String nombre, Integer nroDepartamento, Departamento[] departamento)
    {
        this.nombre=nombre;
        this.nroDepartamento=nroDepartamento;
        this.departamento=departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNroDepartamento() {
        return nroDepartamento;
    }

    public void setNroDepartamento(Integer nroDepartamento) {
        this.nroDepartamento = nroDepartamento;
    }

    public Departamento[] getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento[] departamento) {
        this.departamento = departamento;
    }


    public void muestraPais()
    {
        System.out.println("\n\nNombre del Pais: " +getNombre());
        System.out.println("Numero de Departamentos: " + getNroDepartamento());

        for(int i=0; i<this.getDepartamento().length; i++)
        {
            this.departamento[i].muestraDepartamento();
        }
    }


    // PARA AGREGAR DEPARTAMENTOS
    public void agregaDepartamento(Departamento Tarija){

        Departamento[] nuevosDep = new Departamento[departamento.length+1];
        for(int i=0; i< departamento.length ; i++)
        {
            nuevosDep[i]=departamento[i];
        }
        nuevosDep[this.departamento.length]=Tarija;
        setDepartamento(nuevosDep);
        setNroDepartamento(getNroDepartamento()+1);
    }

}
