// two stack version
class MyQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public MyQueue() {
        this.stack1 = new Stack<Integer>();
        this.stack2 = new Stack<Integer>();
    }

    // Push element x to the back of queue.
    public void push(int x) {
        if(stack1.isEmpty()) {
            stack1.push(x);
        } else {
            while(!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            stack1.push(x);
            while(!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
        }
    }

    // Removes the element from in front of queue.
    public void pop() {
        stack1.pop();
    }

    // Get the front element.
    public int peek() {
        return stack1.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return stack1.isEmpty();
    }
}



// version 2
class MyQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public MyQueue() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }

    // Push element x to the back of queue.
    public void push(int x) {
        stack1.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        peek();
        stack2.pop();
    }

    // Get the front element.
    public int peek() {
        if(stack2.isEmpty())
            while(!stack1.isEmpty())
                stack2.push(stack1.pop());
        return stack2.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}