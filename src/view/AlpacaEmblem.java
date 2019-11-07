package view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * The main class of the Alpaca Emblem game.
 * <p>
 * The game as it is consists of 2 views:
 * <ul>
 *   <li>
 *     the first view contains a title and a button to go to the next view
 *   </li>
 *   <li>
 *     the second one is spliced into 2 sections
 *     <ul>
 *       <li>
 *         the first section (to the left) contains a small map with a sprite that can be moved with
 *         the arrow keys
 *       </li>
 *       <li>
 *         the panel to the left contains a list with clickable items and a text that changes
 *         depending on the clicked element
 *       </li>
 *     </ul>
 *   </li>
 * </ul>
 * </p>
 *
 * @author Ignacio slater Muñoz (mailto:ignacio.slater@ug.uchile.cl)
 * @version 3.0b4
 * @since 3.0
 */
public class AlpacaEmblem extends JFrame {

  private JPanel landingPageView;
  private JPanel mainPanel;
  private final String BACKGROUND_IMAGE = "resources/landing_page.jpg";

  /**
   * Initializes the game view.
   *
   * @throws HeadlessException
   *     when a necessary input/output functionality is missing in the system.
   */
  private AlpacaEmblem() throws HeadlessException {
    mainPanel = new JPanel(new CardLayout());
    setupViews();
    setupFrame();
  }

  /**
   * Starts the game loading the <i>landing page</i>.
   *
   * @param args
   *     not used
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(AlpacaEmblem::run);
  }

  /**
   * Creates a new instance of the game and runs it
   */
  private static void run() {
    AlpacaEmblem game = new AlpacaEmblem();
    game.setVisible(true);
  }

  /**
   * Creates the game views and adds them to the main app's panel
   */
  private void setupViews() {
    landingPageView = new ImagePanel(BACKGROUND_IMAGE);
    landingPageView.add(new JButton("Change view (coming soon)"));
    mainPanel.add(landingPageView);
  }

  /**
   * Associates the main panel to the app's frame and set's up the window parameters.
   */
  private void setupFrame() {
    this.setTitle("Alpaca Emblem");
    this.add(mainPanel, BorderLayout.CENTER);
    this.setSize(720, 720);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
