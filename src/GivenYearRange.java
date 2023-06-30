import java.util.ArrayList;
import java.util.Scanner;

public class GivenYearRange {
    private static final String GIVEN_YEAR="Please, enter years of release";
    private static final String FROM="From: ";
    private static final String TO="To: ";
    private Scanner scanner=new Scanner(System.in);
    public ArrayList<Car> yearRange(){
        ArrayList<Car> yearRange=new ArrayList<>();
        ArrayList<Car> cars=AddCars.cars;
        System.out.println(GIVEN_YEAR);
        System.out.print(FROM);
        int yearFirst=scanner.nextInt();
        System.out.print(TO);
        int yearLast=scanner.nextInt();
        for (Car car:cars) {
            if(car.getYearGraduation()>=yearFirst && car.getYearGraduation()<=yearLast){
                yearRange.add(car);
            }
        }
        return yearRange;
    }
    public void infoYearRange() {
        ArrayList<Car> cars = yearRange();
        for (Car car : cars) {
            System.out.println(car.getName() + " " + car.getYearGraduation() + " " + car.getPrice() + " " + car.getColor() + " " + car.getEngineCapacity());
        }
    }
}
