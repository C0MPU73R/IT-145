/*
 * @filename: Cat.java
 * @author: Nick Cleveland
 */
public class Cat extends Pet {

    private int catSpaceNumber;

    public Cat(){
    }

    public Cat(String petType, String petName, int petAge, double petWeight, boolean isGroomed, int daysStay, int petSpaceNumber) {
        super(petType, petName, petAge, petWeight, isGroomed, daysStay, petSpaceNumber);
    }


    public void setGroomed(boolean isGroomed) {
        System.out.println("Cats cannot be groomed");
    }

    public boolean getGroomed() {
        return false;
    }

    public void setCatSpaceNumber(int catSpaceNumber) {
        this.catSpaceNumber = catSpaceNumber;
    }

    public int getCatSpaceNumber() {
        return this.catSpaceNumber;
    }
}
