import javax.swing.*;
import java.awt.*;

public class FlorDibujo20 extends JPanel {

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Habilitar renderizado suave para gráficos de mejor calidad
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Dibujar el centro de la flor
        g2d.setColor(Color.YELLOW);
        g2d.fillOval(90, 90, 60, 60);

        // Dibujar los 5 pétalos de la flor
        g2d.setColor(Color.PINK);
        int petalCount = 5;
        int petalRadius = 50;
        int centerX = 120; // Coordenada x del centro de la flor
        int centerY = 120; // Coordenada y del centro de la flor

        for (int i = 0; i < petalCount; i++) {
            double angle = 2 * Math.PI / petalCount * i; // Calcular ángulo en radianes
            int petalX = centerX + (int) (petalRadius * Math.cos(angle)) - 30;
            int petalY = centerY + (int) (petalRadius * Math.sin(angle)) - 30;
            g2d.fillOval(petalX, petalY, 60, 60);
        }
    }

    public static void main(String[] args) {
        // Crear una ventana de diálogo
        JDialog dialog = new JDialog();
        dialog.setTitle("Dibujo de una Flor");
        dialog.setSize(300, 300); // Ajusta el tamaño de la ventana
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

        // Agregar el panel con el dibujo de la flor
        dialog.add(new FlorDibujo20());

        // Hacer visible la ventana de diálogo
        dialog.setVisible(true);
    }
}
