public class Main {

    public static void main(String[] args) {
        Phone Iphone = new Phone(
                "+89045974534", "Iphone", 666);
        Phone Redmi = new Phone(
                "+89076781234", "Redmi", 4515);
        Phone POCO = new Phone(
                "+89045678715","POCO", 6781);
        System.out.println(Iphone.getNumber());
        System.out.println(Iphone.getModel());
        System.out.println(Iphone.getWeight());
        System.out.println();

        System.out.println(Redmi.getNumber());
        System.out.println(Redmi.getModel());
        System.out.println(Redmi.getWeight());
        System.out.println();

        System.out.println(POCO.getNumber());
        System.out.println(POCO.getModel());
        System.out.println(POCO.getWeight());
        System.out.println();

        Iphone.receiveCall("Pudge");
        Redmi.receiveCall("Enot");
        POCO.receiveCall("Gordon freeman");

        Iphone.receiveCall("Pudge","+89045974534" );
        Redmi.receiveCall("Enot","+89076781234");
        Redmi.receiveCall("Gordon freeman","+89045678715");

        Iphone.sendMessage("TextTextText","85643761234", "+78521213411");
        Redmi.sendMessage("JustText","+7894582745");
        POCO.sendMessage("ManText","89032456711");



        Person person1 = new Person();
        Person person2 = new Person(15,"Enot");
        Person person3 = new Person();

        person1.PersonMove();
        person2.PersonMove();
        person3.PersonMove();

        person1.PersonTalk();
        person2.PersonTalk();
        person3.PersonTalk();
    }
}