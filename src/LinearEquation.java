public class LinearEquation {
  private int x1, y1, x2, y2; 
  private double slope, yIntercept, distance; // The instance variables

  public LinearEquation (int x1, int y1, int x2, int y2) {
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2; // Constructor
    this.y2 = y2; // "this" specifies that it's referring to the variables in this constructor

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
