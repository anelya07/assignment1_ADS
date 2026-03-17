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
