package model.items;

import model.units.IUnit;

/**
 * @author Ignacio Slater Muñoz
 * @since
 */
public class Axe implements IEquipableItem {

  private int baseDamage;
  private int minRange;
  private String name;
  private int maxRange;

  public Axe(final String name, final int baseDamage, final int minRange,
      final int maxRange) {
  }

  @Override
  public void equipTo(final IUnit unit) {

  }

  public int getMinRange() {
    return minRange;
  }

  public String getName() {
    return name;
  }

  public int getMaxRange() {
    return maxRange;
  }

  public int getPower() {
    return baseDamage;
  }

  @Override
  public IUnit getOwner() {
    return null;
  }
}
