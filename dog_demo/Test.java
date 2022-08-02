
public class Test {
    public static void main(String[] args) {
        System.out.println("Hello there");
        // when you create a class, you are creating a custom stat type. Dog is now a data type. "dog1" is an instance. 
        //this line is creating an instance of that class.
        Dog dog1 = new Dog("Vicky", 5, "brindle");
        Dog dog2 = new Dog("Leia", 1, "red and white");

        // dog1.name = "Vicky";
        System.out.println(dog1.getName());
        System.out.println(dog1.getAge());
        System.out.println(dog1.getHairColor());
        System.out.println(dog2.getName());
        System.out.println(dog2.getAge());
        System.out.println(dog2.getHairColor());

        System.out.println();
        System.out.println();

        dog1.setName("Woofy");
        System.out.println(dog1.getName());

        


    }
}