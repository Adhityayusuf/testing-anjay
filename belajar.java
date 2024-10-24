import java.util.Scanner;
public class belajar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai;
        int lulus = 0, tdkLulus = 0, nliLulus = 0, nliTdkLulus = 0;
        double rataLulus = 0, rataTdkLulus = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai >= 75 && nilai <= 100) {
                lulus++;
                nliLulus += nilai;
            } else if (nilai < 75 && nilai >= 0) {
                tdkLulus++;
                nliTdkLulus += nilai; 
            } else {
                System.out.println("Nilai tidak valid !!");
                i--;
            }
        }
        rataLulus = nliLulus / lulus;
        rataTdkLulus = nliTdkLulus / tdkLulus;
        System.out.println("Jumlah siswa yg lulus                : " + lulus);
        System.out.println("Jumlah siswa yg tidak lulus          : " + tdkLulus);
        System.out.println("Nilai keseluruhan siswa lulus        : " + nliLulus);
        System.out.println("Nilai keseluruhan siswa tidak lulus  : " + nliTdkLulus);
        System.out.println("Rata-rata nilai siswa yg lulus       : " + rataLulus);
        System.out.println("Rata-rata nilai siswa yg tidak lulus : " + rataTdkLulus);
    }   
}