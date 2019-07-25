package model.units;

import model.map.Location;

/**
 * This class represents an <i>Archer</i> type unit.
 * <p>
 * This kind of unit <b>can only use bows</b>.
 *
 * @author Ignacio Slater Muñoz
 * @since 1.0
 */
public class Archer extends AbstractUnit {

  public Archer(final int hitPoints, final int movement, final Location position) {
    super(hitPoints, movement, position);
  }
}
