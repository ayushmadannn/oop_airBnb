import java.util.ArrayList;
import java.util.Scanner;

public class Property {
    int id;
    String name;
    String address;
    double price;
    Calender calender= new Calender();


    void takeAvlDates() {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            calender.getDatesAvl().get(sc.nextInt()).avbl = true;
        }
    }

    ArrayList<CalenderAvl> showAvlDates() {
        return calender.getDatesAvl();
    }


    void printProp() {
        System.out.println("Property id: " + id + " Property name " + name + " Address: " + address + " Price: " + price);
    }

    Property(String name, String Address, double price) {
        this.name = name;
        this.address = Address;
        this.price = price;
        MainPage.MainPageFinal.properties.add(this);
        this.id = MainPage.MainPageFinal.properties.size();
    }
}
