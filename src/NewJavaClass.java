public class NewJavaClass {
public static void main(String[] args){
    System.out.print("" + makeSomething());

    byte i = 1;
    byte j = 2;
    byte sum = (byte) (i+j);
    System.out.print(", " + sum);

    char c = 'a';
}
public static int makeSomething(int i, int j){
    return i+j;
}
public static String makeSomething(String name){
    return "Hello" + name;
}
public static double makeSomething(){
    return 3.14;
}

int x = 0;
}
