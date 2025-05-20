package CodingAssignment;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();

        int n = a;
        if (a % 2 == 0) {
            n = a - 1;
        }

        for (int i = 1; i <= n; i += 2) {
            System.out.print(i);
            if (i < n - 1 || (a % 2 != 0 && i < n)) {
                System.out.print(", ");
            }
        }
    }
}
