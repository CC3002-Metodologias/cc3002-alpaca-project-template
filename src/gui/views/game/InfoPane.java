package gui.views.game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

/**
 * Panel containing information about the current game.
 *
 * @author Ignacio Slater Muñoz
 * @version 3.0b11
 * @since 3.0
 */
public class InfoPane extends JPanel {

  /**
   * Creates a new <code>InfoPane</code> with a double buffer
   * and a flow layout.
   */
  public InfoPane() {
    this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
    Border margin = new EmptyBorder(10, 10, 10, 10);
    this.setBorder(new CompoundBorder(this.getBorder(), margin));
    JLabel controlsLabel = new JLabel("Controls:");
    controlsLabel.setFont(new Font(controlsLabel.getFont().getName(), Font.BOLD, 16));
    this.add(controlsLabel);
    this.add(new JLabel("Controls:"));
  }

  @Override
  protected void paintComponent(final Graphics graphics) {
    graphics.setColor(new Color(128, 128, 128));
    graphics.fillRect(0, 0, this.getWidth(), this.getHeight());
  }
}
