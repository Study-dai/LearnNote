package package1125;

import java.util.Arrays;

public class TestHeep {
    public int []  elem;
    public int usedSize;

    public TestHeep(){
        this.elem=new int [20];
        this.usedSize=0;
    }

    public void adjustDown (int root,int len){
        int parent=root;//定义parent为根
        int child =2*parent+1;
        while(child<len){
            if(child+1<len&&elem[child+1]>elem[child]){
                child=child+1;
            }
            //此时child就是左右孩子的最大值
            if(elem[child]>elem[parent]){
                int tmp =elem[child];
                elem[child]=elem[parent];
                elem[parent]=tmp;
            }else{
                break;
            }
            parent=child;
            child=2*parent+1;
        }
    }
    public void createHeeap(int [] arr){
        for (int i = 0; i <arr.length; i++) {
            this.elem[i]=arr[i];
            this.usedSize++;
        }
        for (int i = (arr.length-1)/2;i>=0;i--) {
            adjustDown(i,this.usedSize);
        }
    }
    public void adjustUp(int child){
        int parent=(child-1)/2;
        while(child>0){
            if(this.elem[child]>this.elem[parent]){
                int tmp=elem[child];
                elem[child]=elem[parent];
                elem[parent]=tmp;
                child=parent;
                parent=(parent-1)/2;
            }else{
                break;
            }
        }
    }
    public boolean isFull(){
        return this.usedSize==this.elem.length;
    }

    public void pushHeap(int val){
        if(isFull()){
            this.elem= Arrays.copyOf(this.elem,this.elem.length*2);
        }
        this.elem[this.usedSize]=val;
        this.usedSize++;//11
        adjustUp(usedSize-1);
    }
    public boolean isEmpty(){
        return this.usedSize==0;
    }
    public int getPop(){
        if(isEmpty()){
            return -1;
        }
        return this.elem[0];
    }

    public void popHeap(){
        //1、根顶元素和最后一个元素进行交换
        //2、向下调整，只需要调整0号下标这棵树
        int tmp=elem[0];
        elem[0]=elem[elem.length-1];
        elem[elem.length-1]=tmp;
        elem[0]=elem[--usedSize];
        adjustDown(0,this.usedSize);
    }
    public void display(){
        for (int i = 0; i <this.usedSize ; i++) {
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }

}
