package packagemyStack;

import java.util.Stack;

//用栈实现队列
class myqueue {
    Stack<Integer> stack=new Stack<>();
    Stack<Integer> stackTmp=new Stack<>();

    /** Initialize your data structure here. */
    public myqueue() {
        stack = new Stack<>();
        stackTmp = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stack.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (stackTmp.isEmpty()){
        while(!stack.isEmpty()){
            stackTmp.push(stack.pop());
             }
        }
        if(stackTmp.isEmpty()){
            //将stackTmp的栈顶元素弹出
            return stackTmp.pop();
        }
        return -1;
    }

    /** Get the front element. */
    public int peek() {
        if (stackTmp.isEmpty()){
            while(!stack.isEmpty()){
                stackTmp.push(stack.pop());
            }
        }
        if(stackTmp.isEmpty()){
            //将stackTmp的栈顶元素弹出
            return stackTmp.peek();
        }
        return -1;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        if(stack.empty()&&stackTmp.empty()){
            return true;
        }
        return false;
    }
}
public class Solution3 {
}
