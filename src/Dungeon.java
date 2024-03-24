import java.util.Scanner;

public class Dungeon {
    static Scanner input = new Scanner(System.in);
    static String userInput;

    public static void main(String[] args){
        while(userInput.equals("5")){
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            System.out.println("4");
            System.out.println("5");
            userInput = userInputControl(1);
        }
    }

    static String userInputControl(int type){
        try{
            System.out.println("Enter input:");
            userInput = input.nextLine();
            switch (type){
                case 0 -> System.out.println("int");
                case 1 -> System.out.println("String");
            }
        }catch(Exception ignored){

        }
        return "#";
    }
}
