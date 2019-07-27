package model.items;

import model.units.IUnit;

/**
 * This interface represents the <i>weapons</i> that the units of the game can use.
 * <p>
 * The signature for all the common methods of the weapons are defined here. Every weapon have a
 * base damage and is strong or weak against other type of weapons.
 *
 * @author Ignacio Slater Muñoz
 * @since 1.0
 */
public interface IEquipableItem {

  void equipTo(IUnit playerFighter);

  void attack(Axe axe);

  IUnit getOwner();

  String getName();

  int getBaseDamage();

  int getMinRange();

  int getMaxRange();
}
