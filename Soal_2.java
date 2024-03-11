package pbo_5;
import java.util.Scanner;

public class Soal_2 {
    public static boolean isValidInput(int awal, int akhir) {
        return (awal >= 1 && akhir <= 100 && awal <= akhir);
    }
    public static boolean isPrima(int angka) {
        if (angka <= 1) {
            return false;
        }

        for (int i = 2; i <= angka / 2; i++) {
            if (angka % i == 0) {
                return false;
            }
        }

        return true;
    }
    public static void displayPrimaNumbers(int awal, int akhir) {
        System.out.println("Bilangan prima antara " + awal + " dan " + akhir + ":");
        for (int i = awal; i <= akhir; i++) {
            if (isPrima(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan batas awal (>= 1): ");
        int batasAwal = scanner.nextInt();
        System.out.print("Masukkan batas akhir (<= 100): ");
        int batasAkhir = scanner.nextInt();
        
        if (isValidInput(batasAwal, batasAkhir)) {
            displayPrimaNumbers(batasAwal, batasAkhir);
        } else {
            System.out.println("Salah Masukan!");
        }

        scanner.close();
    }
}
