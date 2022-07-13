package Animals;

public class Animal {
    public static void eat(){
        System.out.println("eating...");
    }

    public static void main(String[] args){
        System.out.print("The dog is ");
        Dog.eat();
        System.out.print("The dog is ");
        Dog.bark();
        System.out.print("The cat is ");
        Cat.eat();
        System.out.print("The cat is ");
        Cat.meow();
    }
}
