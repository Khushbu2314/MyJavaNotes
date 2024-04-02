package Alphabates;

public class KPattern {
    public static void main(String[] args) {
        int n = 7;
        for (int row = 1; row <= n; row++){
            for(int column = 1; column <= n; column++){

                if (column == 1 || column == (n-row-2) || row == (n+column-2)) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
