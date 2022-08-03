
public class Gorilla extends Mammal{

    public void throwSomething(){
        System.out.println("Haha I'm going to hit you with this banana!");
        energyLevel -= 5;
    }

    public void eatBananas(){
        System.out.println("Bananas are YUMMY!");
        energyLevel += 10;
    }

    public void climb(){
        System.out.println("Climbing in tough!");
        energyLevel -= 10;
    }

    }