package ColaDeClientes;

public class Main {
    public static void main(String[] args) {

        // 12. Inicializar la cola de Clientes
        // - Crear una cola con5 clientes
        // - Mostrar todos los datos de la cola de Clientes

        ColaDeClientes cola = new ColaDeClientes();
        Cliente cliente1 = new Cliente("Jose", "Escobar",25, "Brazil", "Masculino", "Silver");
        Cliente cliente2 = new Cliente("Oscar", "Mendoza",32, "Bolivia", "Masculino", "Gold");
        Cliente cliente3 = new Cliente("Saul", "De la Cruz",29, "Panama", "Masculino", "Gold");
        Cliente cliente4 = new Cliente("Maria", "Torrez",30, "Colombia", "Femenino", "Silver");
        Cliente cliente5 = new Cliente("Marta", "Choque",65, "Mexico", "Femenino", "Vip");

        cola.adicionar(cliente1);
        cola.adicionar(cliente2);
        cola.adicionar(cliente3);
        cola.adicionar(cliente4);
        cola.adicionar(cliente5);

        // EJER 15
        ColaDeClientes cola2 = new ColaDeClientes();
        Cliente clien1 = new Cliente("Edson","Condori",20,"Bolivia","Masculino","Gold");
        Cliente clien2 = new Cliente("Rodrigo","Torres",30,"Argentina","Masculino","Gold");
        Cliente clien3 = new Cliente("Sergio","Alavarado",25,"Peru","Masculino","Vip");
        Cliente clien4 = new Cliente("Saul","Mendoza",28,"Paraguay","Masculino","Gold");
        Cliente clien5 = new Cliente("Sandra","Alanoca",22,"Chile","Femenino","Silver");

        cola2.adicionar(clien1);
        cola2.adicionar(clien2);
        cola2.adicionar(clien3);
        cola2.adicionar(clien4);
        cola2.adicionar(clien5);


        cola.mostrar();
        System.out.println("MOSTRANDO LA COLA 2");
        cola2.mostrar();

//        System.out.println("==========================================");
//        System.out.println("PROMOCION PARA LOS USUARIOS DE BOLIVIA");
//        System.out.println("==========================================");
//        // EJERCICIO 13
//        PromocionUsuariBolivia(cola, "Bolivia", "Gold");
//        cola.mostrar();
////
//        System.out.println("==========================================");
//        System.out.println("MOVER USUARIO CON UNA EDAD MAYOR ADELANTE");
//        System.out.println("==========================================");
//        MoverCliente(cola , 60);
//        cola.mostrar();



        System.out.println("==========================================");
        System.out.println("MOVER CLIENTES A OTRA COLA");
        System.out.println("==========================================");

        MoverClienteaotraCola(cola , cola2 , "Saul");
        System.out.println("MOSTRANDO COLA 1");
        cola.mostrar();
        System.out.println("MOSTRANDO COLA 2");
        cola2.mostrar();
    }

    //  DESARROLLO DE EJERCICIOS

//      13.Promoción para usuarios de Bolivia.
//          ○ En el mes de diciembre a todos los clientes de Bolivia se les dará una promoción
//            en cuanto a precios en viajes a nivel nacional.
//      ■ A todos los clientes que sean de nacionalidad boliviana y además el tipo
//        de cliente GOLD, convertir a estos clientes en VIP
//      ■ Es decir si es de Bolivia y es GOLD deberá ser ahora un cliente VIP
//          ○ El método estático dentro de la clase MAIN recibe 3 atributos
//      ■ La cola de clientes
//      ■ El tipo de cliente
//      ■ La nacionalidad del cliente.

    public static void PromocionUsuariBolivia(ColaDeClientes cola, String nacionalidad, String tipo ){
    ColaDeClientes aux = new ColaDeClientes();
        while (!cola.esVacia()){
            Cliente cliente = cola.eliminar();
            if (cliente.getPais().equals(nacionalidad) && cliente.getTipo().equals(tipo)){
                cliente.setTipo("VIP");
                aux.adicionar(cliente);
            }
            else{
                aux.adicionar(cliente);
            }
        }
        while (!aux.esVacia()) {
            cola.adicionar(aux.eliminar());
        }
    }

    //14.Moviendo clientes en la cola.
    //○ Mover al inicio todos los clientes mayores a 60 años.
    //■ Es decir si el cliente es mayor a 60 deberá de moverlo al inicio de la cola.
    //            ○ El método recibe 2 parámetros
    //■ La Cola de Clientes
    //■ El valor(int) de la edad.
    public static void MoverCliente(ColaDeClientes cola, int edad){
        ColaDeClientes usuarioedadMayor = new ColaDeClientes();
        ColaDeClientes usuarioedadNormal = new ColaDeClientes();
        while (!cola.esVacia()){
            Cliente cliente = cola.eliminar();
            if (cliente.getEdad() > edad){
                usuarioedadMayor.adicionar(cliente);
            }
            else {
                usuarioedadNormal.adicionar(cliente);
            }
        }
        while (!usuarioedadMayor.esVacia()){
            cola.adicionar(usuarioedadMayor.eliminar());
        }
        while (!usuarioedadNormal.esVacia()){
            cola.adicionar(usuarioedadNormal.eliminar());
        }
    }


//15.Moviendo clientes entre 2 colas.
//○ Por razones de promociones de vuelo, es necesario cambiar de vuelo a ciertos
//    clientes.
//■ Crear 2 colas con 5 clientes.
//■ Todos los clientes cuyo nombre sea Saul deberán ser agregados a la
//    cola B al inicio.

    public static void MoverClienteaotraCola(ColaDeClientes cola, ColaDeClientes cola2 , String nombre){
        ColaDeClientes usuariaquesebusca = new ColaDeClientes();
        ColaDeClientes usuarioedadNormal = new ColaDeClientes();
        while (!cola.esVacia()){
            Cliente cliente = cola.eliminar();
            if (cliente.getNombres() == nombre){
                usuariaquesebusca.adicionar(cliente);
            }
            else {
                usuarioedadNormal.adicionar(cliente);
            }
        }
        while (!usuariaquesebusca.esVacia()){
            cola2.adicionar(usuariaquesebusca.eliminar());
        }
        while (!usuarioedadNormal.esVacia()){
            cola.adicionar(usuarioedadNormal.eliminar());
        }

        // para la cola 2
        while (!cola2.esVacia()){
            Cliente cliente = cola2.eliminar();
            if (cliente.getNombres() == nombre){
                usuariaquesebusca.adicionar(cliente);
            }
            else {
                usuarioedadNormal.adicionar(cliente);
            }
        }
        while (!usuariaquesebusca.esVacia()){
            cola2.adicionar(usuariaquesebusca.eliminar());
        }
        while (!usuarioedadNormal.esVacia()){
            cola2.adicionar(usuarioedadNormal.eliminar());
        }
    }
}