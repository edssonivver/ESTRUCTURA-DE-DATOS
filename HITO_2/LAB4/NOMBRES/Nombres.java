package NOMBRES;

public class Nombres
{
    private String Paralelo;
    private String[] Nombres;

    public Nombres (String Paralelo,String [] Nombres )
    {
        this.Paralelo=Paralelo;
        this.Nombres=Nombres;
    }

    public String getParalelo() {
        return Paralelo;
    }

    public void setParalelo(String paralelo) {
        Paralelo = paralelo;
    }

    public String[] getNombres() {
        return Nombres;
    }

    public void setNombres(String[] nombres) {
        Nombres = nombres;
    }
}

