public class PruebaTiempo2
{
    public static void main (String[] args)
    {
        Tiempo2 t1 = new Tiempo2();
        Tiempo2 t2 = new Tiempo2(2);
        Tiempo2 t3 = new Tiempo2(21, 34);
        Tiempo2 t4 = new Tiempo2(12, 25, 42);
        Tiempo2 t5 = new Tiempo2(t4);

        System.out.println("Se construyo con:");
        System.out.println("t1: todos los argumentos predeterminados");
        System.out.printf("  %s\n", t1.aStringUniversal());
        System.out.printf("  %s\n", t1.toString());

        System.out.println("t2: se especifico hora; minuto y segundo predeterminados");
        System.out.printf("  %s\n", t2.aStringUniversal());
        System.out.printf("  %s\n", t2.toString());

        System.out.println("t3: se especificaron y minuto; segundo predeterminados");
        System.out.printf("  %s\n", t3.aStringUniversal());
        System.out.printf("  %s\n", t3.toString());

        System.out.println("t4: se especifico hora, minuto y segundo predeterminados");
        System.out.printf("  %s\n", t4.aStringUniversal());
        System.out.printf("  %s\n", t4.toString());

        System.out.println("t5: se especifico el objeto Tiempo2 llamado t4");
        System.out.printf("  %s\n", t5.aStringUniversal());
        System.out.printf("  %s\n", t5.toString());

        try
        {
            Tiempo2 t6 = new Tiempo2(27, 47, 99);
        }
        catch(IllegalArgumentException e)
        {
            System.out.printf("\nExcepcion al inicializar t6: %s\n", e.getMessage());
        }
    }
}
