import javax.swing.JFrame;

public class PruebaPanelDibujo
{
    public static void main(String[] args)
    {
        PanelDibujo panel = new PanelDibujo();

        JFrame aplication = new JFrame();

        aplication.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        aplication.add(panel);
        aplication.setSize(500, 500);
        aplication.setVisible(true);
    }
}
