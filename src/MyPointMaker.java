import javax.swing.*;

public class MyPointMaker {
    public static void main(String[] args) {

        MyPoint point1 = new MyPoint();
        point1.setValues(Double.parseDouble(JOptionPane.showInputDialog("Enter the x value: ")),Double.parseDouble(JOptionPane.showInputDialog("Enter the y value: ")));

        JOptionPane.showMessageDialog(null,"Distance from origin: " + point1.distanceFromOrigin(point1.xVal,point1.yVal));

    }
}
