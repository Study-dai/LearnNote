package package1223;

//递归
////递归的思路就是n位gray码是由n-1位gray码生成，举个例子简单一些：
////比如求n=3的gray码，首先知道n=2的gray码是(00,01,11,10)
////那么n=3的gray码其实就是对n=2的gray码首位添加0或1生成的，添加0后变成(000,001,011,010)
////添加1后需要顺序反向就变成(110,111,101,100)
////组合在一起就是(000,001,011,010,110,111,101,100)
public class GrayCode  {
    public String[] getGray(int n) {
            int m = 1<<n;
            String[] r = new String[m];
            if(n==1){
                r[0] = "0";
                r[1] = "1";
                return r;
            }
            String[] temp = getGray(n-1);
            int j = 0;
            for(int i = 0;i<m;i++){
                if(i<m/2){
                    r[i] = "0"+temp[j++];
                }else{
                    r[i] = "1"+temp[--j];
                }
            }
            return r;
        }
    }
