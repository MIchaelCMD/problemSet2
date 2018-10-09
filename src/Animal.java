public class Animal {

    private String type;
    private String[] continent = new String[];
    private double weight;
    private int age;

    public Animal() {
        this("No Type Specified",null,0.0,0);
    }

    public Animal(String type, String[] continent, double weight, int age) {
        Animal.setType(type);
    }
}
