package view;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 * @author Ignacio Slater Muñoz
 * @since
 */
public class Application extends JFrame {

  public Application() {
    add(new Board());
    setTitle("Application");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
  }

  public static void main(String[] args) {
    EventQueue.invokeLater(Application::run);
  }

  private static void run() {
    Application app = new Application();
    app.setVisible(true);
  }
}
