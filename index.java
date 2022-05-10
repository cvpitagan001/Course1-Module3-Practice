import java.util.Scanner;

/**
 * index
 */
public class index {

    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = get.nextLine();

        System.out.println("Your name has " + name.length() + " letters including spaces.");
        System.out.println("The first letter is " + name.substring(0, 1));
    }
}