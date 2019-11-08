package gui;

import gui.components.AbstractMovableComponent;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Area extends AbstractMovableComponent {

  public Area(int x, int y) {
    super(x, y);

    initArea();
  }

  private void initArea() {

    ImageIcon iicon = new ImageIcon("src/resources/area.png");
    Image image = iicon.getImage();
    setImage(image);
  }
}
