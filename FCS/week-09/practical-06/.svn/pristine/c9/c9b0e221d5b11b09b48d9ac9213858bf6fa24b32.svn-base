public class Main {

	public static void main(String[] args) {

		System.out.println("----------------------Question3-------------------");
		System.out.println("Input: " + "({})"); //Set and print text
		System.out.println("Output: " + bracketMatching("({})")); //Call the bracketMatching method and print the result

		System.out.println("Input: " + "({)");	//Set and print text
		System.out.println("Output: " + bracketMatching("({)"));	//Call the bracketMatching method and print the result

		System.out.println("Input: " + "(1+2) * {(2+3)*(3+4)}");	//Set and print text
		System.out.println("Output: " + bracketMatching("(1+2) * {(2+3)*(3+4)}"));	//Call the bracketMatching method and print the result

		System.out.println("Input: " + "(1+2) * {(2+3)*(3+4}}");	//Set and print text
		System.out.println("Output: " + bracketMatching("(1+2) * {(2+3)*(3+4}}"));	//Call the bracketMatching method and print the result
		System.out.println("--------------------------------------------------");

		System.out.println("----------------------Question5-------------------");
		//creat myqueue object
		MyQueue mq = new MyQueue();
		//Queue the node
		mq.enqueue(new Node("1"));
		mq.enqueue(new Node("4"));
		mq.enqueue(new Node("7"));
		mq.enqueue(new Node("9"));
		mq.enqueue(new Node("2"));

		System.out.printf("Input: ");
		mq.displayQueue(); //call displayQueue method and print queuq
		System.out.println();
		System.out.printf("Output: ");
		mq = reverseQueue(mq); //call reverseQueue method
		mq.displayQueue();	//call displayQueue method 
		System.out.println();

		System.out.println();

		MyQueue mq2 = new MyQueue();
		//Queue the node
		mq2.enqueue(new Node("3"));
		mq2.enqueue(new Node("3"));
		mq2.enqueue(new Node("4"));
		mq2.enqueue(new Node("1"));
		mq2.enqueue(new Node("2"));

		System.out.printf("Input: ");
		mq2.displayQueue();	//call displayQueue method and print queuq
		System.out.println();
		System.out.printf("Output: ");
		mq2 = reverseQueue(mq2);	//call reverseQueue method
		mq2.displayQueue();	//call displayQueue method 
		System.out.println();
		System.out.println("--------------------------------------------------");
	}

	public static boolean bracketMatching(String input) {
		//Create mystack object
		MyStack bracket = new MyStack();
		//Use a for loop to traverse the string
		for(int i = 0; i < input.length(); i++) {
			//Use if statement to judge, when read ‘()’
			if(input.charAt(i) == '(') {
				Node node = new Node();
				node.setData("(");
				bracket.push(node); //Push node onto the stack

			} else if (input.charAt(i) == '{') { //when read ‘{’
				Node node = new Node();
				node.setData("{");
				bracket.push(node); //Push node onto the stack
			} else if (input.charAt(i) == ')') { //when read ‘）’
				//Determine whether it is empty, and check “(”
				if(!bracket.isEmpty() && bracket.peek().getData().equals("(")) {
					bracket.pop(); //Remove top node
				} else {
					return false;
				}
			} else if (input.charAt(i) == '}') { //when read ‘}’
				//Determine whether it is empty, and check “{”
				if(!bracket.isEmpty() && bracket.peek().getData().equals("{")) {
					bracket.pop();	//Remove top node
				} else {
					return false;
				}	
			}
		}
		if (bracket.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
	//Create reverseQueue method
	public static MyQueue reverseQueue(MyQueue queue) {
		MyQueue re = new MyQueue();
		MyStack st = new MyStack();
		//When the queue is not null
		while(!queue.isEmpty()) {
			Node node = new Node();
			node.setData(queue.dequeue()); 
			//Set the next node to null
			node.setNext(null);
			//Push the node onto the stack
			st.push(node);
		}
		while(!st.isEmpty()) {
			//Insert the top node in the stack and delete the top node in the queue
			re.enqueue(st.pop());
		}
		return re;
	}
	
}