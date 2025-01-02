public class PersonAddress{
    private String FirstName;
    private String LastName;
    private String Email;
    private String TelephoneNo;

    public PersonAddress(String fn,String ln,String em,String tel){
        FirstName =fn;
        LastName =ln;
        Email = em;
        TelephoneNo = tel;
    }

    public boolean isEqual(PersonAddress person){
        return FirstName.equals(person.FirstName) && LastName.equals(person.LastName) 
        && Email.equals(person.Email) && TelephoneNo.equals(person.TelephoneNo);
    }

    public static void main(String[] args){
        PersonAddress person1 = new PersonAddress("abdillah","rashid","abdi@gmail.com","0773279297");
        PersonAddress person2 = new PersonAddress("abdillah","rashid","abdi@gmail.com","0773279297");

        if(person1.isEqual(person2)){
            System.out.println("name one and two are equal");
        }else{
            System.out.println("name of first person is not equal to that of second person");
        }
    }    
}
