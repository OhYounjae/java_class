package kr.ac.kookmin.cs.oop.object;

public class Tire {
  private final int maxRotation;
  protected int accumulatedRotation;
  
  public Tire(int maxRotation) {
    this.maxRotation = maxRotation;
    this.accumulatedRotation = 0;
  }
  
  //������ public
  protected void incrementRotation() {
    ++accumulatedRotation;
  }
  
  public boolean roll() {
    incrementRotation();
    return checkTireLongevity();
  }
  
  public int getRemainingRotation() {
    return this.maxRotation - this.accumulatedRotation;
  }
  
  //���� protected
  public boolean checkTireLongevity() {
    if(accumulatedRotation < maxRotation) {
      return true;
    } else {
      return false;
    }
  }
}
