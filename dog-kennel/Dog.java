/**
 * Represents a Dog with a name and weight.
 * Can convert weight from pounds to kilograms.
 */
public class Dog {
    private String name;
    private double weight;

    // default constructor
    public Dog() {
        name = "dog";
        weight = 0.0;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // converts pounds to kg
    public double toKgs() {
        return 0.453592 * weight;
    }

    public String toString() {
        return "The dog's name is " + name + " and its weight in pounds is " + weight;
    }
}
