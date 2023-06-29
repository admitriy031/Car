import java.util.ArrayList;
import java.util.Scanner;

public class GivenYearRange {
    private static final String GIVEN_YEAR="Please, enter years of release";
    private static final String FROM="From: ";
    private static final String TO="To: ";
    private Scanner scanner=new Scanner(System.in);
    public void yearRange(){
        System.out.println(GIVEN_YEAR);
        System.out.print(FROM);
        int yearFirst=scanner.nextInt();
        System.out.print(TO);
        int yearLast=scanner.nextInt();
        ArrayList<Car> cars=new InfoCars().addCarsToArrayList();
        for (Car car:cars) {
            if(car.getYearGraduation()>=yearFirst && car.getYearGraduation()<=yearLast){
                new InfoCars().carInfo();
            }
        }
    }
}
