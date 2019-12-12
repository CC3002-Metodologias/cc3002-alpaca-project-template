package model.map;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import org.jetbrains.annotations.NotNull;

public class Path implements Comparable {

  private final Location last;
  private final int length;
  private final List<Location> locations;

  public Path(Path prevPath, Location nextLocation) {
    locations = new LinkedList<>(
        prevPath != null ? prevPath.locations : Collections.emptyList());
    locations.add(nextLocation);
    last = nextLocation;
    length = locations.size() - 1;
  }

  @Override
  public int compareTo(@NotNull final Object another) {
    return length;
  }

  public int getLength() {
    return length;
  }

  public boolean endsIn(final Location location) {
    return last == location;
  }

  public List<Location> reachableLocations() {
    return last.getNeighbours().stream()
        .filter(location -> !locations.contains(location))
        .collect(Collectors.toCollection(LinkedList::new));
  }
}
