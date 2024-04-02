package Alphabates;
public class TPattern {
    public static void main(String[] args) {
        int n = 9;
        for(int row = 1; row <= n; row++) {
            for(int column = 1; column <= n; column++){
                if(row == 1 || column == (int)(Math.ceil(n/2f))){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
