package gui.components;

import java.awt.Point;

public abstract class AbstractMovableComponent extends MovableComponent {

  protected AbstractMovableComponent(int x, int y) {
    super(new Point(x, y));
  }
}