ʵ�ִ���: �ݹ��� N =5�Ľ׳� 
public class Test{
    public static void main(String [] args){
        int num =5;
        int ret=jiechenghe(num);
        System.out.println(ret);
    }
    public static int jiechenghe(int num){
//��ʼ��������������num=1
//�ݹ鹫ʽ��num*��num-1��
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