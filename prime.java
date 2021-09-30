import java.util.Scanner;

public class prime {
    public static void main(String args[]) {

        Scanner inp = new Scanner(System.in);

        int num = 0;
        System.out.print("Enter an number to check its prime or not: ");

        try {

            num = inp.nextInt();

        } catch (Exception ex) {

            System.out.println("Input is not a number");
            System.exit(0);
        }

        inp.close();

        int i = 0;

        for (i = 2; i <= num; i++) {
            if (num % i == 0) {
                break;
            }
        }

        if (i == num) {
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is not a Prime Number");
        }

    }

}