package poo;
import javax.swing.JFrame;

public class uso_panel {
    public static void main(String[] args) {

        Dibujar_Panel panel = new Dibujar_Panel();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(250,750);
        application.setVisible(true);
    }
}
