import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        System.out.printf("Please enter an integer: ");
        Scanner userInput = new Scanner(System.in);
        int input = userInput.nextInt();
        System.out.println("You entered : " + input + " Great job");
    }
}

