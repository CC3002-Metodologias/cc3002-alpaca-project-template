package gui;

import gui.components.AbstractMovableComponent;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Wall extends AbstractMovableComponent {

  private Image image;

  public Wall(int x, int y) {
    super(x, y);

    initWall();
  }

  private void initWall() {

    ImageIcon iicon = new ImageIcon("src/resources/wall.png");
    image = iicon.getImage();
    setImage(image);
  }

}
