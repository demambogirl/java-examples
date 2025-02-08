import javax.swing.JOptionPane;

public class OperationGUI
{
    public static void main(String[] args) {
        String numero1 = JOptionPane.showInputDialog("Ingrese un numero: ");
        String numero2 = JOptionPane.showInputDialog("Ingrese otro numero: ");

        int num1 = Integer.parseInt(numero1);
        int num2 = Integer.parseInt(numero2);

        String[] opciones = {"Suma", "Resta", "Multiplicación", "División"};
        String operacion = (String) JOptionPane.showInputDialog(
                null,
                "Seleccione la operación: ",
                "Elegir operación: ",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]
        );

        int resultado = 0;
        String mensajeResultado = "";

        switch (operacion) {
            case "Suma":
                resultado = num1 + num2;
                mensajeResultado = "La suma es: " + resultado;
                break;
            case "Resta":
                resultado = num1 - num2;
                mensajeResultado = "La resta es: " + resultado;
                break;
            case "Multiplicación":
                resultado = num1 * num2;
                mensajeResultado = "La Multiplicación es: " + resultado;
                break;
            case "División":
                if (num2 != 0) {
                    double division = (double) num1 / num2;
                    mensajeResultado = "La division es: " + division;
                } else {
                    mensajeResultado = "Error: No se puede divifdir por 0";
                }
                break;
            default:
                mensajeResultado = "Operación no válida.";
                break;

        }

        JOptionPane.showMessageDialog(null, mensajeResultado);
        
    }

}