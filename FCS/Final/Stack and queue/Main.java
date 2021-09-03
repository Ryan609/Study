public class Main {
    public static void main(String[] args) {
        // MyStack stack = new MyStack();

        // stack.push("H");
        // stack.push("w");
        // stack.push("o");
        // stack.push("d");
        // stack.print();
        // System.out.println("----------");
        // stack.peek();
        // System.out.println("----------");
        // stack.print();
        // System.out.println("----------");
        // stack.pop();
        // System.out.println("----------");
        // stack.print();

        MyQueue queue = new MyQueue();
        queue.enqueue("H");
        queue.enqueue("w");
        queue.enqueue("o");
        queue.enqueue("d");
        queue.displayQueue();
        queue.dequeue();
        queue.displayQueue();

    }
}
