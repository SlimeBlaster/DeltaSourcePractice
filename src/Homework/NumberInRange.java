package Homework;
import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args){
        Scanner userImput = new Scanner(System.in);
        int numberCount = 1;

        while(numberCount < 2){
            int number = userImput.nextInt();
            if (number >= 1 && number <= 100){
                System.out.println("The number is: " + number);
                numberCount++;
            }
            else{
                System.out.println("Invalid number!");
            }
        }
    }
}
