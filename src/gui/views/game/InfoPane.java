package gui.views.game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

/**
 * Panel containing information about the current game.
 *
 * @author Ignacio Slater Muñoz
 * @version 3.0rc1
 * @since 3.0
 */
public class InfoPane extends JPanel {

  private final Color[] COLORS = new Color[]{
      Color.RED,
      Color.GREEN,
      Color.BLUE,
      Color.LIGHT_GRAY,
      Color.WHITE
  };
  private Color paneColor = Color.LIGHT_GRAY;

  /**
   * Creates a new <code>InfoPane</code> with a double buffer and a box layout.
   */
  public InfoPane() {
    setupLayout();
    setupLabels();
    setupColorPicker();
  }

  /**
   * Configures the pane with a box layout and a 10 pixel margin
   */
  private void setupLayout() {
    this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
    Border margin = new EmptyBorder(10, 10, 10, 10);
    this.setBorder(new CompoundBorder(this.getBorder(), margin));
  }

  /**
   * Creates and places the labels of the pane
   */
  private void setupLabels() {
    JLabel controlsLabel = new JLabel("Controls:");
    controlsLabel.setFont(new Font(controlsLabel.getFont().getName(), Font.BOLD, 16));
    this.add(controlsLabel);
    this.add(Box.createRigidArea(new Dimension(0, 10)));

    this.add(new JLabel("ARROW KEYS: Move"));
    this.add(new JLabel("ENTER: Play sound"));
    this.add(Box.createRigidArea(new Dimension(0, 20)));

    JLabel colorsLabel = new JLabel("Color picker");
    colorsLabel.setFont(new Font(colorsLabel.getFont().getName(), Font.BOLD, 16));
    this.add(colorsLabel);
    this.add(Box.createRigidArea(new Dimension(0, 10)));
  }

  /**
   * Creates a list of colors to pick and a button to change the current pane's color
   */
  private void setupColorPicker() {
    JList colorList = new JList<>(new String[]{
        "Red",
        "Green",
        "Blue",
        "Gray",
        "White"
    });
    colorList.setSelectedIndex(0);
    colorList.setLayout(new BoxLayout(colorList, BoxLayout.PAGE_AXIS));
    this.add(colorList);
    JButton pickColorBtn = new JButton("Change color");
    pickColorBtn.addActionListener(e -> {
      paneColor = COLORS[colorList.getSelectedIndex()];
      repaint();
    });
    this.add(pickColorBtn);
  }

  @Override
  protected void paintComponent(final Graphics graphics) {
    graphics.setColor(paneColor);
    graphics.fillRect(0, 0, this.getWidth(), this.getHeight());
  }
}
