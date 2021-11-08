/*
Filename: Cat.java
@author: Nicholas Cleveland
 */

public class Cat
{
    private int catSpaceNumber;
    private String petName;
    private int petAge;
    private int catSpaces; //This will be set in the Pet class.
    private int daysStay;
    private double amountDue;
    private String petType;

    //Note: Since we are not inheriting from Pet yet, we apply the following attributes that are appropriate for a Cat.
    // ex: We do not have a dogSpaces because this is the Cat class.

    public Cat()
    {
        //default constructor.
        //Call this when we want to manually set all of the attributes.
    }
    public Cat(String petType, String petName, int petAge, int daysStaying, int catSpaceNumber)
    {
        this.petType = petType; //This will be moved to the Pet constructor once built
        this.petName = petName;
        this.petAge = petAge;
        this.daysStay = daysStaying;
        this.catSpaceNumber = catSpaceNumber;


        // This will be called when we want to set the attributes to the given arguments.
    }
    public void setPetType(String petType) // This will be moved to the Pet class where Cat will have access to it.
    {
        this.petType = petType;
    }
    public String getPetType() // This will be moved to the Pet class where Cat will have access to it.
    {
        return this.petType;
    }

    public void setPetName(String petName)
    {
        this.petName = petName;
    }

    public String getPetName()
    {
        return this.petName;
    }

    public void setPetAge(int petAge)
    {
        this.petAge = petAge;
    }

    public int getPetAge()
    {
        return this.petAge;
    }

    public void setCatSpaces(int numCatSpaces) //This will be moved to the Pet class.
    {
    this.catSpaces = numCatSpaces;
    }

    public int getCatSpaces() //This will be moved to the Pet class.
    {
        return this.catSpaces;
    }

    public void setDaysStay(int numberOfDays)
    {
        this.daysStay = numberOfDays;
    }

    public int getDaysStay()
    {
        return this.daysStay;
    }

    public void setAmountDue(double rate)
    {
        this.amountDue = this.daysStay * rate; //The amount due is the number of days staying * the given rate
    }

    public double getAmountDue()
    {
        return this.amountDue;
    }

    public void setCatSpaceNumber(int catSpaceNumber)
    {
        this.catSpaceNumber = catSpaceNumber;
    }

    public int getCatSpaceNumber()
    {
        return catSpaceNumber;
    }

    public static void main(String[] args)
    {
    // Main method for creating objects. This will be later moved to an interface class that user interacts with.
    }
}
