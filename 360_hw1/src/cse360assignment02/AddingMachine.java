// Assignment 2: CSE 360
// Claire Cirelli
// 1214574634 | cmcirell

package cse360assignment02;

public class AddingMachine {
  private int total;
  private String show_calc;
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    show_calc = "0";
  }
  
  public int getTotal () {
    return total;
  }
  
  public void add (int value) {
	  total += value;
	  show_calc += " + " + value;
  }

  public void subtract (int value) {
	  total += value;
	  show_calc += " - " + value;
  }

  public String toString () {
	  return show_calc;
  }

  public void clear() {
	  total = 0;
	  show_calc = "0";
  }
}