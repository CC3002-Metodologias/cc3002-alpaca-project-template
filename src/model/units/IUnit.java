package model.units;

import java.util.List;
import model.items.IEquipableItem;
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

  void equipItem(IEquipableItem weapon);

  abstract int getHitPoints();

  abstract int getMovement();

  abstract Location getLocation();

  abstract List<IEquipableItem> getWeapons();

  abstract IEquipableItem getEquippedItem();

  abstract void setEquippedWeapon(IEquipableItem weapon);

  void useItemOn(IUnit target);
}
