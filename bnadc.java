import java.util.Scanner;

public class bnadc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Choice from below:\n* 1 for Decimal to Binary\n* 2 for Binary to Decimal\nYour Choice:");
        int stu = 0;

        try {
            stu = sc.nextInt();
        } catch (Exception ex) {
            System.out.println("Input is not a number");
        }

        core caller = new core();

        if (stu == 1) {
            caller.btod();
        } else if (stu == 2) {
            caller.dtob();
        } else {
            System.out.println("Invalid choice..");
        }

    }
}

class core {
    void btod() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any decimal number: ");
        int dcnum = 0;

        try {
            dcnum = scan.nextInt();
        } catch (Exception ex) {
            System.out.println("Input is not a number");
            System.exit(0);
        }

        System.out.println(dcnum + " in binary is " + Integer.toBinaryString(dcnum));
    }

    void dtob() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any binary number: ");
        int num = 0;

        try {
            num = scan.nextInt();
        } catch (Exception ex) {
            System.out.println("Input is not a number");
            System.exit(0);
        }

        int dec_value = 0;
        int base = 1;
        int val = num;

        while (num > 0) {
            int last_digit = num % 10;
            num = num / 10;

            dec_value += last_digit * base;

            base = base * 2;
        }

        System.out.println(val + " in decimal is " + dec_value);
    }
}