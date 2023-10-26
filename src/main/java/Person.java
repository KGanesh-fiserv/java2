public class Person extends Animal{
    private String firstName;
    private String lastName;
    private int ssn;
    //private byte age;
    private static int personCount;
    public Person() {
        setAge((byte) -1);
        ssn = -1;
        //age = -1;
        personCount++;
    }
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        setAge((byte) -1);
        //age = -1;
        ssn = -1;
        personCount++;
    }
    public Person(String firstName, String lastName, byte age, int ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        setAge(age);
        //this.age = age;
        this.ssn= ssn;
        personCount++;
    }
    
    public String speak(){
        if(firstName == null){
           return "I don't have a name."; 
        }
        else if(getAge() == -1){
            //else if(age == -1)
            return "My name is " + firstName + " "+ lastName+".";
        }
        else{
            return "My name is " + firstName + " "+ lastName+" and I am " + getAge()/*age */ + " years old.";
        }
    }


    public static int getPersonCount() {
        return personCount;
    }
    public String toString(){
        if(firstName == null){
           return "N/A"; 
        }
        else if(getAge() == -1){
            //else if(age == -1)
            return firstName + " "+ lastName;
        }
        else{
            return firstName + " "+ lastName + " " + String.valueOf(ssn).substring(5);
        }
    }
}
