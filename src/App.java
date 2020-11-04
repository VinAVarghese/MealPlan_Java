import java.util.Date;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String message = "Let's make our meal plan!";
        System.out.println(message);
        Date now = new Date();
        System.out.println(now);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name A Meal You Like: ");
        String meal = scanner.nextLine();
        System.out.println("This is your first meal: " + meal);
    }
}
