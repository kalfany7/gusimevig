public class Student {
    int Snumber;
    String firstName;
    String lastName;

    public Student (int Snumber, String firstName, String lastName) 
    {
        this.Snumber = Snumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getName(){
        return firstName + " " + lastName;
    }

    public int getSnumber()
    {
        return Snumber;
    }

    public void changeName(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

}
