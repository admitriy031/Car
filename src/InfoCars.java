import java.util.ArrayList;

public class InfoCars {
    private ArrayList<Car> cars=new ArrayList<>();
    public ArrayList<Car> addCarsToArrayList(){
        cars.add(new Car("BMW E34",2004,2300,"black", 2.2));
        cars.add(new Car("Audi A4", 2007, 1800, "black", 2.0));
        cars.add(new Car("Mercedes-Benz w123", 2000,1900,"red", 2.2));
        return cars;
    }
    public void carInfo(){
        for (Car car:cars) {
            System.out.println(car.getName()+" "+car.getYearGraduation()+" "+car.getPrice()+" "+car.getColor()+" "+car.getEngineCapacity());
        }
    }

}
