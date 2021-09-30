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

        checker caller = new checker();

        String answer = caller.primeornot(num);

        System.out.println(answer);

    }

}

class checker {
    String primeornot(int n) {

        String checked;
        int i = 0;

        for (i = 2; i <= n; i++) {
            if (n % i == 0) {
                break;
            }
        }

        if (i == n) {
            checked = n + " is a Prime Number";
        } else {
            checked = n + " is not a Prime Number";
        }

        return checked;
    }
}