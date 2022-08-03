
class Bat extends Mammal{

    public Bat (){
        this.energyLevel = 300;
    }

    public void fly(){
        System.out.println("Whoosh, whoooosh");
        this.energyLevel -= 50;
    }

    public void eatHumans(){
        System.out.println("CHOMP CHOMP");
        this.energyLevel += 25;
    }

    public void attackTown(){
        System.out.println("Crash! Crackle!");
        this.energyLevel -= 100;
    }

    }