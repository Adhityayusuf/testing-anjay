import java.util.Scanner;
public class Percobaan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data [][] = new int [6][10];
        int pertanyaan [] = new int [6];
        int respon [] = new int [10];
        int totalper = 0;
        double ratPer = 0, ratRes = 0, ratAll = 0;

        for (int i = 0; i < data.length; i++) {
            System.out.println("Pertanyaan ke-" + (i + 1 ));
            for (int j = 0; j < data[0].length; j++) {
                System.out.print("Masukkan Respon (1-5) ke-" + (j + 1) + " : ");
                data [i][j] = sc.nextInt();
                pertanyaan [i] += data [i][j];
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                respon [i] += data [j][i];
            }
        }
        for (int i = 0; i < 6; i++) {
            ratPer = pertanyaan[i] / 10;
            totalper += pertanyaan[i];
            System.out.println("Rata-rata dari pertanyaan ke-" + (i + 1) + " : " + ratPer);
        }
        for (int i = 0; i < 10; i++) {
            ratRes = respon[i] / 6;
            System.out.println("Rata-rata dari respon ke-" + (i + 1) + " : " + ratRes);
        }
        ratAll = totalper / 60;
        System.out.println("Rata-rata keseluruhan : " + ratAll);
    }
}