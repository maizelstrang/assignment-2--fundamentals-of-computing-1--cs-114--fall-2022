import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {

        int diamondDimension;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        diamondDimension = scanner.nextInt();

        for (int row = 1; row <= diamondDimension; row++){
            for (int space = diamondDimension; space > row; space--){
                System.out.print(" ");
            }
            for (int star = 0; star < row * 2 - 1; star++){
                System.out.print("*");
            }
            System.out.println();
        }





        /*for (int row = 1; row <= diamondDimension; row++)
        {
            for (int star = 1; star <= row; star += 2)
                System.out.println(" " + "*");
        }
        */
        }
    }
