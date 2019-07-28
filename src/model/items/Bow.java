package model.items;

import model.units.IUnit;

/**
 * @author Ignacio Slater Muñoz
 * @since
 */
public class Bow implements IEquipableItem {

  public Bow(final String name, final int baseDamage, final int minRange, final int maxRange) {
  }

  @Override
  public void equipTo(final IUnit unit) {

  }

  @Override
  public IUnit getOwner() {
    return null;
  }

  @Override
  public String getName() {
    return null;
  }

  @Override
  public int getPower() {
    return 0;
  }

  @Override
  public int getMinRange() {
    return 0;
  }

  @Override
  public int getMaxRange() {
    return 0;
  }
}
