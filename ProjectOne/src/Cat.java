/*
 * @filename: Cat.java
 * @author: Nick Cleveland
 *
 */
public class Cat extends Pet {

    private int catSpaceNumber;

    public Cat(){

    }

    public Cat(String petType, String petName, int petAge) {
        super(petType, petName, petAge);
    }

    public void setCatSpaceNumber(int catSpaceNumber) {
        this.catSpaceNumber = catSpaceNumber;
    }

    public int getCatSpaceNumber() {
        return this.catSpaceNumber;
    }
}
