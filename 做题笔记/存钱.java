С��������ÿ�����2.5ԪǮ������������������ǣ�ÿ����һ���Ǵ�Ǯ�ĵ�5�����5�ı����Ļ��������Ứȥ6ԪǮ�����ʣ����������죬С���ſ��Դ浽100ԪǮ��

public class main {
    public static void main(String[] args) {
        System.out.println(xioaf());
    }
    public static int xioaf(){
        int d=0;
        double m=0;
        for(d=0;d<100;d++){
            m+=2.5;
            if(m==100){
                break;
            }
            if(d%5==0){
                m-=6;
            }
        }
        return d;
    }
}
//ִ�н����75