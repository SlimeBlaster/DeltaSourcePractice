public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = BubbleSort1(new int[]{3, 5, 3, 1});
        for (int i:arr
             ) {
            System.out.print(i + " ");
        }
    }

    public static int[] BubbleSort1(int[] arr) {
        int n = arr.length;
        int currNum = 0;
        for (int k = 0; k < arr.length - 1; k++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    currNum = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = currNum;
                }
            }
        }
        return arr;
    }
}
