package model.units;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import model.items.*;
import model.map.Location;
import org.junit.jupiter.api.Test;

/**
 * @author Ignacio Slater Muñoz
 * @since 1.0
 */
public class AlpacaTest extends AbstractTestUnit {

  private Alpaca alpaca;

  @Override
  public void setTestUnit() {
    alpaca = new Alpaca(50, 10, new Location('A', 0));
  }

  @Override
  public Alpaca getTestUnit() {
    return alpaca;
  }

  /**
   * Tries to equip a weapon to the alpaca and verifies that it was not equipped
   *
   * @param expectedItem
   *     to be equipped
   */
  public void checkEquippedItem(IEquipableItem expectedItem) {
    assertNull(alpaca.getEquippedItem());
  }

  @Override
  @Test
  public void equipSwordTest() {
    assertNull(alpaca.getEquippedItem());
    getTestUnit().equipItem(new Sword("Sword", 10, 1, 1));
    checkEquippedItem(new Sword("Sword", 10, 1, 1));
  }

  @Override
  @Test
  public void equipSpearTest() {
    assertNull(alpaca.getEquippedItem());
    checkEquippedItem(new Spear("Spear", 10, 1, 1));
  }

  @Override
  @Test
  public void equipStaffTest() {
    assertNull(alpaca.getEquippedItem());
    checkEquippedItem(new Staff("Staff", 10, 1, 1));
  }

  @Override
  @Test
  public void equipBowTest() {
    assertNull(alpaca.getEquippedItem());
    checkEquippedItem(new Bow("Bow", 10, 1, 1));
  }

  @Test
  public void useItemOnAlpaca() {
    useItemOn(targetAlpaca, 50);
  }

  private void useItemOn(IUnit target, int expectedHitPoints) {
    alpaca.useItemOn(targetAlpaca);
    assertEquals(expectedHitPoints, target.getHitPoints());
  }
}