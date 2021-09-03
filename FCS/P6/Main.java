import javax.print.event.PrintJobListener;

public class Main {
    public static void main(String[] args) {
        Mystack stack = new Mystack();
        Node node = new Node();
        // //node.setData("a");
        // stack.push(node);
        //node.setData("b");
        //stack.push(node);
        // node.setData("c");
        // stack.push(node);
        // stack.print();
        // stack.peek();
        // stack.print();
        // stack.pop();
        // stack.print();

        MyQueue queue = new MyQueue();
        // queue.enqueue("a");
        // queue.enqueue("b");
        // queue.displayQueue();
        System.out.println("-----------------");
        queue.dequeue();
        // queue.dequeue();
        queue.displayQueue();
    }

    // public static boolean bracketsMatching(String input) {
    //     // Create mystack object
    //     Mystack bracket = new Mystack();
    //     // Use a for loop to traverse the string
    //     for (int i = 0; i < input.length(); i++) {
    //         // Use if statement to judge, when read ‘()’
    //         if (input.charAt(i) == '(') {
    //             Node node = new Node();
    //             node.setData("(");
    //             bracket.push(node); // Push node onto the stack

    //         } else if (input.charAt(i) == '{') { // when read ‘{’
    //             Node node = new Node();
    //             node.setData("{");
    //             bracket.push(node); // Push node onto the stack
    //         } else if (input.charAt(i) == ')') { // when read ‘）’
    //             // Determine whether it is empty, and check “(”
    //             if (!bracket.isEmpty() && bracket.peek().getData().equals("(")) {
    //                 bracket.pop(); // Remove top node
    //             } else {
    //                 return false;
    //             }
    //         } else if (input.charAt(i) == '}') { // when read ‘}’
    //             // Determine whether it is empty, and check “{”
    //             if (!bracket.isEmpty() && bracket.peek().getData().equals("{")) {
    //                 bracket.pop(); // Remove top node
    //             } else {
    //                 return false;
    //             }
    //         }
    //     }
    //     if (bracket.isEmpty()) {
    //         return true;
    //     } else {
    //         return false;
    //     }
    // }
}
