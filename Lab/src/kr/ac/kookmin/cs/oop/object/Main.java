package kr.ac.kookmin.cs.oop.object;

public class Main {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
  /*  Calculator myCalculator = new Calculator();
    System.out.println(myCalculator.on);
    
    myCalculator.powerOn();
    System.out.println(myCalculator.on);
    
    int sumResult = myCalculator.plus(30, 100);
    System.out.println(sumResult);
    
    int[] numbers = {10, 9, 8, 7, 6};
    System.out.println(myCalculator.sumArray(numbers));
    System.out.println(myCalculator.sumArray(new int[] {1, 2}));
    System.out.println(myCalculator.sums(numbers));
    
    double average = myCalculator.average(numbers);
    
    System.out.println(average);
    System.out.println(myCalculator.plus(10, 20));
    
    
    CarConstructor myCarConstructor = new CarConstructor("OOP");
    
    System.out.println(myCarConstructor.modelName);
    System.out.println(myCarConstructor.manufacturer);
    System.out.println(myCarConstructor.modelYear);
    
    InstanceThis instanceThis = new InstanceThis("Audi");
    System.out.println(instanceThis.model);
    
    
    
    StaticMember staticExercise = new StaticMember();
    staticExercise.setColor("Blue \t");
    StaticMember staticExercise2 = new StaticMember();
    staticExercise2.setColor("Yellow \t");
    System.out.println(staticExercise.color + staticExercise2.color);
    
    int radius = 5;
    double sizeOfCircle = 0.0;
    sizeOfCircle = StaticMember.pi * StaticMember.times(radius, radius); //static method�� �ٷ� ���
    sizeOfCircle = staticExercise.pi * staticExercise.times(radius, radius); //���ο� ��ü�� �����ؼ� ���
    
    //static member ����
    StaticMember.pi = 3.6;
    System.out.println(StaticMember.pi);
    
    //static member�� ��ü�� �������� �� ����ġ���ϴ� ��Ȳ���� �߻��ϴ� side effect
    staticExercise.pi = 3.1;
    System.out.println(staticExercise.pi);
    System.out.println(staticExercise2.pi);
    
    
    staticExercise2.pi = 3.5;
    System.out.println(staticExercise.pi);  
    System.out.println(staticExercise2.pi);
    
    */
    
    GetterSetter car = new GetterSetter();
    System.out.println(car.getSpeed());
    car.setSpeed(100);
    System.out.println(car.getSpeed());
    car.setSpeed(-200);
    System.out.println(car.getSpeed());
    //System.out.println(car.speed); --> public�� private�� �������� ����
  }
  
  

} //Main.java
