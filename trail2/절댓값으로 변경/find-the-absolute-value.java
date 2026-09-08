import java.util.Scanner;

class IntArrayWrapper {
    int[] value;

    public IntArrayWrapper(int[] value) {
        this.value = value;
    }
}

public class Main {
    public static void abs(IntArrayWrapper arr) {
        int[] arr_temp = arr.value;

        for(int i = 0; i < arr_temp.length; i++) {
            arr_temp[i] = Math.abs(arr_temp[i]);
        }

        arr.value = arr_temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.

        IntArrayWrapper arrWrapper = new IntArrayWrapper(arr);
        abs(arrWrapper);

        for(int i = 0; i < n; i++) {
            System.out.printf("%d ", arrWrapper.value[i]);
        }
    }
}