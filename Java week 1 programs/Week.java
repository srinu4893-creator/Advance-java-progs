enum Day {MON,TUE, WED, THU, FRI, SAT, SUN}
public class Week {
    public static void main(String[] args) {
        Day today=Day.WED;
        System.out.println("Today: " + today);
        if (today==Day.SAT || today==Day.SUN){
            System.out.println("Weekend!");
        }
        else{
            System.out.println("working day");
        }
    }
}