import java.util.Scanner;


public class EquationRunner {
    public static void main(String[] args) {
        Scanner input = new
        Scanner(System.in);

        System.out.print("Enter your first coordinate point: ");
        String point1 = input.nextLine();
        int x1 = Integer.parseInt(point1.substring(1, point1.indexOf(",")));
        int y1 = Integer.parseInt(point1.substring(point1.indexOf(",") + 1, point1.indexOf(")"))); // Gets first point

        System.out.print("Enter your second coordinate point: "):
        String point2 = input.nextLine();
        int x2 = Integer.parseInt(point2.substring(1, point2.indexOf(",")));
        int y2 = Integer.parseInt(point2.substring(point2.indexOf(",") + 1, point2.indexOf(")"))); // Gets second point

        LinearEquation equation = new LinearEquation(x1, y1, x2, y2); // Creates a new object for LinearEquation

        System.out.println(equation); // Prints all the details

        System.out.print("Enter a third x-value: ");
        double xValue = input.nextDouble();
        System.out.println("Solved coordinate point is: " + equation.coordinateForX(xValue)); // Calculates coordinate using user inputted x value
        
    }
}
