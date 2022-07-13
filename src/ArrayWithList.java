import java.util.ArrayList;
import java.util.Scanner;

public class ArrayWithList {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        Scanner userImput = new Scanner(System.in);
        list.add("Black");
        list.add("Blue");
        list.add("Red");
        list.add("Yellow");
        list.add("Orange");
        //for(int i = 0; i < list.size(); i++){
        //    System.out.println(list.get(i));
        //}
        System.out.println();
        for (String str : list) {
            System.out.println(str);
        }
    }
}
