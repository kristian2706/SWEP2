package aufgabenblatt05;

import java.util.Stack;

public class Aufgabe_12_Collections {
    public static void main(String[] args) {
        int input;
        System.out.println("Geben sie Zahlen ein, 0 = Abbruch");

        Stack<Integer> stack = new Stack<>();

        while ((input = InputTools.readInteger("")) != 0) {
            stack.push(input);
        }

        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }
}
