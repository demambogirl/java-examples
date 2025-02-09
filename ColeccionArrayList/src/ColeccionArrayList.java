import java.util.ArrayList;

public class ColeccionArrayList
{
    public static void main(String[] args)
    {
        ArrayList< String > elementos = new ArrayList< String >();

        elementos.add("rojo");
        elementos.add(0,"amarillo");

        System.out.print("Mostrar contenido de lista con ciclo controlado por contador:");

        for (int i = 0; i <elementos.size(); i++)
            System.out.printf(" %s", elementos.get(i));

        mostrar(elementos, "\nMostrar contenido de lista con instruccion for mejorada:");

        elementos.add("verde");
        elementos.add("amarillo");
        mostrar(elementos, "Lista con dos nuevos elementos:");

        elementos.remove("amarillo");
        mostrar(elementos, "Eliminar primera instancia de amarillo:");

        elementos.remove(1);
        mostrar(elementos, "Eliminar segundo elemento de la lista (verde):");

        System.out.printf("\"rojo\" %sesta en la lista\n", elementos.contains("rojo") ? "": "no");

        System.out.printf("Tamanio: %s\n", elementos.size());
    }

    public static void mostrar(ArrayList<String> elementos, String encabezado)
    {
        System.out.print(encabezado);

        for (String elemento : elementos)
            System.out.printf(" %s", elemento);

        System.out.println();
    }
}