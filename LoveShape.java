import java.util.Scanner;
public class LoveShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah : ");
        int jml = sc.nextInt(); 
        System.out.print("Nilai n         : ");
        int n = sc.nextInt();

        for (int k = 1; k <= 5; k++) {
            // Bagian atas hati
            for (int i = n / 2; i <= n; i += 2) {
                // Spasi sebelum bagian kiri atas hati
                for (int j = 1; j < n - i; j += 2) {
                    System.out.print(" ");
                }
                // Bagian kiri atas hati
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                // Spasi di tengah antara bagian kiri dan kanan hati
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                // Bagian kanan atas hati
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            // Bagian bawah hati (segitiga terbalik)
            for (int i = n; i >= 1; i--) {
                // Spasi sebelum segitiga terbalik
                for (int j = i; j < n; j++) {
                    System.out.print(" ");
                }
                // Bintang untuk segitiga terbalik
                for (int j = 1; j <= (i * 2) - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
