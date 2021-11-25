import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    String name;

    void addProperty(Property p) {
        MainPage.MainPageFinal.properties.add(p);
    }

    void modifyProperty(int index, Property p) {
        MainPage.MainPageFinal.properties.set(index, p);
    }

    void book(int date) {
        ArrayList<Property> props = MainPage.MainPageFinal.properties;
        for (int i = 0; i < props.size(); i++) {
            if (props.get(i).calender.getDatesAvl().get(date).avbl) {
                props.get(i).printProp();
            }
        }

        System.out.println("Type the id no of the property to book");
        Scanner s1 = new Scanner(System.in);
        int id = s1.nextInt();
        props.get(id).calender.getDatesAvl().get(date).avbl = true;
        System.out.println("Booked Successfully! Thanks");

    }


}
