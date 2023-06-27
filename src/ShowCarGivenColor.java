import java.util.ArrayList;
import java.util.Scanner;

public class ShowCarGivenColor {
    private static final int BLACK=1;
    private static final int WHITE=2;
    private static final int RED=3;
    private static final String INFO_CAR_COLOR="""
        1.Black
        2.White
        3.Red
        """;
    private static boolean isMenu=true;
    private Scanner scanner=new Scanner(System.in);
    public void menuCarGivenColor(){
        System.out.println(INFO_CAR_COLOR);
        int itemMenu=scanner.nextInt();
        while (isMenu){
            switch (itemMenu){
                case BLACK -> searchColorBlack();
                case WHITE -> searchColorBlack();
                case RED -> searchColorBlack();
            }
            isMenu=false;
        }
    }
    private void searchColorBlack(){
        ArrayList<Car> cars=new InfoCars().addCarsToArrayList();
        for (Car car:cars) {
            if("black".equals(car.getColor())){
                new InfoCars().carInfo();
            }
            if("white".equals(car.getColor())){
                new InfoCars().carInfo();
            }
            if("red".equals(car.getColor())){
                new InfoCars().carInfo();
            }
        }
    }
}
