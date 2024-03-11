package pbo_5;
import java.util.Scanner;

public class Soal_1 {
    public static void checkRibuan(int angka) {
        if (angka >= 1000 && angka <= 99999 && angka % 1000 == 0) {
            System.out.println(angka + " adalah bilangan ribuan");
        } else {
            System.out.println(angka + " bukan merupakan bilangan ribuan");
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            int a = scanner.nextInt();

            checkRibuan(a);
        }

        scanner.close();
    }
}
