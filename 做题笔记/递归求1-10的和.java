ʵ�ִ���: �ݹ��� 1 + 2 + 3 + ... + 10 
public class Test{
    public static void main(String[] args) {
        int num=10;
        int ret=sum(num);
        System.out.println(ret);
    }
//��ʼ���� n=1   
// �ݹ鹫ʽ sum = n+(n-1)
    public static int sum(int num){
        if(num==1){
            return 1;
        }
        return num+sum(num-1);
    }
}