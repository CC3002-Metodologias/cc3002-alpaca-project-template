package model.units;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import model.items.Axe;
import model.items.IEquipableItem;
import model.map.Location;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

/**
 * Interface that defines the common behaviour of all the test for the units classes
 *
 * @author Ignacio Slater Muñoz
 * @since 1.0
 */
@TestInstance(Lifecycle.PER_CLASS)
public interface ITestUnit {

  @BeforeEach
  default void setUp() {
    setTestUnit();
    setTargetAlpaca(new Alpaca(50, 10, new Location('A', 1)));
  }

  void setTestUnit();

  void setTargetAlpaca(Alpaca alpaca);

  @Test
  default void constructorTest() {
    assertEquals(50, getTestUnit().getHitPoints());
    assertEquals(10, getTestUnit().getMovement());
    assertEquals(new Location('A', 0), getTestUnit().getLocation());
    assertTrue(getTestUnit().getWeapons().isEmpty());
  }

  IUnit getTestUnit();

  @Test
  default void equipAxeTest() {
    assertNull(getTestUnit().getEquippedItem());
    checkEquippedItem(new Axe("Axe", 10, 1, 1));
  }

  void checkEquippedItem(IEquipableItem weapon);

  @Test
  void equipSwordTest();

  @Test
  void equipSpearTest();

  @Test
  void equipStaffTest();

  @Test
  void equipBowTest();
}
