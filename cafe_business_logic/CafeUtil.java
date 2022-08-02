import java.util.ArrayList;
import java.util.Arrays;

class CafeUtil {

    public int getStreakGoal(){
        int goal = 0;
        for(int i=1; i<=10; i++){
            goal += i;
        }
        return goal;
    }

    public double getOrderTotal(double[] lineItems){
        double total = 0;
        for(int i=0; i<lineItems.length; i++){
            total += lineItems[i];
        }
        return total;
    }

    public void displayMenu(ArrayList<String> menuItems){
        // System.out.println(menuItems);
        for(int i=0; i<menuItems.size(); i++){
            System.out.println(menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println("There are " + customers.size() + " people in front of you");
        customers.add(userName);
        System.out.print(customers);
    }

}
