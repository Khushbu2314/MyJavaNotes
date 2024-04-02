package Alphabates;
public class LPattern {
    public static void main(String[] args) {
        int n = 5;
        for(int row = 1; row <= n; row++) {
            for(int column = 1; column <= row; column++) {
                if (column == 1 || row == n) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
