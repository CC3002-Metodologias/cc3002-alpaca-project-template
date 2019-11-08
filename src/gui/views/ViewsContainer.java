package gui.views;

import java.awt.CardLayout;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Container for the game views
 *
 * @author Ignacio slater Muñoz (mailto:ignacio.slater@ug.uchile.cl)
 * @version 3.0b8
 * @since 3.0
 */
public class ViewsContainer extends JPanel {

  private final JFrame game;

  /**
   * Creates the container as a panel that can contain multiple cards.
   *
   * @param game
   *     the main frame of the game
   */
  public ViewsContainer(final JFrame game)
      throws UnsupportedAudioFileException, IOException, LineUnavailableException {
    super(new CardLayout());
    this.game = game;
    setupViews();
  }

  /**
   * Creates the views inside the container.
   */
  private void setupViews()
      throws UnsupportedAudioFileException, IOException, LineUnavailableException {
    this.add(new LandingView(this));
    this.add(new FieldView());
  }

  public void changeFrameDimensions(final int x, final int y) {
    game.setSize(x, y);
  }

  public void nextView() {
    ((CardLayout) super.getLayout()).next(this);
  }
}
