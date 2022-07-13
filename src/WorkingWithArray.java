 public class WorkingWithArray {
    public static void main(String[] args){
        int[] array = {-1, -2, -3, -4, -5};
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++){
            if(max < array[i]){
                max = array[i];
            }
            sum = sum + array[i];
        }
        System.out.print("Sum of the numbers in array: ");
        System.out.println(sum);
        sum = sum / array.length;
        System.out.print("Average number in this array: ");
        System.out.println(sum);
        System.out.print("Highest number in this array: ");
        System.out.println(max);
    }
}
