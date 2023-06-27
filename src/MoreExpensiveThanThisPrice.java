import java.util.ArrayList;
import java.util.Scanner;

public class MoreExpensiveThanThisPrice {
    private static final String PRICE="Enter price";
    private Scanner scanner=new Scanner(System.in);
    public void moreExpensive(){
        System.out.println(PRICE);
        int price=scanner.nextInt();
        ArrayList<Car> cars=new InfoCars().addCarsToArrayList();
        for (Car car: cars) {
            if(car.getPrice()>price){
                new InfoCars().carInfo();
            }
        }
    }
}
