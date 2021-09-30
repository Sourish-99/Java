import java.util.Scanner;

public class oddeven {
    public static void main(String args[]) {

        Scanner inp = new Scanner(System.in);

        int num = 0;
        System.out.print("Enter an number to check odd or even: ");

        try {

            num = inp.nextInt();

        } catch (Exception ex) {

            System.out.println("Input is not a number");
            System.exit(0);
        }

        inp.close();

        if (num % 2 == 0)
            System.out.println(num + " is an even number");
        else
            System.out.println(num + " is an odd number");

    }
}