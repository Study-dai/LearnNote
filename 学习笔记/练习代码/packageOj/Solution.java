package packagemyStack.packageOj;
/*
import java.util.Stack;

//1、遍历字符串，遇到左括号就入栈。
//2、遇到右括号，取出栈顶元素，看栈顶元素和当前元素是否匹配。
//3、如果字符串遍历完了，同时栈也为空，那就是匹配的情况
public class Solution {
    public boolean isValid(String s) {
        //1.创建一个栈
        Stack<Character> stack =new Stack<>();
        //2.循环遍历了每个字符
        for (int i = 0; i <s.length(); i++) {
            //1、是左括号就入栈
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)'{'){
                stack.push(s.charAt(i));
            }else{
                //1.栈为空
                if(stack.empty()){
                    return false;
                } else{
                    char ch=stack.peek();
                    if(ch=='['&&s.charAt(i)==']'||
                            ch=='('&&s.charAt(i)==')'||
                            ch=='{'&&s.charAt(i)=='}'){
                        stack.pop();
                    }else{
                        return false;
                    }
                }
            }
        }
        if(!stack.empty()){
            return false;
        }
        return true;
    }
}
*/