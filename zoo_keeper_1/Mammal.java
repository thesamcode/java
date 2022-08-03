

class Mammal {

    public int energyLevel = 100;

    public Mammal (){
        // this.energyLevel = 100;
    }

    public int displayEnergy(){
        System.out.println("My energy level is: " + energyLevel);
        return energyLevel;
    }

}