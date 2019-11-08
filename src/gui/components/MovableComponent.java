package gui.components;

import java.awt.Image;
import java.awt.Point;

/**
 * @author Ignacio Slater Muñoz
 * @since 3.0
 */
public class MovableComponent {

  private final int SPACE = 20;
  protected int x;
  protected int y;
  private Point position;
  private Image image;

  public MovableComponent(Point startingPosition) {
    position = startingPosition;
  }

  public Image getImage() {
    return image;
  }

  public void setImage(Image img) {
    image = img;
  }

  public boolean isLeftCollision() {
    return false;
  }

  public boolean isRightCollision(AbstractMovableComponent actor) {

    return x() + SPACE == actor.x() && y() == actor.y();
  }

  public int x() {

    return x;
  }

  public int y() {

    return y;
  }

  public boolean isTopCollision(AbstractMovableComponent actor) {

    return y() - SPACE == actor.y() && x() == actor.x();
  }

  public boolean isBottomCollision(AbstractMovableComponent actor) {

    return y() + SPACE == actor.y() && x() == actor.x();
  }

  public void moveUp(final int amount) {
    move(0, -amount);
  }

  public void move(int x, int y) {

    int dx = x() + x;
    int dy = y() + y;

    setX(dx);
    setY(dy);
  }

  public void setX(int x) {

    this.x = x;
  }

  public void setY(int y) {

    this.y = y;
  }
}
