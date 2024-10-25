import java.util.Scanner;
public class uts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m,total = 1;

        while (true) {
            System.out.print("=== PERHITUNGAN BERPANGKAT ===");
             System.out.print("\nNilai n : ");
             n = sc.nextInt();
             System.out.print("Nilai m : ");
             m = sc.nextInt();

                 for (int i = 1; i <= m; i++) {
                 total *= n;
                 }
            System.out.println("hasil pangkat : " + total);
            System.out.println("=== PERHITUNGAN SELESAI ===");
            break;
        }
    }
}
