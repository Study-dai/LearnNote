实现代码: 递归求 N =5的阶乘 
public class Test{
    public static void main(String [] args){
        int num =5;
        int ret=jiechenghe(num);
        System.out.println(ret);
    }
    public static int jiechenghe(int num){
//起始（结束）条件：num=1
//递归公式：num*（num-1）
        if(num==1){
            return 1;
        }
        return num*jiechenghe(num-1);
    }

}
public class Test{
public static void main(String [] args){
	}

}