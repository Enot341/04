public class Person {
    private String enotName;
    private int Age;
    Person(int age, String name) {
        Age = age;
        enotName = name;    }
    Person() {
        enotName = "enot co";
        Age = 0;
    }
    public void PersonTalk(){
        System.out.println("Такой то " + enotName + " говорит");
    }
    public void PersonMove(){
        System.out.println("я устал,s хочу спать" );
    }

}

