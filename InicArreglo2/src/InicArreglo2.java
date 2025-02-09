public class InicArreglo2
{
    public static void main(String[] args)
    {
        int[][] arreglo1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] arreglo2 = {{1, 2}, {3}, {4, 5, 6}};

        System.out.println("Los valores en arreglo1 por fila son");
        imprimirArreglo(arreglo1);

        System.out.println("Los valores en arreglo2 por fila son");
        imprimirArreglo(arreglo2);
    }

    public static void imprimirArreglo(int[][] arreglo)
    {
        for(int fila = 0; fila < arreglo.length; fila++)
        {
            for(int column = 0; column < arreglo[fila].length; column++)
                System.out.printf("%d ", arreglo[fila][column]);

            System.out.println();
        }
    }
}