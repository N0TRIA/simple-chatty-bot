import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int beginning = scanner.nextInt();
        int end = scanner.nextInt();
        int product = 1;

        for (int i = beginning; i < end; i++) {
            product *= i;
        }
        System.out.println(product);
    }
}