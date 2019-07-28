package model.items;

/**
 * Defines some common methods for all the items tests
 *
 * @author Ignacio Slater Muñoz
 * @since 1.0
 */
public abstract class AbstractTestItem implements ITestItem {

  protected String expectedName;
  protected int expectedBaseDamage;
  protected int expectedMinRange;
  protected short expectedMaxRange;

  @Override
  public String getExpectedName() {
    return expectedName;
  }

  @Override
  public int getExpectedBasePower() {
    return expectedBaseDamage;
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
