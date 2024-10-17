import java.util.Scanner;
public class belajar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai;
        int lulus = 0, tdkLulus = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai >= 75 && nilai <= 100) {
                lulus++;
            } else if (nilai < 75 && nilai >= 0) {
                tdkLulus++; 
            } else {
                System.out.println("Nilai tidak valid !!");
                i--;
            }
        }

        System.out.println("Jumlah Siswa yg lulus       : " + lulus);
        System.out.println("Jumlah Siswa yg tidak lulus : " + tdkLulus);
    }    
}