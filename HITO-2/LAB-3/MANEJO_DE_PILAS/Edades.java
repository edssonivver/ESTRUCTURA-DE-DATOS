package manejo_de_pilas;

public class Edades
{
    private String Universidad;
    private String Paralelo;
    private int[] Edades;

    //clic derecho y clic en generate genera cualquier elemento de una clase
    public Edades(String universidad, String paralelo, int[] edades)
    {
        this.Universidad = universidad;
        this.Paralelo = paralelo;
        this.Edades = edades;
    }
    //gets
    public String getUniversidad() {
        return Universidad;
    }

    public String getParalelo() {
        return Paralelo;
    }

    public int[] getEdades() {
        return Edades;
    }
    //sets
    public void setUniversidad(String universidad)
    {
        this.Universidad=universidad;
    }

    public void setParalelo(String paralelo)
    {
        this.Paralelo=paralelo;
    }

    public void setEdades(int[] edades)
    {
        this.Edades=edades;
    }

    public void Mostrar()
    {
        System.out.println("Mostrando clase");
        System.out.println("Universidad:"+this.getUniversidad());
        System.out.println("Paralelo:"+this.getParalelo());
        System.out.println("Edades:");
        //length =  es el numero de posiciones(TAMAÑO) de un array/ EL TAMAÑO DEL VECTOR
        for(int i=0; i<this.getEdades().length ; i++)
        {
            System.out.print(this.Edades[i]+ ",");

        }

        System.out.println();
    }
}
