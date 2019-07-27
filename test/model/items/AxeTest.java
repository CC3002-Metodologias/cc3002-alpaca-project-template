package model.items;

import static org.junit.jupiter.api.Assertions.assertEquals;

import model.map.Location;
import model.units.Fighter;
import model.units.IUnit;
import org.junit.jupiter.api.Test;

/**
 * @author Ignacio Slater Muñoz
 * @since 1.0
 */
class AxeTest extends AbstractTestItem {

  private Axe axe;
  private Axe hatchet;

  @Override
  public void setTestItem() {
    expectedName = "Common axe";
    expectedBaseDamage = 10;
    expectedMinRange = 1;
    expectedMaxRange = 1;
    axe = new Axe("Common axe", 10, 1, 1);
  }

  @Override
  public void setSecondaryTestItem() {
    hatchet = new Axe("Hatchet", 5, 1, 2);
  }

  @Override
  public IEquipableItem getTestItem() {
    return axe;
  }

  // TODO: Remove secondary item and move it to a child class
  public IEquipableItem getSecondaryTestWeapon() {
    return hatchet;
  }

  @Test
  public void attackAxeTest() {
    IUnit playerFighter = new Fighter(10, 5, new Location('A', 0));
    IUnit opponentFighter = new Fighter(5, 7, new Location('A', 1));
    axe.equipTo(playerFighter);
    hatchet.equipTo(opponentFighter);
    hatchet.attack(axe);
    assertEquals(5, axe.getOwner().getHitPoints());
    axe.attack(hatchet);
    assertEquals(0, axe.getOwner().getHitPoints());
  }
}