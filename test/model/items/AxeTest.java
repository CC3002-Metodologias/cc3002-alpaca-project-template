package model.items;

/**
 * Test set for Axes
 *
 * @author Ignacio Slater Muñoz
 * @since 1.0
 */
class AxeTest extends AbstractTestItem {

  private Axe axe;

  @Override
  public void setTestItem() {
    expectedName = "Common axe";
    expectedBaseDamage = 10;
    expectedMinRange = 1;
    expectedMaxRange = 2;
    axe = new Axe(expectedName, expectedBaseDamage, expectedMinRange, expectedMaxRange);
  }

  @Override
  public IEquipableItem getTestItem() {
    return axe;
  }
}