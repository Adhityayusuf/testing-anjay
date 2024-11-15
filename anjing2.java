import java.util.Scanner;
 
public class anjing2 {
    static Scanner sc = new Scanner(System.in);
 
    public static void inputArray(int[][] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("Input Minggu ke-" + (i+1) + " :");
            for(int j=0;j<array[i].length;j++){
                System.out.print("Nilai mahasiswa ke-" + (j+1) + " : ");
                array[i][j] = sc.nextInt();
            }
        }
    }
 
    public static void outputArray(int[][] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("Minggu ke-" + (i+1) + " :");
            for(int j=0;j<array[i].length;j++){
                System.out.println( "Mahasiswa ke-" + (j+1) + " : " + array[i][j]);
            }
        }
    }
 
    public static int[] mingguTertinggi(int[][] array){
        int maks[] = new int[array[0].length];
        for(int i=0;i<array[0].length;i++){
            int max = 0;
            for(int j=0;j<array.length;j++){
                if(array[j][i] > max){
                    max = array[j][i];
                    maks[i] = j+1;
                }       
            }
        }
        return maks; 
    }
 
    public static int[] nilaiTertinggi(int[][] array){
        int result[] = new int[3];
        int max = 0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if(array[i][j] > max){
                    max = array[i][j];
                    result[0] = j+1;
                    result[1] = i+1;
                    result[2] = max;
                }
            }
        }
        return result;
    }
 
    public static void main(String[] args) {
        int data[][] = new int[7][5];
 
        inputArray(data);
        int c[] = mingguTertinggi(data);
        int d[] = nilaiTertinggi(data);
 
        outputArray(data);
 
        for(int i=0;i<data[0].length;i++){
            System.out.println("Mahasiswa ke-" + (i+1) + " memperoleh nilai tertinggi di minggu ke-" + c[i]);
        }
 
        System.out.println("Nilai tertinggi diperoleh oleh mahasiswa ke - " + d[1] + " di minggu ke-" + d[0] + " dengan nilai " + d[2]);
 
    }
}