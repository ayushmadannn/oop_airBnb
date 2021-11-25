import java.util.ArrayList;
import java.util.Scanner;

public class MainPage {
    static public class MainPageFinal {
        String message;
        static ArrayList<Property> properties = new ArrayList<>();
    }


    public static void main(String[] args) {
        System.out.println("Press 0 for Manager and 1 for Customer");
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                int main = sc.nextInt();
                switch (main) {
                    case 0: {
                        System.out.println("Welcome Manager");
                        Manager m1 = new Manager();
                        System.out.println("Press 1 to make a booking");
                        System.out.println("Press 2 to add a property");
                        Scanner in = new Scanner(System.in);
                        int s8 = in.nextInt();
                        switch (s8) {
                            case 1: {
                                System.out.println("Type the Travel date");
                                Scanner s4 = new Scanner(System.in);
                                int date = s4.nextInt();
                                m1.book(date);
                                break;
                            }
                            case 2: {

                                System.out.println("Type the property name, address and price");
                                Scanner s4 = new Scanner(System.in);
                                System.out.println("Enter name");
                                String name = s4.nextLine();
                                Scanner s5 = new Scanner(System.in);
                                System.out.println("Enter address");
                                String address = s5.nextLine();
                                Scanner s6 = new Scanner(System.in);
                                System.out.println("Enter price");
                                Float price = s6.nextFloat();
                                new Property(name, address, price);
                                System.out.println("Added Successfully");
                                break;
                            }
                            default:
                                System.out.println("Please try again");
                                break;
                        }
                    }
                    case 1: {
                        System.out.println("Welcome Customer");
                        Customer cn = new Customer();
                        System.out.println("Press 1 to make new bookings");
                        Scanner s2 = new Scanner(System.in);
                        int c1 = s2.nextInt();
                        switch (c1) {
                            case 1: {
                                System.out.println("Type your Travel date");
                                Scanner s4 = new Scanner(System.in);
                                int date = s4.nextInt();
                                cn.Search(date);
                                break;
                            }
                            default:
                                System.out.println("Please Try again");
                        }
                    }
                    default:
                        System.out.println("Please try again");
                }
            }
           catch (Exception e){
               System.out.println("Please try again there was an error");
               break;
           }
        }
    }
}