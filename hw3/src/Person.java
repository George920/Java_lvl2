

public class Person {
    private String surname;

    public Person (String surname){
        this.surname = surname;
    }
    @Override
    public String toString(){
        return String.format("Person %s", this.surname);
    }
    public String getSurname(){
        return this.surname;
    }

}
