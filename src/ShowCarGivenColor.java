import java.util.ArrayList;
import java.util.Scanner;

public class ShowCarGivenColor {
    private static final String ENTER_COLOR="Enter color a car";
    private Scanner scanner = new Scanner(System.in);

    private ArrayList<Car> searchColor() {
        System.out.println(ENTER_COLOR);
        ArrayList<Car> searchColor = new ArrayList<>();
        ArrayList<Car> cars = AddCars.cars;
        String color=scanner.nextLine();
        for (Car car : cars) {
            if (color.equals(car.getColor())) {
                searchColor.add(car);
            }
        }
        return searchColor;
    }
    public void infoSearchColor() {
        ArrayList<Car> cars = searchColor();
        for (Car car : cars) {
            System.out.println(car.getName() + " " + car.getYearGraduation() + " " + car.getPrice() + " " + car.getColor() + " " + car.getEngineCapacity());
        }
    }
}