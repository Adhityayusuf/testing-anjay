import java.util.Scanner;
public class OperasiMatriks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris matriks: ");
        int baris = scanner.nextInt();
        System.out.print("Masukkan jumlah kolom matriks: ");
        int kolom = scanner.nextInt();
        int[][] matriksA = new int[baris][kolom];
        int[][] matriksB = new int[baris][kolom];
        int[][] hasilPenjumlahan = new int[baris][kolom];
        int[][] hasilPengurangan = new int[baris][kolom];
        int[][] hasilPerkalian = new int[baris][kolom];

        System.out.println("Masukkan elemen matriks A:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                matriksA[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Masukkan elemen matriks B:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                matriksB[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Matrik a : ");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(" " + matriksA[i][j]);
            }
            System.out.println();
        }
        System.out.println("Matrik b : ");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(" " + matriksB[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasilPenjumlahan[i][j] = matriksA[i][j] + matriksB[i][j];
                hasilPengurangan[i][j] = matriksA[i][j] - matriksB[i][j];
            }
        }
        if (baris == kolom) {
            for (int i = 0; i < baris; i++) {
                for (int j = 0; j < kolom; j++) {
                    hasilPerkalian[i][j] = 0;
                    for (int k = 0; k < kolom; k++) {
                        hasilPerkalian[i][j] += matriksA[i][k] * matriksB[k][j];
                    }
                }
            }
        }
        System.out.println("Hasil penjumlahan matriks:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(hasilPenjumlahan[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Hasil pengurangan matriks:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(hasilPengurangan[i][j] + " ");
            }
            System.out.println();
        }
        if (baris == kolom) {
            System.out.println("Hasil perkalian matriks:");
            for (int i = 0; i < baris; i++) {
                for (int j = 0; j < kolom; j++) {
                    System.out.print(hasilPerkalian[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Perkalian matriks tidak dapat dilakukan karena jumlah kolom A tidak sama dengan jumlah baris B.");
        }
        scanner.close();
    }
}
