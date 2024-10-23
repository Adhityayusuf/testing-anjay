public class flow3 {
    public static void main(String[] args) {
        char huruf = 'a';
        int jmlHuruf = 1, h = 5;

        for (int i = 0; i < 5; i++) {
            for (int j = h - 1; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < jmlHuruf; k++) {
                System.out.print(huruf);
            huruf++;
            }
            System.out.println();
        h--;
        jmlHuruf+=2;
        }
    }
}
