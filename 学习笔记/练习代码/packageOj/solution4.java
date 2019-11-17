package packagemyStack.packageOj;

import java.util.Stack;
//实现一个最小栈
class MinStack {
    Stack<Integer> stack=new Stack<>();
    Stack<Integer> Minstack=new Stack<>();

    /** initialize your data structure here. */
    public MinStack() {
    stack=new Stack<>();
    Minstack=new Stack<>();
    }

    public void push(int x) {
        //第一次Minstack站内一定会入栈
        //第一次Minstack一定会放元素，其余的每次
        //往stack栈和minstack 比较
        stack.add(x);
        if(Minstack.isEmpty()||Minstack.peek()>=x){
            Minstack.add(x);
        }else{
            Minstack.add(Minstack.peek());
        }
    }

    public void pop() {
        //两个栈都得pop
        if(!stack.isEmpty()){
            Minstack.pop();
            stack.pop();
        }
    }

    public int top() {
        if(!stack.isEmpty()){
            return stack.peek();
        }
        throw  new RuntimeException("栈中元素为空");
    }

    public int getMin() {
        if(!Minstack.isEmpty()){
            return Minstack.peek();
        }
        throw new RuntimeException("栈中元素为空");
    }
}

public class solution4 {
}
