public class Pet {
    private String petType;
    private String petName;
    private int petAge;

    public Pet() {

    }
    public Pet(String petType, String petName, int petAge) {
        this.petType = petType;
        this.petName = petName;
        this.petAge = petAge;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }

    public int getPetAge() {
        return petAge;
    }
}
