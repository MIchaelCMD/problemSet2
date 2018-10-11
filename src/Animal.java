public class Animal {

    private String type;
    private String[] continent;
    private double weight;
    private int age;

    public Animal() {
        this("No Type Specified",null,0.0,0);
    }

    public Animal(String type, String[] continent, double weight, int age) {
        this.age = age;
        this.continent = continent;
        this.type = type;
        this.weight = weight;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setContinent(String[] continent) {
        this.continent = continent;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public String[] getContinent() {
        return continent;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        String conts = "";

        if(continent==null)
            conts = "No continents specified";
        else
        {
            for(int i=0;i<continent.length;i++)
            {
                conts += continent[i] + ", ";
            }
        }

        return "Type: " + this.type + "\nContinent: " + conts + "\nWeight: " + this.weight + "\nAge: " + this.age;
    }

}
