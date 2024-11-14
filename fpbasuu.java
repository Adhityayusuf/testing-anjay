import java.util.Scanner;
public class fpbasuu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        do {
            System.out.print("Masukkan a: ");
            a = sc.nextInt();
            System.out.print("Masukkan b: ");
            b = sc.nextInt();

            int hasilfpb = operasi(a,b);
            System.out.println("hasil : " + hasilfpb);
        }while(a != 0 && b != 0);
    }

    public static int operasi(int a,int b) {

        int hasil=0;
        for (int i = 1; i <= a && i <= b; i++){
            if (a % i == 0 && b % i == 0) {
                hasil = i;
            }
        }
        return hasil;
        
    }

}