public class PlusPattern {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++){
            for(int column = 1; column <= n; column++){
                if (Math.ceil(n/2f) == row || Math.ceil(n/2f) == column) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
