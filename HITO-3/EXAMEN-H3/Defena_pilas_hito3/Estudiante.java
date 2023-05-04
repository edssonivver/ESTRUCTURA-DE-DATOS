package Defena_pilas_hito3;

public class Estudiante {
    private String nombre;
    private String apellido;
    private int edad;
    private String sede;
    private int notaFinal;
    private String CI;


    public Estudiante(String nombre, String apellido, int edad, String sede, int notaFinal, String CI) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sede = sede;
        this.notaFinal = notaFinal;
        this.CI = CI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public int getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(int notaFinal) {
        this.notaFinal = notaFinal;
    }

    public String getCI() {
        return CI;
    }

    public void setCI(String CI) {
        this.CI = CI;
    }

    public void muestraEstudiante() {
        System.out.println("Mostrando Estudiante\n");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Sede: " + sede);
        System.out.println("Nota Final: " + notaFinal);
        System.out.println("Ci: " + CI);
        System.out.println();
    }
}
