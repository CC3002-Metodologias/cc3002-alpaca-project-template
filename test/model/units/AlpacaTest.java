package model.units;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import model.items.Axe;
import model.map.Location;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Ignacio Slater Muñoz
 * @since 1.0
 */
public class AlpacaTest {

  private Alpaca alpaca;

  @BeforeEach
  public void setUp() {
    alpaca = new Alpaca(50, 10, new Location('A', 0));
  }

  @Test
  public void constructorTest() {
    assertEquals(50, alpaca.getHitPoints());
    assertEquals(10, alpaca.getMovement());
    assertEquals(new Location('A', 0), alpaca.getLocation());
    assertTrue(alpaca.getWeapons().isEmpty());
  }

  @Test
  public void equipWeaponTest() {
    assertNull(alpaca.getEquippedWeapon());
    alpaca.equipWeapon(new Axe("Axe", 10, 1, 1));
  }

  @AfterEach
  public void tearDown() throws Exception {
  }
}