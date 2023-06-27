import java.util.Scanner;

public class Menu {
    private static final int EXIT=0;
    private static final int SHOW_ALL_CAR=1;
    private static final int SHOW_CAR_GIVEN_COLOR=2;
    private static final int MORE_EXPENSIVE_THAN_THIS_PRICE=3;
    private static final int GIVEN_YEAR_RANGE=4;
    private static final int SORT_DOWN_PRICE=5;
    private static final String INFO_MENU= """
            1.Shaw all car
            2.Shaw car of a given color
            3.Shaw cars more expensive than the specified price
            4.Shaw cars whose year of manufacture is in the given function
            5.sort cars in descending order of value
            0.Exit
            """;
    private static boolean isRunning=true;
    Scanner scanner=new Scanner(System.in);
    public void startProgram(){
        while (isRunning) {
            System.out.println(INFO_MENU);
            int itemMenu=scanner.nextInt();
            switch (itemMenu){
                case EXIT -> exit();
                case SHOW_ALL_CAR -> new InfoCars().carInfo();
                case SHOW_CAR_GIVEN_COLOR -> new ShowCarGivenColor().menuCarGivenColor();
            }
        }
    }
    private void exit(){
        isRunning=false;
    }
}
