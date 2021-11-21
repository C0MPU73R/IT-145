/*
 * @filename: Dog.java
 * @author: Nick Cleveland
 */
public class Dog extends Pet {

    private int dogSpaceNumber;
    private double dogWeight;
    private boolean groomed;


    public Dog() {
    }

    public Dog(String petType, String petName, int petAge, double petWeight, boolean isGroomed, int daysStay, int petSpaceNumber) {
        super(petType, petName, petAge, petWeight, isGroomed, daysStay, petSpaceNumber);
    }

    public void setGroomed(boolean isGroomed) {
        this.groomed = isGroomed;
    }

    public boolean getGroomed() {
        return this.groomed;
    }

    public void setDogWeight(double dogWeight) {
        this.dogWeight = dogWeight;
    }

    public double getDogWeight() {
        return dogWeight;
    }

    public void setDogSpaceNumber(int dogSpaceNumber) {
        this.dogSpaceNumber = dogSpaceNumber;
    }

    public int getDogSpaceNumber() {
        return this.dogSpaceNumber;
    }

}
