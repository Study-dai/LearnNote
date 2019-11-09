小芳的妈妈每天给她2.5元钱，她都会存起来，但是，每当这一天是存钱的第5天或者5的倍数的话，她都会花去6元钱，请问，经过多少天，小芳才可以存到100元钱。

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
//执行结果：75