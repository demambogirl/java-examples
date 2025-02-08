import java.util.Scanner;

public class LibroCalificacionesSwitch {
    private String nombreDelCurso;

    private int total;
    private int contadorCalif;
    private int aCuenta;
    private int bCuenta;
    private int cCuenta;
    private int dCuenta;
    private int fCuenta;

    public LibroCalificacionesSwitch(String nombre) {
        nombreDelCurso = nombre;
    }

    public void establecerNombreDelCurso(String nombre) {
        nombreDelCurso = nombre;
    }

    public String obtenerNombreDelCurso() {
        return nombreDelCurso;
    }

    public void mostrarMnesaje() {
        System.out.printf("Bienvenido al libro de calificaciones para \n%s!\n\n", obtenerNombreDelCurso());
    }

    public void introducirCalif() {
        Scanner entrada = new Scanner(System.in);

        int calificacion;

        System.out.printf("%s\n%s\n  %s\n  %s\n", "Escriba calificaciones en el rango 0 a 100.", "Escriba el indicador de fin de archivo para determinar la entrada:", "En UNIX/Linux/Mac OS X escriba <Ctrl> z y después oprima Intro", "En Windows escriba <Ctrl> d y después oprima Intro");

        while (entrada.hasNext()) {
            calificacion = entrada.nextInt();
            total += calificacion;
            ++contadorCalif;

            incrementarContadorCalifLetra(calificacion);
        }
    }

    private void incrementarContadorCalifLetra(int calificacion) {
        switch (calificacion / 10) {
            case 9:
            case 10:
                ++aCuenta;
                break;

            case 8:
                ++bCuenta;
                break;

            case 7:
                ++cCuenta;
                break;

            case 6:
                ++dCuenta;
                break;

            default:
                ++fCuenta;
                break;
        }
    }

    public void mostrarReporteCalif() {
        System.out.println("\nReporte de calificaciones:");

        if (contadorCalif != 0) {
            double promedio = (double) total / contadorCalif;

            System.out.printf("El total de las calificaciones introducidas es %d\n", contadorCalif);
            System.out.printf("El total de las calificaciones es %d\n", total);
            System.out.printf("El promedio de la clase es %.2f\n", promedio);
            System.out.printf("%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n", "Número de estudiantes que recibieron cada calificación:",
                    "A:", aCuenta, "B:", bCuenta, "C:", cCuenta, "D:", dCuenta, "F:", fCuenta);
        } else {
            System.out.println("No se introdujeron calificaciones.");
        }
    }
}