package view.panel;

import javax.swing.JButton;
import view.ImagePanel;

/**
 * This class represents the landing panel of the application.
 * <p>
 * A landing panel is the first view that the user will see when running the application.
 * </p>
 * This panel contains a button to move to the next view.
 *
 * @author Ignacio Slater Muñoz (mailto:ignacio.slater@ug.uchile.cl)
 * @version 3.0b5
 * @since 3.0
 */
public class LandingPanel extends ImagePanel {

  private static final String BACKGROUND_IMAGE = "resources/landing_page.jpg";

  /**
   * Creates de landing panel with a background image and a button.
   */
  public LandingPanel() {
    super(BACKGROUND_IMAGE);
    this.setLayout(null);
    JButton changeViewBtn = new JButton("Change view (coming soon)");
    changeViewBtn.setBounds(panelBackground.getWidth(null) / 2 - 160,
        panelBackground.getHeight(null) / 2 - 20, 320, 40);
    this.add(changeViewBtn);
  }
}
