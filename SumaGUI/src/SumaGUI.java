import javax.swing.JOptionPane;

public class SumaGUI
{

    public static void main( String [] args )
    {

        String numero1 = JOptionPane.showInputDialog("Ingrese un numero: ");
        String numero2 = JOptionPane.showInputDialog("Ingrese otro numero: ");

        int num1 = Integer.parseInt(numero1);
        int num2 = Integer.parseInt(numero2);

        int suma = num1 + num2;

        JOptionPane.showMessageDialog(null,"La suma de los numeros es: " + suma);

    }
}

