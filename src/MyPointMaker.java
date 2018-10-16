import javax.swing.*;

public class MyPointMaker {
    public static void main(String[] args) {

        MyPoint point1 = new MyPoint();

        point1.setValues(Double.parseDouble(JOptionPane.showInputDialog("Enter the x value: ")),Double.parseDouble(JOptionPane.showInputDialog("Enter the y value: ")));

        point1.moveHorizontally(Double.parseDouble(JOptionPane.showInputDialog("Enter the value you want to move along the x axis: ")));
        point1.moveVertically(Double.parseDouble(JOptionPane.showInputDialog("Enter the value you want to move along the y axis: ")));

        JOptionPane.showMessageDialog(null,"Distance from origin: " + point1.distanceFromOrigin(point1.xVal,point1.yVal) + "\nThe x value was moved to: " + point1.xVal + "\nThe y value was moved to: " + point1.yVal);

    }
}
