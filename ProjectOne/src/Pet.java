/*
 * @filename: Pet.java
 * @author: Nick Cleveland
 */
public class Pet {

    private String petType;
    private String petName;
    private int petAge;
    private double petWeight;
    private int petSpaceNumber;
    private boolean isGroomed;
    private int daysStay;
    private double amountDue;

    public Pet() {
    }

    public Pet(String petType, String petName, int petAge, double petWeight, boolean isGroomed, int daysStay, int petSpaceNumber) {
        this.petType = petType;
        this.petName = petName;
        this.petAge = petAge;
        this.petWeight = petWeight;
        this.isGroomed = isGroomed;
        this.daysStay = daysStay;
        this.petSpaceNumber = petSpaceNumber;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public String getPetType() {
        return this.petType;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetName() {
        return this.petName;
    }

    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }

    public int getPetAge() {
        return this.petAge;
    }

    public void setPetWeight(double petWeight) {
        this.petWeight = petWeight;
    }

    public double getPetWeight() {
        return petWeight;
    }

    public void setPetSpaceNumber(int petSpaceNumber) {
        this.petSpaceNumber = petSpaceNumber;
    }

    public int getPetSpaceNumber() {
        return this.petSpaceNumber;
    }

    public void setDaysStaying(int daysStay) {
        this.daysStay = daysStay;
    }

    public int getDaysStaying() {
        return this.daysStay;
    }

    public void updateAmountDue(double amountDue) {
        this.amountDue += amountDue;
    }

    public double getAmountDue() {
        return this.amountDue;
    }
}
