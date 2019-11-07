package view;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * @author Ignacio Slater Muñoz
 * @version 3.0b4
 * @since 3.0
 */
class ImagePanel extends JPanel {

  private Image img;

  public ImagePanel(String imgPath) {
    this(new ImageIcon(imgPath).getImage());
  }

  private ImagePanel(Image img) {
    super();
    this.img = img;
  }

  public void paintComponent(Graphics g) {
    g.drawImage(img, 0, 0, null);
  }

}


