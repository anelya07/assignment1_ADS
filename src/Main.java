/* #1
class Main {
    public static int printDigit(int n) {
        if (n < 10) {
            System.out.println(n);
            return n;
        }
        else {
            int a = printDigit(n / 10);
            int b = printDigit(n % 10);
            return a * 10 + b;
        }

    }
    public static void main(String[] args) {
        printDigit(5481);
    }
}
*/

import java.util.Scanner;

class Main {
    public static int summa(int n, int arr[]) {
        if (n == arr.length) {
            return 0;
        }
        else {
            return arr[n] + summa(n+1, arr);
        }

    }
    public static void main(String[] args) {
        double num = 4;
        int array[] = {3,2,4,1};
        System.out.println(summa(0, array)/num);

    }
}
