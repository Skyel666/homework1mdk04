public class Phone {
    // rotational for class Phone
    String phone;
    String model;
    int weight;
    // clear method
    public Phone(){}
    // constructor
    public Phone(String phoneNum, String modelNum, int pWeight){
        this(phoneNum, modelNum);
        weight = pWeight;
    }
    // constructor
    public Phone(String phoneNum, String modelNum){
        phone = phoneNum;
        model = modelNum;
    }
    // method GetNumber
    public String GetNumber(){
        return phone;
    }
    // method receiveCall
    public void receiveCall(String name){
        System.out.println("Calling: " + name);
    }
    // method sendMessage
    public static void sendMessage(String[] numbers){
        System.out.println("You send the message to: ");
        for (String number : numbers) {
            System.out.print(number + " ");
        }
    }
    // double method receiveCall
    public void receiveCall(String name, String phoneNumber){
        System.out.println("Calling: " + name + "; Number: " + phoneNumber);
    }
}
