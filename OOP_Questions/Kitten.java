public class Kitten{
    private String name;
    private String owner;
    private int age;

    public Kitten(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.age = 0;
    }

    public int getAge(){
        return age;
    }

    public void haveBirthday(){
        age++;
    }

    public String toString(){
        return name + " is " + age + " and belongs to " + owner;
    }

    public static void main(String[] args){
        Kitten kitten = new Kitten("Talus", "Abdillah");

        System.out.println(kitten.toString());
        kitten.haveBirthday();
        System.out.println(kitten.toString());
        kitten.haveBirthday();
        System.out.println(kitten.toString());
    }
}
