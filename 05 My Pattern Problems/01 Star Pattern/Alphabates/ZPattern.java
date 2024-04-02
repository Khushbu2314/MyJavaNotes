package Alphabates;

public class ZPattern {
    public static void main(String[] args) {
        int n = 7;
        for (int row = 1; row <= n; row++){
            for (int column = 1; column <= n; column++){
                if (row == 1 || row == n || column == (n - row + 1)) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
