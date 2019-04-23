import java.lang.*;
import java.util.*;
import com.cezarydanilowski.Stack;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        sayHello();
        Stack stack = new Stack(stackInit());
        choice(stack);
    }

    static int stackInit() {
        System.out.print("Please, type how height stack do you want: ");
        int howManyElments = scanner.nextInt();

        return howManyElments;
    }

    static void sayHello() {
        System.out.println("         /A    AL CBBBBB JI    GAAAA JOOOL MM    MM CBBBBB");
        System.out.println("         AA AA AA A      II    A     O   O MMM  MMM A");
        System.out.println("         AAA  AAA ABBB   II    A     O   O MM MM MM ABBB");
        System.out.println("         VA    AL CBBBBB VIIII AAAAA JOOOL MM    MM CBBBBB\n");
    }

    static void choice(Stack stack) {
        int choice = 0;

        while (choice != 5) {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Size");
            System.out.println("4. Is Empty?");
            System.out.println("5. Exit");
            
            stack.printStack();

            System.out.print("\nType your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Type element to add: ");
                    String element = scanner.next();
                    stack.push(element);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    System.out.println(stack.getSize());
                    break;
                case 4:
                    System.out.println(stack.isEmpty());
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("There's not such option!");
            }
        }
    }
}
