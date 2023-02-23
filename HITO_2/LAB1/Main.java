import Ejercicios.Ejercicios;
import Math_Utils.Math_utils;

public class Main {
    public static void main(String[] args) {

        /*

        System.out.println("Ejercico 1") ;
        Ejercicios ejers = new Ejercicios();
        ejers.mostrarMensaje();
        System.out.println("\n Ejercico 2");
        ejers.GenerarNumerosNaturales();
        System.out.println("\n Ejercico 3");
        ejers.GenerarNumerosPares();
        System.out.println("\n Ejercico 4");
        ejers.GenerarNumerosWhile();
        System.out.println("\n Ejercico 5");
        ejers.NumerosParesWhile();
        */

        Math_utils mu = new Math_utils ("GOO","0.1V",2023);
        mu.printApp();
        System.out.println("\n Generando numeros Naturale");
        mu.GenerateNaturalNumbers(55);
        System.out.println("\nGENERANDO NUMEROS PARES");
        mu.GeneratePairNumbers(20);




        /* ======================================================= */
        /* ====================== EJERCICIO 1 ==================== */
        /* ======================================================= */

         /* // Mostrando un mensaje en Java
        System.out.println("Hola Mundo!"); */


        /* ======================================================= */
        /* ====================== EJERCICIO 2 ==================== */
        /* ======================================================= */


       /* // Generando los primeros numeros naturales
        for (int i = 1; i <= 10; i++)
        {
                System.out.print(i + " ; ");
        }
        */


        /* ======================================================= */
        /* ====================== EJERCICIO 3 ==================== */
        /* ======================================================= */


        // generar los numeros pares menores o iguales a 20
        // utilizar for
        // 2 , 4, 6 , 8, 10 , 12 , 14 ,16 , 18 ,20

     /*
     for (int i = 1; i <= 10; i++)
        {
                System.out.print(i + " ; ");
        }
     */


        /* ======================================================= */
        /* ====================== EJERCICIO 4 ==================== */
        /* ======================================================= */


    /*    // GENERAR LOS PRIMEROS NUMEROS 1 A 5 USANDO EL WHILE
        int  a= 1;
        while (a <= 5)
        {
            System.out.print(a + " ; ");
            a+=1;
        }
        */


        /* ======================================================= */
        /* ====================== EJERCICIO 5 ==================== */
        /* ======================================================= */


       /*

        // GENERAR LOS NUMEROS PARES DEL 2 AL 10 USANDO WHILE
        int  a= 2;
        while (a <= 10)
        {
            System.out.print(a + " ; ");
            a+=2;
        }

        */

    }
}