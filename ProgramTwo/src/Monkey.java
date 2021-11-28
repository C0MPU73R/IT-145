/*
@filename: Monkey.java
@purpose: IT-145, SNHU
@editor: Nick Cleveland
*/
public class Monkey  extends RescueAnimal{
    public Monkey() {
    // Default constructor
    }
    public Monkey(String name, String species, String gender, String age,
                  String weight, String acquisitionDate, String acquisitionCountry,
                  String trainingStatus, boolean reserved, String inServiceCountry) {

        setName(name); // All methods added to constructor to initialize values
        setAnimalType(species);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);


    }
}
