import java.util.Scanner;

public class anjing {
    
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        String[] namaMahasiswa = new String[5];
        int[][] nilai = new int[5][7];

        for (int i = 0; i < namaMahasiswa.length; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + " : ");
            namaMahasiswa[i] = sc.nextLine();
            for (int j = 0; j < nilai[0].length; j++) {
                System.out.print("Masukkan Nilai minggu ke-" + (j + 1) + "   : ");
                nilai[i][j] = sc.nextInt();
                sc.nextLine();
            }
        }
        output(namaMahasiswa, nilai);
        System.out.println();

        int [] nilaiPerMinggu = minggu(nilai);

        for(int i = 0; i < namaMahasiswa.length; i++) {
            System.out.println(namaMahasiswa[i] + " memiliki nilai tertinggi di minggu ke-" + nilaiPerMinggu[i]);
        }
        mhsNilaiTinggi(namaMahasiswa, nilai);
    }
    public static void output(String[] namaMahasiswa, int[][] nilai){
        System.out.println("SELURUH NILAI MAHASISWA");
        for (int i = 0; i < namaMahasiswa.length; i++){
            System.out.print(namaMahasiswa[i] + " : ");
            for (int j = 0; j < nilai[0].length; j++){
                System.out.print(nilai[i][j]);
                System.out.print(", ");
            }
            System.out.println();
        }
    }
    public static int[] minggu(int[][] nilai){
        int[] mngTertinggi = new int[7];
        for (int i = 0; i < 5; i++) {
            int tinggi = 0;
            for (int j = 0; j < 7; j++){
                if (nilai[i][j] > tinggi){
                    tinggi = nilai [i][j];
                    mngTertinggi[i] = j + 1;
                }
            }
        }
        return mngTertinggi;
    }
    public static void mhsNilaiTinggi (String[] namaMahasiswa, int[][] nilai) {
        int nilaiTinggi = 0;
        String mahasiswaTinggi = namaMahasiswa[0];
        int mingguTinggi = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                if (nilai[i][j] > nilaiTinggi) {
                    nilaiTinggi = nilai[i][j];
                    mahasiswaTinggi = namaMahasiswa[i];
                    mingguTinggi = j + 1;
                }
            }
        }
        System.out.println("=========================");
        System.out.println("MAHASISWA DENGAN NILAI TERTINGGI");
        System.out.println("nama mahasiswa : " + mahasiswaTinggi);
        System.out.println("nilai tertinggi : " + nilaiTinggi);
        System.out.println("pada minggu ke - " + mingguTinggi);
        System.out.println("\n=========================");
    }
}
