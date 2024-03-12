import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static int userInput;

    public static void main(String[] args){
        while(userInput != 5){
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            System.out.println("4");
            System.out.println("5");
            userInput = input.nextInt();
        }
    }
}
