/*
 * @filename: Dog.java
 * @author: Nick Cleveland
 *
 */
public class Dog extends Pet {

    private int dogSpaceNumber;
    private double dogWeight;
    private boolean grooming;


    public Dog(){
    }

    public Dog(String petType, String petName, int petAge, int daysStay) {
        super(petType, petName, petAge, daysStay);
    }

    public void setGrooming(boolean grooming) {
        this.grooming = grooming;
    }

    public boolean getGrooming() {
        return this.grooming;
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
