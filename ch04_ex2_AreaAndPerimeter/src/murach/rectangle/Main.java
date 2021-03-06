package murach.rectangle;

//import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        System.out.println("Welcome to the Area and Perimeter Calculator");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {

            
            // get input from user
            System.out.print("Enter length and width: ");
            double length = Double.parseDouble(sc.nextLine());
            double width = Double.parseDouble(sc.nextLine());
          
           // Rectangle rectangle = new Rectangle(sc.nextDouble(), sc.nextDouble());
            Rectangle rectangle = new Rectangle(length, width);
       
            // display output
            String message = 
                "Area:         " + rectangle.getArea() + "\n" +
                "Perimeter:    " + rectangle.getPerimeter() + "\n";
            System.out.println(message);

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
        sc.close();
        System.out.println("Bye!");
    }
}