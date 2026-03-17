/*
//#1
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
//№2
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



//№3
import java.util.Scanner;

class Main {
    public static String PrimeCheck(int num, int a) {
        if (num <= 1) {
            return "Composite";
        }
        if (num == a) {
            return "Prime";
        }
        if (num % a == 0) {
            return "Composite";
        }
        else {
            return PrimeCheck(num,a+1);
        }

    }
    public static void main(String[] args) {
        System.out.println("Input number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(PrimeCheck(num, 2));

    }
}
*/

//№4
import java.util.Scanner;

class Main {
    public static int factorial(int num) {
        if (num == 1) {
            return num;
        }
        else {
            return num*factorial((num-1));
        }
    }
    public static void main(String[] args) {
        System.out.println("Input number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(factorial(num));

    }
}







