import java.util.Scanner;
public class SumOfSeconds {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Write seconds in range of 1 to 50");
        int x = 0;
        int sumOfSeconds = 0;
        int minutes = 0;
        int seconds = 0;
        while(x == 3){
            System.out.print("Write for how many seconds did this racer finished: ");
            int racerSeconds = sc.nextInt();
            if (racerSeconds > 0 && racerSeconds < 51){
                sumOfSeconds += racerSeconds;
                x++;
            }
            else{
                System.out.print("Write number in the range");
            }
        }
         minutes = sumOfSeconds / 60;
        seconds = sumOfSeconds % 60;

        String str = String.format("%d:%02d", minutes, seconds);

        System.out.print(str);
    }
}
