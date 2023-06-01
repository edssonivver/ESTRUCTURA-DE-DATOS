package Manejo_Colas_H4.Objetos.Manejo_Colas_H4;

public class MainLibros {
    public static void main(String[] args) {

        ColaDeLibros colaDeLibros = new ColaDeLibros();
        Libro libro1 = new Libro(1,"Juan","Masculino","MANGA",80);
        Libro libro2 = new Libro(2,"Saul","Masculino","MANGA",100);
        Libro libro3 = new Libro(3,"Ana","Femenino","HISTORIA",40);
        Libro libro4 = new Libro(4,"Micaela","Femenino","HISTORIA",30);
        Libro libro5 = new Libro(5,"Pepito","Otro","NOVELA",20);
        Libro libro6 = new Libro(6,"Pep","Otro","NOVELA",20);
        Libro libro7 = new Libro(7,"Carlos","Masculino","ARTE",200);

        colaDeLibros.adicionar(libro1);
        colaDeLibros.adicionar(libro2);
        colaDeLibros.adicionar(libro3);
        colaDeLibros.adicionar(libro4);
        colaDeLibros.adicionar(libro5);
        colaDeLibros.adicionar(libro6);
        colaDeLibros.adicionar(libro7);

        //colaDeLibros.mostrar();
        //PaginasMenores(colaDeLibros);

//        reordenColaLibrosPorGenero(colaDeLibros);
//        colaDeLibros.mostrar();

        OrdenaPorCantidadDePaginas(colaDeLibros);


    }


    // EJERCICIOS

    // Crear un metrodo estatico que muestre el libro con menor Paginas


    // VERSION 1
//    public static void PaginasMenores(ColaDeLibros colaDeLibros) {
//
//        ColaDeLibros aux = new ColaDeLibros();
//        Libro lib = null;
//        Libro libaux = null;
//
//        int min = 1000;
//
//        while (!colaDeLibros.esVacia()) {
//            lib = colaDeLibros.eliminar();
//            if (lib.getPaginas() < min) {
//                min = lib.getPaginas();
//                libaux = lib;
//            }
//            aux.adicionar(lib);
//        }
//        aux.vaciar(colaDeLibros);
//        System.out.println("PAGINAS MENOR");
//        libaux.mostrar();
//    }

    //METODO ING VERSION 2

    private static Libro determinaLibroMenorPagina(ColaDeLibros colaDeLibros)
    {
        ColaDeLibros aux = new ColaDeLibros();
        Libro libroMenor = null;
        int paginasMenor = Integer.MAX_VALUE;

        while (!colaDeLibros.esVacia()){
            Libro item = colaDeLibros.eliminar();
            if(item.getPaginas()< paginasMenor){
                paginasMenor = item.getPaginas();
                libroMenor = item;
            }
            aux.adicionar(item);
        }
        colaDeLibros.vaciar(aux);
        return libroMenor;
    }


    // Ordenar la cola de librowsen base al genero
    // al principio tiene que estar Femenino
    // Despues Masculino
    // Al final Otro

    // METODO DEL ING
    public static void reordenColaLibrosPorGenero(ColaDeLibros colaDeLibros){

        ColaDeLibros generoFemenino = new ColaDeLibros();
        ColaDeLibros generoMasculino = new ColaDeLibros();
        ColaDeLibros generoOtro = new ColaDeLibros();

    while (!colaDeLibros.esVacia()){
        Libro libro = colaDeLibros.eliminar();
            if(libro.getGenero().equals("Femenino")){
                generoFemenino.adicionar(libro);
            } else if (libro.getGenero().equals("Masculino")){
                generoMasculino.adicionar(libro);
            } else {
                generoOtro.adicionar(libro);
            }
    }
        colaDeLibros.vaciar(generoFemenino);
        colaDeLibros.vaciar(generoMasculino);
        colaDeLibros.vaciar(generoOtro);
    }

    // Ordenar de manera asendente toda la cola de libros segun la cantidad de paginas

    public static void OrdenaPorCantidadDePaginas (ColaDeLibros colaDeLibros){
        ColaDeLibros ordenado = new ColaDeLibros();
        ColaDeLibros aux = new ColaDeLibros();
        int nrmElem = colaDeLibros.NrElementos();

        for(int i = 0 ; i<= nrmElem ;i++){
            Libro libro = determinaLibroMenorPagina(colaDeLibros);

            while (!colaDeLibros.esVacia()){
                Libro item = colaDeLibros.eliminar();
                if(item.getCodigoLibro()==libro.getCodigoLibro()){
                    ordenado.adicionar(item);
                } else {
                    aux.adicionar(item);
                }
            }
            colaDeLibros.vaciar(aux);
        }
        colaDeLibros.vaciar(ordenado);
        colaDeLibros.mostrar();
    }

}
