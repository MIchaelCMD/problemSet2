public class MyPoint {

   double xVal, yVal;

    public MyPoint() {
        this.xVal = 0.0;
        this.yVal = 0.0;
    }

    public void setValues(double xVal, double yVal) {
        this.xVal = xVal;
        this.yVal = yVal;
    }

    public void double distanceFromOrigin(double a, double b) {

        double c;

        c = Math.sqrt((a*a) + (b*b));

        return c;

    }

    public String toString() {
        return "The x value is: " + this.xVal + "\nThe y value is: " + this.yVal;
    }
}
