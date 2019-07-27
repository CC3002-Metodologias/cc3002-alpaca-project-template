package model.units;

import java.util.ArrayList;
import java.util.List;
import model.items.IEquipableItem;
import model.map.Location;

/**
 * This class represents an abstract unit.
 * <p>
 * An abstract unit is a unit that cannot be used in the
 * game, but that contains the implementation of some of the methods that are common for most
 * units.
 *
 * @author Ignacio Slater Muñoz
 * @since 1.0
 */
public abstract class AbstractUnit implements IUnit {

  protected final List<IEquipableItem> weapons = new ArrayList<>();
  private final int hitPoints;
  private final int movement;
  private final Location location;
  private IEquipableItem equippedWeapon;

  /**
   * Creates a new Unit.
   *
   * @param hitPoints
   *     the maximum amount of damage a unit can sustain
   * @param movement
   *     the number of panels a unit can move
   * @param location
   *     the current position of this unit on the map
   */
  protected AbstractUnit(final int hitPoints, final int movement,
      final Location location) {
    this.hitPoints = hitPoints;
    this.movement = movement;
    this.location = location;
  }

  @Override
  public void equipItem(final IEquipableItem weapon) {

  }

  @Override
  public int getHitPoints() {
    return hitPoints;
  }

  @Override
  public int getMovement() {
    return movement;
  }

  @Override
  public Location getLocation() {
    return location;
  }

  @Override
  public List<IEquipableItem> getWeapons() {
    return weapons;
  }

  @Override
  public IEquipableItem getEquippedItem() {
    return equippedWeapon;
  }

  @Override
  public void setEquippedWeapon(final IEquipableItem weapon) {
    this.equippedWeapon = weapon;
  }

  @Override
  public void useItemOn(final IUnit target) {

  }
}
