import java.util.Scanner;
public class DollarInLeva{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int dollar = s.nextInt();
        double leva = 1.64549;
        double DollarInLeva = leva * dollar;
        System.out.print((Math.floor(levaInDollar * 100)) / 100);
    }
}
