package model.items;

/**
 * @author Ignacio Slater Muñoz
 * @since
 */
public class Axe implements IWeapon {

  private int baseDamage;
  private int minRange;
  private String name;
  private int maxRange;

  public Axe(final String name, final int baseDamage, final int minRange,
      final int maxRange) {
  }

  public int getBaseDamage() {
    return baseDamage;
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
}
