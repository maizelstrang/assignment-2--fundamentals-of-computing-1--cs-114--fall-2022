import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {

        int diamondDimension;

        System.out.print("Enter a number:");
        diamondDimension = Scanner.nextInt();

        if (0 < diamondDimension && diamondDimension % 2 != 0)
        {
            for (int row = 1; row <= diamondDimension; row++)
            {
                for (int star = 1; star <= row; )
                System.out.print("*");
            }
        }
    }
}
