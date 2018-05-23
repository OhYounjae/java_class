package kr.ac.kookmin.cs.oop.object;

public class PremiumTire extends Tire{
  public PremiumTire(int maxRotation) {
    super(maxRotation);
  }
  
  @Override
  protected void incrementRotation() {
    //������ Ȯ���� ���������� ����
    if(Math.random() < 0.5) {
      ++accumulatedRotation;
    }
  }
}

