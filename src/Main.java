import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        while(true) {
            System.out.println("Выберите пункт меню");
            System.out.println("1 - Каталог");
            System.out.println("2 - Корзина");
            System.out.println("3 - Выход");
            Scanner scanner = new Scanner(System.in);
            int userInput = scanner.nextInt();
            if(userInput==3){
                break;
            } else {
            Action action = new Action();
            action.makeChoice(userInput);
            Thread.sleep(500);
            }
        }
    }
}
