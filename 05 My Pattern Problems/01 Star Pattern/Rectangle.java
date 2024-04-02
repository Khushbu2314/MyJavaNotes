public class Rectangle {
    public static void main(String[] args) {
        
        int length = 5;
        int breadth = 10;

        for(int row = 1; row <= length; row++){
            for(int col = 1; col <= breadth; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
