package packageExpection;

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
