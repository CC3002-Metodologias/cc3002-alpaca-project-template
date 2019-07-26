package model.items;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Ignacio Slater Muñoz
 * @since 1.0
 */
class AxeTest {

  private Axe axe;
  private Axe hatchet;

  @BeforeEach
  void setUp() {
    axe = new Axe("Common axe", 10, 1, 1);
    hatchet = new Axe("Hatchet", 5, 1, 2);
  }

  @Test
  public void constructorTest() {
    assertEquals("Common axe", axe.getName());
    assertEquals(10, axe.getBaseDamage());
    assertEquals(1, axe.getMinRange());
    assertEquals(1, axe.getMaxRange());

    assertEquals("Hatchet", hatchet.getName());
    assertEquals(5, hatchet.getBaseDamage());
    assertEquals(1, hatchet.getMinRange());
    assertEquals(2, hatchet.getMaxRange());
  }

  @AfterEach
  void tearDown() {
  }
}