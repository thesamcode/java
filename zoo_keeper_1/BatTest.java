
public class BatTest {
	
    public static void main(String[] args) {
        Bat chompy = new Bat();

        // chompy.startLife();

        chompy.attackTown();
        chompy.attackTown();
        chompy.attackTown();
        chompy.eatHumans();
        chompy.eatHumans();
        chompy.fly();
        chompy.fly();

        System.out.println(chompy.displayEnergy());


    }
}