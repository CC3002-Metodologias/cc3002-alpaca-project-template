package view.panel;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 * Container for the game views
 *
 * @author Ignacio slater Muñoz (mailto:ignacio.slater@ug.uchile.cl)
 * @version 3.0b5
 * @since 3.0
 */
public class Container extends JPanel {

  /**
   * Creates the container as a panel that can contain multiple cards.
   */
  public Container() {
    super(new CardLayout());
    setupViews();
  }

  /**
   * Creates the views inside the container.
   */
  private void setupViews() {
    this.add(new LandingPanel());
  }
}
