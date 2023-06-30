import java.util.ArrayList;
import java.util.Scanner;

public class MoreExpensiveThanThisPrice {
    private static final String PRICE="Enter price";
    private Scanner scanner=new Scanner(System.in);
    private ArrayList<Car> moreExpensive(){
        ArrayList<Car> arrMoreExpensive=new ArrayList<>();
        System.out.println(PRICE);
        double price=scanner.nextDouble();
        ArrayList<Car> cars=AddCars.cars;
        for (Car car: cars) {
            if(car.getPrice()>=price){
                arrMoreExpensive.add(car);
            }
        }
        return arrMoreExpensive;
    }
    public void infoMoreExpensive(){
        ArrayList<Car> cars=moreExpensive();
        for (Car car: cars){
            System.out.println(car.getName() + " " + car.getYearGraduation() + " " + car.getPrice() + " " + car.getColor() + " " + car.getEngineCapacity());
        }
    }
}
