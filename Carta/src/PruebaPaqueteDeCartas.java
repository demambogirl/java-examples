public class PruebaPaqueteDeCartas
{
    public static void main(String[] args)
    {
        PaqueteDeCartas mipaqueteDeCartas = new PaqueteDeCartas();
        mipaqueteDeCartas.barajar();

        for(int i = 1; i <= 52; i++)
        {
            System.out.printf("%-19s", mipaqueteDeCartas.repartirCarta());

            if (i % 4 == 0)
                System.out.println();
        }
    }
}
