class Square{
    public static void main(String[] args) {
        int n = 5;
        for (int row = 0; row < n; row++){
            for (int column = 0; column < n; column++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}