import java.util.EnumSet;

public class PruebaEnum
{
    public static void main(String[] args)
    {
        System.out.println("Todos los libros:\n");

        for (Libro libro : Libro.values())
            System.out.printf("%-10s%-45s%s\n", libro, libro.obtenerTitulo(), libro.obtenerAnioCopyright());

        System.out.println("\nMostrar un rango de constantes enum:\n");

        for(Libro libro: EnumSet.range(Libro.JHTP, Libro.CPPHTP))
            System.out.printf("%-10s%-45s%s\n", libro, libro.obtenerTitulo(), libro.obtenerAnioCopyright());
    }
}
