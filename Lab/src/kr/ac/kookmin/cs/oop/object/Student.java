package kr.ac.kookmin.cs.oop.object;

public class Student {
  public int count = 0;
  public String name;
  public String address;
  public String[] courses;
  public int[] scores;
  public int numCourses;
  static final int MAX_COURSES = 30;
  
  //Constructor
  public Student(String name, String address) { 
    this.name = name;
    this.address = address;
    this.numCourses = 0;
    this.courses = new String[MAX_COURSES];
    this.scores = new int[MAX_COURSES];    
  }
  public Student(String new_name) {
    //this.name = new_name;
    //this.address = "hidden";
    this(new_name, "hidden");
  }
  
  
  //method  
  public String getName() {
    return name;
  } 
  
  public String getAddress() {
    return address;
  }
  
  public String setAddress(String new_address) {
    this.address = new_address;
    return this.address;
  }
  
  
  //update element
  public void addCourseScore(String course, int score) {
    if(numCourses < MAX_COURSES) {
    this.courses[count] = course;
    this.scores[count] = score;
    count++;
    this.numCourses = count;
    }
  }
  
  //print course and score
  public void printScores() {
    for(int i = 0; i < count; i++) {
      System.out.println(this.courses[i]+": "+ this.scores[i]);
    }
  }
  
  //get average of scores
  public double getAverageScore() {
    double sum = 0;
    for(int a = 0; a < count; a++) {
      sum += this.scores[a];
    }
    
    double average = sum / count;
    return average;
  }
  
  
}
