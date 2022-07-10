package Homework;
import java.util.Scanner;

public class Weight {
    public static void main(String[] args){
        Scanner userImput = new Scanner(System.in);
        double weight = userImput.nextDouble();

        if(weight <= 50){
            System.out.println("anorexic");
        }
        else if(weight > 50 && weight <= 70){
            System.out.println("skinny");
        }
        else if(weight > 70 && weight <= 90){
            System.out.println("skinny fat");
        }
        else if(weight > 90 && weight <= 110){
            System.out.println("obese");
        }
        else{
            System.out.println("extra obese");
        }
    }
}
