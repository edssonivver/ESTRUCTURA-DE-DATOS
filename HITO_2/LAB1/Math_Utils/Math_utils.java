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
        System.out.println(
                this.nameApp + " _ " +
                this.version + " _ " +
                this.year
                );
    }

    public void GenerateNaturalNumbers(int limit)
    {
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

    public void getEstensionFromCi(String ci)
    {

    }

}