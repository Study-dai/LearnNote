package package1214;

import java.util.*;
public class Main1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            String a = input.next();
            String b = input.next();
            int n = a.length(),m=b.length();
            int ans = 0;
            for(int i=0;i<=n;i++){//insert pos
                int p=0,q=m+n-1;
                while(p<=q){
                    if(get(p,i,a,b)==get(q,i,a,b)){
                        p++;q--;
                    }else break;
                }
                if(p>q) ans++;
            }
            System.out.println(ans);
        }
    }
    public static char get(int index,int insert,String a,String b){
        if(index<insert){
            return a.charAt(index);
        }else if(index>=insert&&index<insert+b.length()){
            return b.charAt(index-insert);
        }else{
            return a.charAt(index-b.length());
        }
    }
}