import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {

        int diamondDimension;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        diamondDimension = scanner.nextInt();

        if (0 < diamondDimension && diamondDimension % 2 != 0)
        {
            for (int row = 1; row <= diamondDimension; row++)
            {
                for (int star = 1; star <= row; star++)
                System.out.println("*");
            }
        }
    }
}
