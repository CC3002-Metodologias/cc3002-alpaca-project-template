package gui.components;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 * @author Ignacio Slater Muñoz
 * @since
 */
public class Player {

  private final String SPRITE_PATH = "resources/sprite.png";
  private final Image sprite;
  private int x, y;

  public Player() {
    sprite = new ImageIcon(SPRITE_PATH).getImage();
  }

  private void moveRight() {
    x += sprite.getWidth(null);
    y += sprite.getHeight(null);
  }
}
