package murach.rectangle;

public class Rectangle {
  private double length;
  private double width;
  
  public Rectangle() {
    this(0.0, 0.0);
  }
  
  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }
  
  public void setLength(double length) {
    this.length = length;
  }
  public void setWidth(double width) {
    this.width = width;
  }
  
  public void setValue(double length, double width) {
    this.length = length;
    this.width = width;
  }
  
  public double getArea() {
    double area = width * length;
    return area;
  }
  
  public double getPerimeter() {
    double perimeter = 2 * width + 2 * length;
    return perimeter;
  }

}
