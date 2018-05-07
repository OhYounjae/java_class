package kr.ac.kookmin.cs.oop.object;

public class Calculator {
  boolean on = false;
  void powerOn() {
    on = true;
    System.out.println("Calculator On");
  }
  
  int plus(int x, int y) {
    int result = x + y;
    System.out.println("Two int variables sum");
    return result;
  }
  
  int plus(double x, int y) {
    return (int) x + y;
  }
  
  double plus(int x, double y) {
    return x + y;
  }
  
  int plus(int x, int y, int z) {
    return x + y + z;
  }
  
  double plus(double x, double y) {
    double result = x + y;
    System.out.println("Two double variables sum");
    return result;
  }
  
  int sums(int[] inputs) { 
    int sum = 0;
  //for(int i = 0; i < inputs.length; i++) inputs[i]
    for(int i : inputs) { 
      sum += i;
    }
    return sum;
  }
  
  //...�� �迭�� ǥ���ϴ� �ٸ� ���  
  int sumArray(int...inputs) {
    int sum = 0;
    for(int i : inputs) {
      sum += i;
    }
    return sum;
  }
  
  double divide(int x, int y) {
    double result = (double) x / (double) y;
    return result;
  }  

  double average(int... inputs) { 
    int sum = sumArray(inputs);
    return divide(sum, inputs.length);
  }
  
  int getRectangleArea(int width, int height) {
    return width * height;
  }
  
  int getRectangleArea(int width) {
    
    //�ڵ� ���������� ���ؼ� method overloading�� ����ϴ� ���� ����
    return getRectangleArea(width, width);
  }
    
  
}
