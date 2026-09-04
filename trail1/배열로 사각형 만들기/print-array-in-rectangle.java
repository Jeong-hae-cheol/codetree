public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        int[][] arr = new int[5][5];
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                if(i == 0 || j == 0) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i-1][j] + arr[i][j-1];
                }  
            }            
        }

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {                
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}