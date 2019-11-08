package gui;

import gui.components.AbstractMovableComponent;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Player extends AbstractMovableComponent {

  public Player(int x, int y) {
    super(x, y);

    initPlayer();
  }

  private void initPlayer() {

    ImageIcon iicon = new ImageIcon("resources/sprite.png");
    Image image = iicon.getImage();
    setImage(image);
  }

}
