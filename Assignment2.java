import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {

        int diamondDimension;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        diamondDimension = scanner.nextInt();

        // Odd diamond
        if (diamondDimension % 2 == 1)
            for (int row = 1; row <= diamondDimension; row++){
                for (int spaces = diamondDimension; spaces > row; spaces--){
                    System.out.print(" ");
                }
                for (int starEnd = 0; starEnd < row; starEnd++){
                    System.out.print("*");
                    for (int star = 1; star <= row; star ++){
                        System.out.print("*");
                    }
                }

                System.out.println();
            }
            for (int row = 1; row <= diamondDimension - 1; row ++){
                for (int spacesBottom = diamondDimension; spacesBottom < row; spacesBottom++){
                    System.out.println(" ");
                }
                for (int star = 0; star > row; star--){
                    System.out.print("*");
                }
            }
    }
}
