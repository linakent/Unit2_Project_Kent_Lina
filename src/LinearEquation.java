public class LinearEquation {
  private int x1, y1, x2, y2; 
  private double slope, yIntercept, distance; // The instance variables

  public LinearEquation (int x1, int y1, int x2, int y2) {
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2; // Constructor
    this.y2 = y2; // "this" specifies that it's referring to the variables in this specific constructor

    calculateSlope();
    calculateYIntercept();
    calculateDistance(); // Calculates the slope, y-intercept, and distance
}
  private void calculateSlope(){
    slope = (double)(y2 - y1) / (x2 - x1); // Calculates slope based on the math formula
  }
  private void calculateYIntercept(){
    yIntercept = y1 - slope * x1; // Calculates Y-Inrercept based on the math formula
  }
  private void calculateDistance(){
    distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)); // Calculates distance based on the math formula
  }
public String coordinateForX (double xValue){
  double yValue = slope * xValue + yIntercept;
  return String.format("(%.1f, %.1f)", xValue, yValue); // Calculates the y value for a given x value, formatted with one digit after the decimal point
}
  public String getEquation(){
    String slopeStr = formatSlope();
    String yInterceptStr = formatYIntercept();
    return "y = " + slopeStr + "x" + yInterceptStr; // Returns the equation in y = mx + b form
  }

private String formatSlope(){
  int numerator = y2 - y1;
  int denominator = x2 - x1;
  if (numerator == denominator) return "1";
  if (numerator == -denominator) return "-1"
  return numerator + "/" + denominator; // Formats the slope as a fraction
}
  private String formatYIntercept(){
    if (yIntercept == 0) return "";
    return (yIntercept > 0 ? "+ " : "-") + String.format("%.1f", Math.abs(yIntercept)); // Formats the y-intercept using shorthands for an if-else statement and with one digit after the decimal point
  } 

public double getDistance(){
  return distance; // Returns the distance between two points
}
  public String printAll(){
    return "First pair: (" + x1 + ", " + y1 + ")\n" + Second Pair: (" + x2 + ", " + y2 + ")\n" +
     "Slope of line: " + String.format("%.1f", slope) + "\n" + "Y-intercept: " + String.format("%.1f", yIntercept) + "\n" +
      "Slope intercept form: " + getEquation() + "\n" + "Distance between points: " + String.format("%.2f", distance); 
    // Prints all the information on seperate lines with the values having one digit after the decimal point except for the distance, which has two
  }
}
      
