/*
 * @filename: Pet.java
 * @author: Nick Cleveland
 */
public class Pet {

    private String petType;
    private String petName;
    private int petAge;
    private int dogSpaces;
    private int catSpaces;
    private int daysStay;
    private double amountDue;

    public Pet() {

    }

    public Pet(String petType, String petName, int petAge, int daysStay) {
        this.petType = petType;
        this.petName = petName;
        this.petAge = petAge;
        this.daysStay = daysStay;
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

    public void setDogSpaces(int dogSpaces) {
        this.dogSpaces = dogSpaces;
    }
    public int getDogSpaces()
    {
        return this.dogSpaces;
    }

    public void setCatSpaces(int catSpaces) {
        this.catSpaces = catSpaces;
    }

    public int getCatSpaces() {
        return this.catSpaces;
    }

    public void setDaysStay(int daysStay) {
        this.daysStay = daysStay;
    }

    public int getDaysStay() {
        return this.daysStay;
    }

    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }

    public double getAmountDue() {
        return this.amountDue;
    }
}
