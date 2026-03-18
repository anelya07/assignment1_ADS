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

//№5
import java.util.Scanner;

class Main {
    public static int fibonacci (int num, int count) {
        if (num == 1) {
            return 1;
        }
        if (num == 0) {
            return 0;
        }
        else {
            return fibonacci(num - 1, count)+fibonacci(num - 2, count);
        }
    }
    public static void main(String[] args) {
        System.out.println("Input number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(fibonacci(num,0));

    }
}


//№6
import java.util.Scanner;

class Main {
    public static int power(int a, int n) {
        if (a == 1) {
            return 1;
        }
        if (n == 1) {
            return a;
        }
        if (n == 0) {
            return 0;
        }
        if (a == 0) {
            return 0;
        }
        else {
            return a*power(a, n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println("Input number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Input power of " + num + ": ");
        int pow = sc.nextInt();
        System.out.println(power(num,pow));

    }
}

//№7
import java.util.Scanner;

class Main {
    public static void reverse(int arr[], int i) {
        if (i == arr.length/2) {
            return;
        }
        else {
            int j = arr.length - i - 1;
            int  temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            reverse(arr, i + 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        reverse(arr, 0);
        System.out.println("\nReversed array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}

//№8
import java.util.Scanner;

class Main {
    public static String digitCheck(String str, int index) {
        if (index == str.length()) {
            return "Yes";
        }
        if (Character.isDigit(str.charAt(index))==false) {
            return "No";
        }
        else {
            return digitCheck(str, index + 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text: ");
        String str = sc.nextLine();
        System.out.println(digitCheck(str, 0));


    }
}

//№9
import java.util.Scanner;

class Main {
    public static int characterCounter(String str, int index) {
        if (index == str.length()) {
            return 0;
        }
        else {
            return 1 + characterCounter(str, index + 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text: ");
        String str = sc.nextLine();
        System.out.println("Size of the text = " + characterCounter(str, 0));
    }
}

*/

//№10
import java.util.Scanner;

class Main {
    public static int findGCD(int num1, int num2) {
        if (num1 == 0) {
            return num2;
        }
        if (num2 == 0) {
            return num1;
        }
        else {
            int a = num1 % num2;
            int b = num2 % num1;
            return findGCD(a,b);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Greatest Common Divisor of " + num1 + " and " + num2 + " is " + findGCD(num1, num2));

    }
}

