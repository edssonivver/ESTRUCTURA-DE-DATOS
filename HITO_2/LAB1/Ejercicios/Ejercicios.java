package Ejercicios;

public class Ejercicios {

    private int i;

    private int limite;

    public Ejercicios()
    {
        this.i = 1;
        this.limite=10;
    }

    public void mostrarMensaje()
    {
        System.out.println("Hola Mundo desde Java");
    }

    public void GenerarNumerosNaturales()
    {
        for ( i = 1; i <= 10; i++)
        {
            System.out.print(i + " ; ");
        }
    }

    public void GenerarNumerosPares()
    {
        for ( int a=2; a<=20 ; a+=2)
        {
            System.out.print(a + " ");
        }
    }

    public void GenerarNumerosWhile()
    {
        int  a= 1;
        while (a <= 5)
        {
            System.out.print(a + " ; ");
            a+=1;
        }
    }

    public void NumerosParesWhile()
    {
        int a= 2;
        while (a <= 10)
        {
            System.out.print(a + " ; ");
            a+=2;
        }
    }

}
