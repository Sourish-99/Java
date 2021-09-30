import java.util.Scanner;

public class apsquare {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);

        int num = 0;
        System.out.print("Enter the side of square to calculate its area and permineter: ");

        try {

            num = inp.nextInt();

        } catch (Exception ex) {

            System.out.println("Input is not a number");
            System.exit(0);
        }

        inp.close();

        approcess caller = new approcess();

        int[] data = caller.analyze(num);

        int area = data[0];

        int perimeter = data[1];

        System.out.println("\nArea of Square with side " + num + " is: " + area + "\n\nPerimeter of Square with side " + num + " is: " + perimeter);
    }
}

class approcess {
    int[] analyze(int side) {

        int area = side * side;

        int perimeter = side * 4;

        return new int[] { area, perimeter };
    }
}