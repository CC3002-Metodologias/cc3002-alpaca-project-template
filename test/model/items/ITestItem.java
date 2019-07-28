package model.items;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import model.units.IUnit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Common interface for all the Item's Tests
 *
 * @author Ignacio Slater Muñoz
 * @since 1.0
 */
public interface ITestItem {

  /**
   * Sets up the items to be tested
   */
  @BeforeEach
  default void setUp() {
    setTestItem();
    setWrongRangeItem();
    setTestUnit();
  }

  /**
   * Sets up a correctly implemented item that's going to be tested
   */
  void setTestItem();

  /**
   * Sets up an item with wrong ranges setted.
   */
  void setWrongRangeItem();

  /**
   * Sets the unit that will be equipped with the test item
   */
  void setTestUnit();

  /**
   * Checks that the tested item cannot have ranges outside of certain bounds.
   */
  @Test
  default void incorrectRangeTest() {
    assertTrue(getWrongTestItem().getMinRange() >= 0);
    assertTrue(getWrongTestItem().getMaxRange() >= getWrongTestItem().getMinRange());
  }

  IEquipableItem getWrongTestItem();

  /**
   * Tests that the constructor for the tested item works properly
   */
  @Test
  default void constructorTest() {
    assertEquals(getExpectedName(), getTestItem().getName());
    assertEquals(getExpectedBasePower(), getTestItem().getPower());
    assertEquals(getExpectedMinRange(), getTestItem().getMinRange());
    assertEquals(getExpectedMaxRange(), getTestItem().getMaxRange());
  }

  /**
   * @return the expected name of the item
   */
  String getExpectedName();

  /**
   * @return the item being tested
   */
  IEquipableItem getTestItem();

  /**
   * @return the expected power of the Item
   */
  int getExpectedBasePower();

  /**
   * @return the expected minimum range of the item
   */
  int getExpectedMinRange();

  /**
   * @return the expected maximum range of the item
   */
  int getExpectedMaxRange();

  /**
   * Checks that the Item can be correctly equipped to a unit
   */
  @Test
  default void equippedToTest() {
    assertNull(getTestItem().getOwner());
    IUnit unit = getTestUnit();
    getTestItem().equipTo(unit);
    assertEquals(unit, getTestItem().getOwner());
  }

  /**
   * @return a unit that can equip the item being tested
   */
  IUnit getTestUnit();
}
