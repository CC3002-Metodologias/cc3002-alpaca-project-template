package model.units;

import java.util.List;
import model.items.IWeapon;
import model.map.Location;

/**
 * This interface represents all units in the game.
 * <p>
 * The signature of all the common methods that a unit can execute are defined here. All units
 * except some special ones can carry at most 3 weapons.
 *
 * @author Ignacio Slater Muñoz
 * @since 1.0
 */
public interface IUnit {

  void equipWeapon(IWeapon weapon);

  /**
   * @return the current hit points of the unit
   */
  int getHitPoints();

  /**
   * @return the amount of panels this unit can move
   */
  int getMovement();

  /**
   * @return the current location of this unit
   */
  Location getLocation();

  /**
   * @return the list of weapons this unit has
   */
  List<IWeapon> getWeapons();

  /**
   * @return the unit's currently equipped weapon
   */
  IWeapon getEquippedWeapon();

  /**
   * @param weapon
   *     the weapon that wants to be equipped to the unit
   */
  void setEquippedWeapon(IWeapon weapon);
}
