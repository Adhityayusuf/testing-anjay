import java.util.Scanner;
public class uts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m,total = 1, j = 1;

        while (j == 0) {
             System.out.print("\nNilai n : ");
             n = sc.nextInt();
             System.out.print("Nilai m : ");
             m = sc.nextInt();

             if (n > 0 || m > 0) {
                 for (int i = 1; i <= m; i++) {
                 total *= n;
                 }
            } else {
                j--;
            }
            System.out.println("hasil pangkat : " + total);
        }
    }
}
