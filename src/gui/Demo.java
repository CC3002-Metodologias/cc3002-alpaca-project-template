package gui;

import gui.views.FieldView;
import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 * Main class of the Alpaca Emblem game.
 *
 * @author Ignacio Slater Muño<
 * @version 3.0b7
 * @since 3.0
 */
public class Demo extends JFrame {

  /**
   * Creates the game's graphic interface
   */
  public Demo() {
    FieldView fieldView = new FieldView();
    add(fieldView);

    setTitle("Alpaca Emblem");

    final int OFFSET = 30;
    setSize(fieldView.getFieldWidth() + OFFSET, fieldView.getFieldHeight() + 2 * OFFSET);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
  }

  /**
   * Runs the game.
   *
   * @param args
   *     not used
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(Demo::run);
  }

  /**
   * Initiates the GUI and makes it visible
   */
  private static void run() {
    Demo game = new Demo();
    game.setVisible(true);
  }
}
