package packagemyStack;

public class MyStack {
    //先不考虑扩容问题
    //使用一个数组来表示栈
    private int [] array=new int [100];
    private int size=0;
    //1.入栈
    public void push(int v){
        //array[size++]=v;
       array[size]=v;
       size++;
    }
    //2.出栈，返回的是出栈的这个元素的值
    public Integer pop(){
        if(size==0){
            return null;
        }
        //return array[--size];
        int ret=array[size-1];
        size--;
        return ret;
    }
    //3.取栈顶元素
    public Integer peek(){
        if(size==0){
            return null;
        }
        return array[size-1];
    }
    //4.判断栈是否为空
    public boolean isEmpty(){
        return size==0;
    }
    //5.获取栈的大小
    public int size(){
        return size;
    }
}
