import java.util.Scanner;
public class DollarInLeva{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Write how many dollars to be converted in leva: ")
        int dollar = s.nextInt();
        double leva = 1.64549;
        double DollarsInLeva = leva * dollar;
        System.out.print((Math.floor(levaInDollar * 100)) / 100);
    }
}
