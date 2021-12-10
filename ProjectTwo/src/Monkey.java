/*
@filename: Monkey.java
@purpose: IT-145, SNHU
@editor: Nick Cleveland
*/
public class Monkey  extends RescueAnimal{
    private String tailLength;
    private String height;
    private String bodyLength;

    public Monkey() {
        // Default constructor
    }
    public Monkey(String name, String species, String gender, String age,
                  String weight, String tailLength, String height, String bodyLength, String acquisitionDate, String acquisitionCountry,
                  String trainingStatus, boolean reserved, String inServiceCountry) {

        setName(name); // All methods added to constructor to initialize values
        setAnimalType(species);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setTailLength(tailLength);
        setHeight(height);
        setBodyLength(bodyLength);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);


    }
    //These methods, attribs are specific to the Monkey only

    public String getTailLength() {
        return this.tailLength;
    }


    public void setTailLength(String length) {
        this.tailLength = length;
    }

    public String getHeight() {
        return this.height;
    }


    public void setHeight(String height) {
        this.height = height;
    }

    public String getBodyLength() {
        return this.bodyLength;
    }


    public void setBodyLength(String bodyLength) {
        this.bodyLength = bodyLength;
    }

}
