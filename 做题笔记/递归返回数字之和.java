 ʵ�ִ���: дһ���ݹ鷽��������һ���Ǹ����������������������֮��. 
//дһ������//����һ������//����������ǵ�����֮��
public class Test{
    public static void main(String[] args) {
        int num =1729;
        int sum=ret(num);
        System.out.println(sum);
    }
    //��ʼ����������������numΪ��λ����ʱ��num=9��
    //�ݹ鹫ʽ��num%10+��num/10��
    public static int ret(int num){
        if(num<10){
            return num;
        }
        return num%10+ret(num/10);
    }
}
