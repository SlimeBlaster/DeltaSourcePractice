package Homework;
import java.util.Scanner;

public class Password {
    public static void main(String[] args){
        Scanner userImput = new Scanner(System.in);
        String userName = userImput.nextLine();
        String password = userImput.nextLine();
        int whileStopper = 1;

        while(whileStopper < 2){
            String passwordConfirm = userImput.nextLine();
            if(passwordConfirm.equals(password)){
                System.out.println("Welkome " + userName + "!");
                whileStopper++;
            }
        }
    }
}
