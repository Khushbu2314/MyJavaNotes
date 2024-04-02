package Alphabates;

public class HPattern {
    public static void main(String[] args) {
        int n = 7;
        for (int row = 1; row <= n; row++){
            for(int column = 1; column <= n; column++){
                if (column == 1 || column == n || row == (int)(Math.ceil(n/2f))) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
