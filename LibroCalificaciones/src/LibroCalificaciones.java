import java.util.Scanner;

public class LibroCalificaciones {
    private String nombreDelCurso;

    public LibroCalificaciones(String nombre) {
        nombreDelCurso = nombre;
    }


    public void establecerNombreDelCurso( String nombre ) {
        nombreDelCurso = nombre;
    }

    public String obtenerNombreDelCurso() {
       return nombreDelCurso;
    }

    public void mostrarMensaje() {
        System.out.printf("Bienvenido al Libro de Calificaciones para\n%s!\n", obtenerNombreDelCurso());
    }

    public void determinarPromedioClase() {
        Scanner entrada = new Scanner(System.in);

        int total = 0;
        int contadorCalif = 0;
        int calificacion;
        double promedio;

        System.out.print("Escriba calificación o -1 para terminar: ");
        calificacion = entrada.nextInt();

        while (calificacion != -1) {
            total = total + calificacion;
            contadorCalif = contadorCalif + 1;

            System.out.print("Escriba calificación o -1 para terminar: ");
            calificacion = entrada.nextInt();
        }

        if (contadorCalif != 0) {
            promedio = (double) total / contadorCalif;

            // Corrige el formato aquí
            System.out.printf("\nEl total de las calificaciones es %d\n", total);
            System.out.printf("El promedio de la clase es %.2f\n", promedio); // Usa %.2f para double
        } else {
            System.out.println("No se introdujeron calificaciones.");
        }
    }
}
