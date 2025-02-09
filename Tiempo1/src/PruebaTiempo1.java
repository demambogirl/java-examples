import com.deitel.jhtp.cap08.Tiempo1;

public class PruebaTiempo1
{
    public static void main(String[] args)
    {
        Tiempo1 tiempo = new Tiempo1();

        System.out.print("La hora universal inicial es: ");
        System.out.println(tiempo.aStringUniversal());
        System.out.print("La hora estandar inicial es: ");
        System.out.println(tiempo.toString());
        System.out.println();

        tiempo.establecerTiempo(13, 27, 6);
        System.out.print("La hora universal despues de establecerTiempo es: ");
        System.out.println(tiempo.aStringUniversal());
        System.out.print("La hora estandar despues de establecerTiempo es: ");
        System.out.println(tiempo.toString());
        System.out.println();

        try
        {
            tiempo.establecerTiempo(99, 99, 99);
        }
        catch(IllegalArgumentException e)
        {
            System.out.printf("Excepcion: %s\n\n", e.getMessage());
        }

        System.out.println("Despues de intentar ajustes invalisdos:");
        System.out.print("Hora universal: ");
        System.out.println(tiempo.aStringUniversal());
        System.out.print("Hora estandar: ");
        System.out.println(tiempo.toString());
    }
}
