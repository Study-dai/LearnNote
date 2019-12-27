package package1223;
//无缓存交换
public class Exchage {
    public int[] exchangeAB(int[] AB) {
      AB[0]=AB[0]^AB[1];
        AB[1]=AB[1]^AB[0];
        AB[0]=AB[0]^AB[1];
        return AB;
    }
}
