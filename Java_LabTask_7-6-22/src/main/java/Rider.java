import java.util.Scanner;

public class Rider {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Size of stack: ");
        int stackSize = input.nextInt();
        Stack<String> strings = new Stack<>(stackSize);
        for (int i = 0; i < stackSize; i++) {
            System.out.print((i+1)+"st stack element: ");
            strings.push(input.next());
        }

        System.out.println("The stack string: \n" + strings.showStackString());
        System.out.println("\nTop is shown in square brackets '[]'\n");

        System.out.print("Size of queue: ");
        int queueSize = input.nextInt();
        Queue<String> stringsQueue = new Queue<>(queueSize);
        for (int i = 0; i < queueSize; i++) {
            System.out.print((i+1)+"st queue element: ");
            stringsQueue.enq(input.next());
        }
        System.out.println("The queue string: \n" + stringsQueue.showQueueString());



    }
}
