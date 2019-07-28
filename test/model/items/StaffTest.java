package model.items;

/**
 * Test set for staffs
 *
 * @author Ignacio Slater Muñoz
 * @since 1.0
 */
public class StaffTest extends AbstractTestItem {

  private Staff staff;

  /**
   * Sets which item is going to be tested
   */
  @Override
  public void setTestItem() {
    expectedName = "Common staff";
    expectedPower = 5;
    expectedMinRange = 1;
    expectedMaxRange = 1;
    staff = new Staff(expectedName, expectedPower, expectedMinRange, expectedMaxRange);
  }

  /**
   * @return the item being tested
   */
  @Override
  public IEquipableItem getTestItem() {
    return staff;
  }
}
