import java.util.Scanner;
public class Homework{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int dollar = s.nextInt();
        double leva = 1.64549;
        double levaInDollar = leva * dollar;

        System.out.print((Math.floor(levaInDollar * 100)) / 100);
    }
}