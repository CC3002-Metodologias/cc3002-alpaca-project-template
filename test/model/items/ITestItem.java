package model.items;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import model.map.Location;
import model.units.Fighter;
import org.junit.jupiter.api.Assertions;
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
   * Sets up the item to be tested
   */
  @BeforeEach
  default void setUp() {
    setTestItem();
  }

  /**
   * Sets which item is going to be tested
   */
  void setTestItem();

  /**
   * Tests that the constructor for the tested item works properly
   */
  @Test
  default void constructorTest() {
    Assertions.assertEquals(getExpectedName(), getTestItem().getName());
    Assertions.assertEquals(getExpectedBasePower(), getTestItem().getPower());
    Assertions.assertEquals(getExpectedMinRange(), getTestItem().getMinRange());
    Assertions.assertEquals(getExpectedMaxRange(), getTestItem().getMaxRange());
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
    Fighter fighter = new Fighter(10, 5, new Location('A', 0));
    getTestItem().equipTo(fighter);
    assertEquals(fighter, getTestItem().getOwner());
  }
}
