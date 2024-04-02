public class HollowRecatangle {
    public static void main(String[] args) {
        
        int length = 5;
        int breadth = 10;

        for(int row = 1; row <= length; row++){
            for(int column = 1; column <= breadth; column++){
                if (row == 1 || column == 1 || row == length || column == breadth ) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
