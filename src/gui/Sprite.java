package gui;

import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

/**
 * @author Ignacio Slater Muñoz
 * @since
 */
public class Sprite {

  private int
      width,
      height,
      dx,
      dy,
      x = 40,
      y = 60;
  private Image image;

  public Sprite() {
    ImageIcon icon = new ImageIcon("resources/ejemplo.jpg");
    image = icon.getImage();
    width = image.getWidth(null);
    height = image.getHeight(null);
  }

  public void move() {
    y += dy;
    x += dx;
  }

  public void keyPressed(KeyEvent event) {
    int key = event.getKeyCode();
    if (key == KeyEvent.VK_LEFT) {
      dx = -2;
    }

    if (key == KeyEvent.VK_RIGHT) {
      dx = 2;
    }

    if (key == KeyEvent.VK_UP) {
      dy = -2;
    }

    if (key == KeyEvent.VK_DOWN) {
      dy = 2;
    }
  }

  public void keyReleased(KeyEvent e) {

    int key = e.getKeyCode();

    if (key == KeyEvent.VK_LEFT) {
      dx = 0;
    }

    if (key == KeyEvent.VK_RIGHT) {
      dx = 0;
    }

    if (key == KeyEvent.VK_UP) {
      dy = 0;
    }

    if (key == KeyEvent.VK_DOWN) {
      dy = 0;
    }
  }

  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public Image getImage() {
    return image;
  }
}
