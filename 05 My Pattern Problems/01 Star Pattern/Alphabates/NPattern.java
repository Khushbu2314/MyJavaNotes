package Alphabates;
public class NPattern {
    public static void main(String[] args) {
        int n = 7;
        for (int row = 1; row <= n; row++){
            for (int column = 1; column <= n; column++){
                if(row == column || column == n || column == 1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
