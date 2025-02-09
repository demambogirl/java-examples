public class Fecha
{
    private int mes;
    private int dia;
    private int anio;

    private static final int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Fecha(int elMes, int elDia, int elAnio)
    {
        mes = comprobarMes(elMes);
        anio = elAnio;
        dia = comprobarDia(elDia);

        System.out.printf("Constructor de objeto Fecha para la fecha %s\n", this);
    }

    private int comprobarMes(int mesPrueba)
    {
        if (mesPrueba > 0 && mesPrueba <= 12)
            return mesPrueba;
        else
            throw new IllegalArgumentException("el mes debe ser 1 a 12");
    }

    private int comprobarDia(int diaPrueba)
    {
        if (diaPrueba > 0 && diaPrueba <= diasPorMes[mes])
            return diaPrueba;

        if (mes == 2 && diaPrueba == 29 && (anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0)))
            return diaPrueba;

        throw new IllegalArgumentException("Día fuera de rango para el mes y año especificados");
    }

    public String toString()
    {
        return String.format("%d/%d/%d", mes, dia, anio);
    }
}