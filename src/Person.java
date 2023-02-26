public class Person {
    // rotational for class Phone
    String fullName;
    int age;
    // clear constructor
    public Person(){}
    // constructor
    public Person(String LOP, int age_person){
        fullName = LOP;
        age = age_person;
    }
    // method Talk
    public void talk(String name){
        System.out.println(name + " talking");
    }
    // method Move
    public void move(String name){
        System.out.println(name + " moving");
    }
}
