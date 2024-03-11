package pbo_5;
import java.util.Scanner;

public class Soal_3 {
    public static boolean isValidInput(int value) {
        return (value >= 1 && value <= 1000);
    }
    public static void printPattern(int N) {
        for (int i = 1; i <= N; i++) {
            printStars(i);
            System.out.println();
        }
    }
    public static void printStars(int count) {
        for (int j = 0; j < count; j++) {
            System.out.print("*");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai N (1-1000): ");
        int N = scanner.nextInt();

        if (isValidInput(N)) {
            printPattern(N);
        } else {
            System.out.println("Masukkan nilai N antara 1 dan 1000.");
        }

        scanner.close();
    }
}
