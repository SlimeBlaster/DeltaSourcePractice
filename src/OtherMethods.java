import java.util.Scanner;

public class OtherMethods {
    public static void main(String[] args){
       theForCycle();
    }

    public static int printOdds(int number){
        if(number % 2 != 0){
            System.out.print(number);
        }
        else{
            System.out.println();
        }
        return number;
    }

    public static void theForCycle(){
        for(int i = 0; i < 100; i++){
            printOdds(i);
        }
    }
}
