import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int inputAmount = scanner.nextInt();
        int partToBeFixed = 0;
        int readyToBeShipped = 0;
        int rejectPart = 0;
        int input;

        for (int index = 0; index < inputAmount; index++) {
            input = scanner.nextInt();
            switch (input) {
                case 1 -> partToBeFixed++;
                case 0 -> readyToBeShipped++;
                default -> rejectPart++;
            }
        }
        System.out.println(readyToBeShipped + " " + partToBeFixed + " " + rejectPart);
    }
}