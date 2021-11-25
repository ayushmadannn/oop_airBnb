import java.util.ArrayList;
import java.util.Scanner;

public class Customer {
    String name;
    String username;
    String password;
    private double balance;
    double showBalance(){
        return balance;
    }


    void Search(int date){
        ArrayList<Property> props = MainPage.MainPageFinal.properties;
        for(int i= 0; i < props.size();i++){
            if(props.get(i).calender.getDatesAvl().get(date-1).avbl){
             props.get(i).printProp();
            }
        }

        System.out.println("Type the id no of the property to book");
        Scanner s1 = new Scanner(System.in);
        int id = s1.nextInt();
        props.get(id-1).calender.getDatesAvl().get(date-1).avbl=false;
        System.out.println("Booked Successfully! Thanks");




    }





}
