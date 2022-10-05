import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {

        int diamondDimension, spaces, row, star;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        diamondDimension = scanner.nextInt();

        // Odd diamond
        if (diamondDimension % 2 == 1){
            for (row = 1; row <= diamondDimension / 2 + 1; row++)
            {
                for (spaces = diamondDimension; spaces > row; spaces--){
                    System.out.print(" ");
                }
                for (star = 0; star < row * 2 - 1; star++){
                    System.out.print("*");
                }
            System.out.println();
            }

            // for (row = diamondDimension % 2;)

            /*for (int row = 1; row <= diamondDimension - 1; row ++){
                for (int spaces = diamondDimension; spaces < row; spaces++){
                    System.out.println(" ");
                }
                for (int star = 0; star > row; star--){
                    System.out.print("*");
                }*/
            }

        else {
            for (row = 1; row <= diamondDimension / 2; row++)
            {
                for (spaces = diamondDimension; spaces > row; spaces--){
                    System.out.print(" ");
                }
                for (star = 0; star < row * 2 - 1; star++){
                    System.out.print("* ");
                }
            System.out.println();
            }
        }
        }
    }
