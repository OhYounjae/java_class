package kr.ac.kookmin.cs.oop.object;

public class InstanceThis {
  String model;
  int speed;
  
  InstanceThis(String model){
    this.model = model;
    this.speed = 0;
  }
  
  //���ǵ� �Լ�  
  void setSpeed(int speed) {
    this.speed = speed;
  }
  
  InstanceThis(){
//    this.model = "MyModel";
//    this.speed = 0;
    this("myModel");
  }
}
