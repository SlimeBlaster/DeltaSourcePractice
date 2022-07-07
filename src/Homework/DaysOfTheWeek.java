package Homework;
import java.util.Scanner;
public class DaysOfTheWeek {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Write a number in range 1 to 7 to compare it with a day of the week: ");
        int day = sc.nextInt();
    if (day >= 1 && day <= 7){
    switch(day){
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
    }
    }
    else{
    System.out.println("Sorry but there's no day of the week with that number!");
    }
        System.out.println(day);
    }



}
