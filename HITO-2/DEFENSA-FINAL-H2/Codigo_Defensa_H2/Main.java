package Ejercicios_Defensa;

public class Main {
    public static void main(String[] args) {
        //==============================================//
                    // EJERCICIO 11 PROVINCIA
        //==============================================//

        // Provincias de La Paz
        // creando una instancia
        Provincia provincialp = new Provincia("Murillo");
        Provincia provincialp2 = new Provincia("Pacajes");

        Provincia[] provinciasLapaz = new Provincia[2];
        provinciasLapaz[0] = provincialp;
        provinciasLapaz[1] = provincialp2;

        //Mostrar los datos de la provincia en este caso el nombre
        provincialp.muestraProvincia();
        provincialp2.muestraProvincia();

        //==============================================//

        // Provincias Oruro
        // creando una instancia
        Provincia provinciaoru = new Provincia("Carangas");
        Provincia provinciaour2 = new Provincia("Cercado");

        Provincia[] provinciasOruro = new Provincia[2];
        provinciasOruro[0] = provinciaoru;
        provinciasOruro[1] = provinciaour2;

        //Mostrar los datos de la provincia en este caso el nombre
        provinciaoru.muestraProvincia();
        provinciaour2.muestraProvincia();


        //===============================================//
                  // EJERCICIO 12 DEPARTAMENTO
        //===============================================//
        System.out.print("\n===============================================\n");
        System.out.println("MOSTRANDO DEPARTAMENTOS");
        // PARA EL PIMER DEPARTAMENTO
        // creando una instancia
        Departamento departamento1 = new Departamento("La Paz",2,provinciasLapaz);

        Departamento[] departLp = new Departamento[1];
        departLp[0] = departamento1;

        // mostrando los datos del primer dep llamando al metodo de la clase
        departamento1.muestraDepartamento();

        //==============================================//

        // PARA EL SEGUNDO DEPARTAMENTO
        // creando una instancia
        Departamento departamento2 = new Departamento("Oruro",2,provinciasOruro);

        Departamento[] deporu = new Departamento[1];
        deporu[0] = departamento2;

        // mostrando los datos del primer dep llamando al metodo de la clase
        departamento2.muestraDepartamento();




        //===============================================//
                // EJERCICIO 13 PAIS
        //===============================================//
        System.out.print("\n===============================================");
        System.out.print("\nMOSTRNADO PAIS 1");
        Pais pais = new Pais("Bolivia",1,departLp);

        Pais[] paisBolivia = new Pais[1];
        paisBolivia[0]=pais;

        pais.muestraPais();

        //===============================================//

        System.out.print("\n===============================================\n");
        System.out.print("MOSTRNADO PAIS 2");
        Pais pais1 = new Pais("Bolivia2",1,deporu);

        Pais[] paisBol2 = new Pais[1];
        paisBol2[0]=pais1;

        pais1.muestraPais();




        //===============================================//
                  // EJERCICIO 14 DEPARTAMENTO
        //===============================================//

        // AGREGANDO UN NUEVO DEPARTAMENTO Y UNA NUEVA PROVINCIA (SEGUNDO ESTO)
        Provincia proTarija = new Provincia("San Andres");
        Provincia[] provinciastarija = new Provincia[1];
        provinciastarija[0] = proTarija;
        Departamento tarija = new Departamento("Tarija",1,provinciastarija);

        // PRIEMRO APARECE ESTO
        System.out.print("\n===============================================\n");
        System.out.print("DATOS DEL PAIS ACTUALIZADO: ");
        pais1.agregaDepartamento(tarija);
        pais1.muestraPais();

        //===============================================//

        //AGREGANDO UNA NUEVA PROVINCIA EN UN DEPARTAMENTO YA CREADO
        // EN ESTE CASO AL DEPARTAMENTO ORURO
        System.out.print("\n===============================================\n");
        System.out.print("LA NUEVA PROVINCIA AGREGADA AL DEPARTANMENTO ORURO ES:");
        Provincia oru3 = new Provincia("Huari"); // NUEVA PROVINCIA AGREGADA
        departamento2.agreganuevaProvincia("Oruro",oru3); //AGREGARE UNA PROVINCIA A EL DEPARTAMENTO Oruro (departamento2)
        pais1.muestraPais();
    }
}
