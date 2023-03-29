package Math_Utils;

import java.time.Year;

public class Math_utils
{
    private String nameApp;
    private String version;
    private int year;

    public  Math_utils (String nameApp ,String version , int year)
    {
           this.nameApp=nameApp;
           this.version=version;
           this.year=year;
    }

    public void printApp()
    {
        System.out.println(this.nameApp + " _ " + this.version + " _ " + this.year);
    }

    public void GenerateNaturalNumbers(int limit)
    {
        System.out.println("Generando numeros naturales usando un FOR");
        for (int i = 1; i <= limit; i++)
        {
            System.out.print(i + " ; ");
        }
    }

    public void GeneratePairNumbers(int limit)
    {
        for ( int a=2; a<=limit ; a+=2)
        {
            System.out.print(a + " ");
        }
    }

    // GENERANDO LA EXTENCION DE UHN CI
    public void getEstensionFromCi(String ci)
    {
        System.out.println("Muestra la extencion de la cedula");
        String ext = "";
        // 45645812LP
        ext = ci.substring(8);
        // Mostrando la extension
        System.out.println("Extension = " + ext);
    }

}


