package Alphabates;
public class EPattern {
    public static void main(String[] args) {
        int n = 7; //worked with odd numbers only
        
        for(int row = 1; row <= n; row++) {
            for(int column = 1; column <= n; column++) {
                if(row == 1 || column == 1 || row == n || row == (int)(Math.ceil(n/2.0))) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
