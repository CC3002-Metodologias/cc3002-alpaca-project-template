package gui;

import gui.components.AbstractMovableComponent;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Baggage extends AbstractMovableComponent {

  public Baggage(int x, int y) {
    super(x, y);

    initBaggage();
  }

  private void initBaggage() {

    ImageIcon iicon = new ImageIcon("src/resources/baggage.png");
    Image image = iicon.getImage();
    setImage(image);
  }

  public void move(int x, int y) {

    super.move(x, y);
  }
}
