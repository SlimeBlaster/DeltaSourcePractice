import java.util.Scanner;

public class StringVariableWithIfStatement {
    public static void main(String[] args){
        Scanner userImput = new Scanner(System.in);
        int x = userImput.nextInt();
        String result = (x > 5)?(x < 10)? "t":"f":"s";
        System.out.println(result);
    }

}
