package homework_last;

public class Animal {
   public String name;
   public String type;
   public int age;
   
   //Constructor ����
   public Animal(){
       this.name = "unknown";
       this.type = "unknown";
       this.age = 0;
   }
   
   public Animal(String name, String type, int age){
       this.name = name;
       this.type = type;
       this.age = age;
   }
   
   //toString method ����
   public String toString(){
       String sen = "���� " + this.type + "�Դϴ�. �� �̸��� " + this.name + "�Դϴ�. �� ���̴� " + String.valueOf(age) +"�� �Դϴ�.";   
       return sen;
   }
   
}

