package model.units;

import model.items.Axe;

/**
 * @author Ignacio Slater Muñoz
 * @since 1.0
 */
public abstract class AbstractTestUnit implements ITestUnit {

  protected Alpaca targetAlpaca;
  protected Axe axe;

  @Override
  public void setTargetAlpaca(final Alpaca alpaca) {
    targetAlpaca = alpaca;
  }

  @Override
  public void setAxe(final Axe axe) {
    this.axe = axe;
  }
}
