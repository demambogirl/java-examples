public class PruebaLibroCalificaciones2
{
    public static void main(String[] args)
    {
        int[] arregloCalif = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};

        LibroCalificaciones2 miLibroCalificaciones2 = new LibroCalificaciones2("CS101 Introduccion a la programacion Java", arregloCalif);
        miLibroCalificaciones2.mostrarMensaje();
        miLibroCalificaciones2.procesarCalificaciones();
    }
}
