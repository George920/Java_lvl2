
public class PhoneBook{
    private Integer phone;
    private String email;

    public PhoneBook(Integer phone, String email){
        this.phone = phone;
        this.email = email;
    }
    @Override
    public String toString(){
        return String.format("Phone book (%d, %s)", phone, email);
    }
    public Integer getPhone(){
        return this.phone;
    }
    public String getEmail(){
        return this.email;
    }
}
