import javax.swing.*;

public class AnimalDriver {
    public static void main(String[] args) {

        //Robot r1 = new Robot("Stevie",10,3.5);

       // Robot[] robotTeam = {r1,r2,r3,..}''


        JOptionPane.showMessageDialog(null,dataInput1() + "\n\n" + dataInput2());
    }

    public static String dataInput1()
    {
        Animal animal1 = new Animal();
        return animal1.toString();


        //animal1.setType(JOptionPane.showInputDialog("Enter the animal type: "));
        //animal1.setContinent(JOptionPane.showInputDialog("Enter any continents this animal is from"));
    }

    public static String dataInput2()
    {
        String[] lionContinents = {"Africa","Asia"};

        Animal animal1 = new Animal("Lion",lionContinents,123,5);
        return animal1.toString();


        //animal1.setType(JOptionPane.showInputDialog("Enter the animal type: "));
        //animal1.setContinent(JOptionPane.showInputDialog("Enter any continents this animal is from"));
    }
}
