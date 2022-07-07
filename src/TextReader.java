import java.util.Scanner;
public class TextReader {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Write any word: ");
        String anything = s.nextLine();
        for (int i = 0; i < anything.length(); i++){
            System.out.println(anything.charAt(i));
        }
    }
}
