import javax.crypto.SealedObject;

public class Main {
    public static void main(String[] args) {
        // objects from class Phone
        Phone phone1 = new Phone("89005667555", "Huaiway POCO 32", 228);
        Phone phone2 = new Phone("89057776666", "Xyomi 69s", 300);
        Phone phone3 = new Phone("89005854014", "Nokia 3310", 168);

        System.out.println("Phone: " + phone1.phone + " model: " + phone1.model + " weight: " + phone1.weight);
        System.out.println("Phone: " + phone2.phone + " model: " + phone2.model + " weight: " + phone2.weight);
        System.out.println("Phone: " + phone3.phone + " model: " + phone3.model + " weight: " + phone3.weight);


        // use phone clas methods
        phone1.receiveCall("Artyr");
        System.out.println(phone1.GetNumber());
        phone2.receiveCall("Maxim");
        System.out.println(phone2.GetNumber());
        phone3.receiveCall("Ambala");
        System.out.println(phone3.GetNumber());

        // use double method
        phone1.receiveCall("Artyr", "89005667555");
        phone2.receiveCall("Maxim", "89057776666");
        phone3.receiveCall("Ambala", "89005854014");

        // use SandMassege method
        String[] nums = new String[]{"89005667555", "89057776666", "89005854014"};
        Phone.sendMessage(nums);
        System.out.println(" ");

        // clear object from class Person
        Person noName = new Person();

        // object from class Person
        Person Skyel = new Person("Ivanov Ivan Ivanovich", 13);

        // methods from class Person
        Skyel.move(Skyel.fullName);
        Skyel.talk(Skyel.fullName);
    }
}