package package1215;
//合法括号序列判断
public class Parenthesis {
    public static boolean chkParenthesis(String A, int n) {
        int l=0;
        for (int i = 0; i <A.length() ; i++) {
            char c=A.charAt(i);
            if(c=='('){
                l++;
            }else if(c==')'){
                if(l>0){
                    l--;
                }else{
                    return false;
                }
            }else {
                return false;
            }
        }
        return  l==0;
    }
}
