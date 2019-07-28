package model.items;

/**
 * Defines some common methods for all the items tests
 *
 * @author Ignacio Slater Muñoz
 * @since 1.0
 */
public abstract class AbstractTestItem implements ITestItem {

  protected String expectedName;
  protected int expectedPower;
  protected int expectedMinRange;
  protected short expectedMaxRange;

  @Override
  public String getExpectedName() {
    return expectedName;
  }

  @Override
  public int getExpectedBasePower() {
    return expectedPower;
  }

  @Override
  public int getExpectedMinRange() {
    return expectedMinRange;
  }

  @Override
  public int getExpectedMaxRange() {
    return expectedMaxRange;
  }
}
