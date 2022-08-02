
public class Dog {
    // setting to private, only that file has access
    public String name;
    public int age;
    public String hairColor;

    // this is the constructor. Similar to __init__ (self) in python
    public Dog() {
        this.name = "Default";
        this.age = 5;
        this.hairColor = "brown";
    }

    public Dog(String name) {
        this.name = name;
        this.age = 5;
        this.hairColor = "brown";
    }

    public Dog(String name, int age, String hairColor) {
        this.name = name;
        this.age = age;
        this.hairColor = hairColor;

    }

    //methods

    // this is like @classmethod in python. in java this is using static.
    public void bark() {
        System.out.println("Bark bark my name is " + this.name);
    }

    // getters setters
    public String getName() {
        return this.name;

    }

    public void setName(String name) {
        this.name = name;

    }

    public int getAge() {
        return age;

    }

    public void setAge(int age) {
        // this.age = age;
        if (this.age < age){
            this.age = age;
        }
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor){
        this.hairColor = hairColor;
    }

}