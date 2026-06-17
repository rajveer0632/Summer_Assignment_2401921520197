class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int value) {
        stack.push(value);
        if (minStack.isEmpty() || value <= minStack.peek()) {
            minStack.push(value);
        }
    }
    
    public void pop() {
        if (stack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        int top = stack.pop();
        if (top == minStack.peek()) {
            minStack.pop();
        }
    }
    
    public int top() {
        if (stack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack.peek();
    }
    
    public int getMin() {
        if (minStack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return minStack.peek();
    }
}
