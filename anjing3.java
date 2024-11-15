import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class anjing3 {


public static void main(String[] args) throws IOException {

    Scanner sc = new Scanner(System.in);

    int [][] arrayTugas = new int[5][7];
    String[] namaMahasiswa = new String[5];

    System.out.print("Apakah anda ingin mengakses menu? (y/n)");
    String lanjut = sc.next();
    
    while (lanjut.equalsIgnoreCase("y")) {
        System.out.println("1. Input Nilai\n2.Menampilkan Nilai\n3.Minggu Nilai Tertinggi\n4.Nilai Tertinggi");
        System.out.print("Masukkan pilihan menu : ");
        int pilihan = sc.nextInt();

    switch (pilihan) {
        case 1:
        System.out.println("INPUT NILAI MAHASISWA");
        inputDataMahasiswa(arrayTugas, namaMahasiswa);
        break;
        case 2: 
        System.out.println("DATA NILAI MAHASISWA");
        printTugas(arrayTugas, namaMahasiswa);
        break;
        case 3: 
        System.out.println("NILAI TERTINGGI BERDASARKAN MINGGU");
        mingguNilaiTertinggi(arrayTugas, namaMahasiswa);
        break;
        case 4: 
        System.out.println("NILAI TERTINGGI");
        mhsNilaiTertinggi(arrayTugas, namaMahasiswa);
        break;
        default:
        System.out.println("Input tidak valid!");
    }

    System.out.print("Apakah anda ingin mengakses menu? (y/n)");
    lanjut = sc.next();

}
    
}

private static void inputDataMahasiswa (int [][]arrayTugas, String []namaMahasiswa) throws InputMismatchException {
    Scanner scan = new Scanner(System.in);
    
    for(int i = 0; i < namaMahasiswa.length; i++) {
        System.out.print("Masukkan nama mahasiswa " + (i+1) + ": ");
        namaMahasiswa[i] = scan.next();
    }
    int[] nilai = new int[7];
    
try {
    for(int i = 0; i < namaMahasiswa.length; i++) {
        System.out.print("Masukkan nilai mahasiswa " + namaMahasiswa[i] + ":\n" );
        for(int j = 0; j < nilai.length; j++) {
            do {
                System.out.print("nilai minggu ke " + (j+1) + " (0 - 100):");
                arrayTugas[i][j] = scan.nextInt();
            } while (arrayTugas[i][j] < 0 || arrayTugas[i][j] > 100);
            
        }    
    }
} catch (Exception e) {
    System.err.println("masukkan nominal angka!");
}
}

private static void printTugas (int [][] arrayTugas, String [] namaMahasiswa) {

    int baris = arrayTugas.length;
    int kolom = arrayTugas[0].length;

    System.out.println("nilai mahasiswa dari minggu 1 - 7 : ");

        for (int i = 0; i < baris; i++) {
            System.out.print(namaMahasiswa[i] + ":");
                for (int j = 0; j < kolom; j++) {
                    System.out.print(arrayTugas[i][j]);
                    System.out.print(" ");
                }
                System.out.print("\n");
            }
}
private static void mingguNilaiTertinggi (int [][] arrayTugas, String[] namaMahasiswa) {
    int [] nilaiTertinggi = new int[arrayTugas[0].length];

    for (int i = 0; i < arrayTugas.length;i++) {
        int tertinggi = 0;
        for (int j = 0; j < arrayTugas[0].length;j++) {
            if (arrayTugas[i][j] > tertinggi) {
                tertinggi = arrayTugas[i][j];
                nilaiTertinggi[i] = j+1;
            }
        }
    }

    for (int i = 0; i < namaMahasiswa.length; i++) {
        System.out.println(namaMahasiswa[i] + " memperoleh nilai tertinggi pada minggu ke - " + nilaiTertinggi[i]);
    }
}

private static void mhsNilaiTertinggi (int [][] arrayTugas, String[] namaMahasiswa) {
    int baris = arrayTugas.length;
    int kolom = arrayTugas[0].length;

    int nilaiTertinggi = 0;
    String mahasiswaTertinggi = namaMahasiswa[0];
    int mingguTertinggi = 0;

    for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                if (arrayTugas[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = arrayTugas[i][j];
                    mahasiswaTertinggi = namaMahasiswa[i];
                    mingguTertinggi = j + 1;
                }
            }
        }
        System.out.println("=========================");
        System.out.println("MAHASISWA DENGAN NILAI TERTINGGI");
        System.out.println("nama mahasiswa : " + mahasiswaTertinggi);
        System.out.println("nilai tertinggi : " + nilaiTertinggi);
        System.out.println("pada minggu ke - " + mingguTertinggi);

        System.out.println("\n=========================");

}
}