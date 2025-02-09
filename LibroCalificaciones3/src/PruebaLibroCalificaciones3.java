public class PruebaLibroCalificaciones3
{
    public static void main(String[] args)
    {
        int[][] arregloCalif = {{87, 96, 70}, {68, 87, 90}, {94, 100, 90}, {100, 81, 82}, {83, 65, 85}, {78, 87, 65}, {85, 75, 83}, {91, 94, 100}, {76, 72, 84}, {87, 93, 73}};

        LibroCalificaciones3 miLibroCalificaciones3 = new LibroCalificaciones3("CS101 Introdiccon a la programamcion Java", arregloCalif);
        miLibroCalificaciones3.mostratMensaje();
        miLibroCalificaciones3.procesarCalificaciones();
    }
}
