package model.units;

/**
 * @author Ignacio Slater Muñoz
 * @since 1.0
 */
public abstract class AbstractTestUnit implements ITestUnit {

  protected Alpaca targetAlpaca;

  @Override
  public void setTargetAlpaca(final Alpaca alpaca) {
    targetAlpaca = alpaca;
  }
}
