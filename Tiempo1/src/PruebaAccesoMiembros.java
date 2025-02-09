import com.deitel.jhtp.cap08.Tiempo1;

public class PruebaAccesoMiembros
{
    public static void main(String[] args)
    {
        Tiempo1 tiempo = new Tiempo1();

        tiempo.establecerTiempo(7, 15, 30);

        System.out.println("Hora en formato universal: " + tiempo.aStringUniversal());
        System.out.println("Hora en formato estándar: " + tiempo.toString());
    }
}
