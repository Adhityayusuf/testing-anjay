import java.util.Scanner;
public class untukGyzna {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean tanya;
        String nama;
        System.out.println("Apakah anda ingin mengirim pesan ? ");
        tanya = sc.nextBoolean();
        sc.nextLine();
        if ( tanya == true) {
            System.out.print("Masukkan nama orang nya : ");
            nama = sc.nextLine();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("===== SELAMAT ULANG TAHUN, " + nama + " =====");
            System.out.println("selamat ulang tahun ya cantik, Aku bersyukur atas kehadiranmu dalam hidupku");
            System.out.println("yang selalu membawa kebahagiaan dan ketenangan.Semoga di usia baru ini, kamu selalu diberikan");
            System.out.println("kesehatan, kebahagiaan, dan keberkahan dalam setiap langkahmu.");
            System.out.println();
            System.out.println("Aku ingin kamu tahu bahwa aku selalu ada untukmu, mendukungmu dalam");
            System.out.println("setiap perjalananmu, dan mencintaimu apa adanya. Semoga semua impian");
            System.out.println("dan harapanmu perlahan menjadi nyata.");
            System.out.println();
            System.out.println("Terima kasih telah menjadi bagian penting dalam hidupku. Semoga hari ini");
            System.out.println("dan setiap hari ke depan penuh dengan senyum dan kebahagiaan.");
            System.out.println("=== I LOVE YOU ===");
        }
        love();
    }
    public static void love () {
        int n = 10;
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
    }
}
