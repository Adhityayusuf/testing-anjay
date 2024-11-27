import java.util.Scanner;

public class KaliMatriks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dimensi matriks A
        System.out.print("Masukkan jumlah baris matriks A: ");
        int barisA = sc.nextInt();
        System.out.print("Masukkan jumlah kolom matriks A: ");
        int kolomA = sc.nextInt();

        // Input dimensi matriks B
        System.out.print("Masukkan jumlah baris matriks B: ");
        int barisB = sc.nextInt();
        System.out.print("Masukkan jumlah kolom matriks B: ");
        int kolomB = sc.nextInt();

        // Validasi dimensi matriks untuk perkalian
        if (kolomA != barisB) {
            System.out.println("Perkalian matriks tidak dapat dilakukan karena jumlah kolom A tidak sama dengan jumlah baris B.");
            return;
        }

        // Deklarasi matriks
        int[][] matriksA = new int[barisA][kolomA];
        int[][] matriksB = new int[barisB][kolomB];
        int[][] hasilPerkalian = new int[barisA][kolomB];

        // Input elemen matriks A
        System.out.println("Masukkan elemen matriks A:");
        for (int i = 0; i < barisA; i++) {
            for (int j = 0; j < kolomA; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                matriksA[i][j] = sc.nextInt();
            }
        }

        // Input elemen matriks B
        System.out.println("Masukkan elemen matriks B:");
        for (int i = 0; i < barisB; i++) {
            for (int j = 0; j < kolomB; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                matriksB[i][j] = sc.nextInt();
            }
        }

        // Perkalian matriks
        for (int i = 0; i < barisA; i++) {
            for (int j = 0; j < kolomB; j++) {
                hasilPerkalian[i][j] = 0;
                for (int k = 0; k < kolomA; k++) {
                    hasilPerkalian[i][j] += matriksA[i][k] * matriksB[k][j];
                }
            }
        }

        // Output hasil perkalian
        System.out.println("Hasil perkalian matriks:");
        for (int i = 0; i < barisA; i++) {
            for (int j = 0; j < kolomB; j++) {
                System.out.print(hasilPerkalian[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}