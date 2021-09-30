import java.util.Scanner;

public class apsquare {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);

        int side = 0;
        System.out.print("Enter the side of square to calculate its area and permineter: ");

        try {

            side = inp.nextInt();

        } catch (Exception ex) {

            System.out.println("Input is not a number");
            System.exit(0);
        }

        inp.close();

        int area = side * side;

        int perimeter = side * 4;

        System.out.println("\nArea of Square with side " + side + " is: " + area + "\n\nPerimeter of Square with side " + side + " is: " + perimeter);
    }
}