package model.map;

import java.util.Set;

/**
 * This class represents a <i>location</i> in the game's map.
 * <p>
 * A location is simply a graph node with connections to all adjacent positions to it. Every node
 * in the graph contains an id that represents it's position, with rows represented as characters
 * and columns with numbers (just like in a chess table), a list of references and distances to all
 * of it's neighbours and a reference to the unit that's currently in that position (in case there
 * is one).
 * <p>
 * Note that a structure like this let's it's user implement more complicated maps than a simple
 * chess one, but for simplicity, it will be assumed that the distance between any node and it's
 * neighbours will be always 1.
 *
 * @author Ignacio Slater Muñoz
 * @since 1.0
 */
public class Location {

  private Set<Location> neighbours;

  public Location(final char row, final int column) {
  }

  @Override
  public boolean equals(final Object other) {
    return other instanceof Location;
  }

  public Set<Location> getNeighbours() {
    return neighbours;
  }

  public void addNeighbour(final Location neighbour) {
  }

  boolean isNeighbour(final Location otherLocation) {
    return false;
  }
}
