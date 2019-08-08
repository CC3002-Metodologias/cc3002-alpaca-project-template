package model.units;

import model.items.*;
import model.map.Field;
import model.map.Location;

/**
 * @author Ignacio Slater Muñoz
 * @since 1.0
 */
public abstract class AbstractTestUnit implements ITestUnit {

  protected Alpaca targetAlpaca;
  protected Bow bow;
  protected Field field;
  private Axe axe;
  private Sword sword;
  private Staff staff;
  private Spear spear;

  @Override
  public void setTargetAlpaca() {
    targetAlpaca = new Alpaca(50, 2, field.getCell(1, 0));
  }

  @Override
  public void setField() {
    this.field = new Field();
    this.field.addCells(true, new Location(0, 0), new Location(0, 1), new Location(0, 2),
        new Location(1, 0), new Location(1, 1), new Location(1, 2), new Location(2, 0),
        new Location(2, 1), new Location(2, 2));
  }

  @Override
  public void setWeapons() {
    this.axe = new Axe("Axe", 10, 1, 2);
    this.sword = new Sword("Sword", 10, 1, 2);
    this.spear = new Spear("Spear", 10, 1, 2);
    this.staff = new Staff("Staff", 10, 1, 2);
    this.bow = new Bow("Bow", 10, 2, 3);
  }

  @Override
  public Axe getAxe() {
    return axe;
  }

  @Override
  public Sword getSword() {
    return sword;
  }

  @Override
  public Spear getSpear() {
    return spear;
  }

  @Override
  public Staff getStaff() {
    return staff;
  }

  @Override
  public Bow getBow() {
    return bow;
  }

  @Override
  public Field getField() {
    return field;
  }

  @Override
  public Alpaca getTargetAlpaca() {
    return targetAlpaca;
  }
}
