import java.util.ArrayList;

public class Calender {
    private ArrayList<CalenderAvl> datesAvl = new ArrayList<>();

    public ArrayList<CalenderAvl> getDatesAvl() {
        return datesAvl;
    }

    Calender(){
        for (int i=1; i<32; i++){
         datesAvl.add(new CalenderAvl(i));
        }
    }

}
class CalenderAvl{
    int date;
    boolean avbl=true;
    CalenderAvl(int date){
        this.date=date;
    }
}