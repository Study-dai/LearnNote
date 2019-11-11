package packageExpection;

import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

public class Test {
    //public static void main(String[] args) {
/*        //1、不处理处理异常
        int [] arr={1,2,3};
        System.out.println("before");
        System.out.println(arr[100]);
        System.out.println("after");
        //执行结果：
        //ArrayIndexOutOfBoundsException: 100
*/

        //2、处理异常
/*        int [] arr={1,2,3};
        try {
            System.out.println("before");
            System.out.println(arr[100]);
            System.out.println("after");
        }catch (ArrayIndexOutOfBoundsException e){
            //打印出现异常的调用栈
            e.printStackTrace();
        }
        System.out.println("after try catch");
        //执行结果：
        before
        at packageExpection.Test.main(Test.java:18)
        after try catch
*/


/*
        //3、catch只能处理对应种类的异常
        int [] arr={1,2,3};
        try{
            System.out.println("before");
            arr=null;
            System.out.println(arr[100]);
            System.out.println("after");
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        System.out.println("after try catch");
        //执行结果：
        before
        Exception in thread "main" java.lang.NullPointerException
        at packageExpection.Test.main(Test.java:35)
*/
        //4、catch可以有多个
/*       int[] arr = {1, 2, 3};
        try {
            System.out.println("before");
            arr = null;
            System.out.println(arr[100]);
            System.out.println("after");
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("这是个数组下标越界异常和空指针异常");
            e.printStackTrace();
        }
        System.out.println("after try catch");

        //执行结果：
        before
        java.lang.NullPointerException
        at packageExpection.Test.main(Test.java:54)
        这是个数组下标越界异常和空指针异常
        after try catch
*/


        //6、finally表示最后的善后工作，例如释放资源
/*        int[] arr = {1, 2, 3};

        try {
            System.out.println("before");
            arr = null;
            System.out.println(arr[100]);
            System.out.println("after");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally code");
        }

        before
        java.lang.NullPointerException
        finally code
        at packageExpection.Test.main(Test.java:77)
*/
        //7、使用try负责回收资源
/*        try (Scanner scanner = new Scanner(System.in)) {
            int num = scanner.nextInt();
            System.out.println("num=" + num);
        } catch (Exception e) {
            e.printStackTrace();
        }


        Scanner sc = new Scanner(System.in);
        //，光标方法try上面，使用 Alt+回车键，
        // 选择 Replace with 'try'with resources 自动改变成上面的代码
        try {
            int num = sc.nextInt();
            System.out.println("num=" + num);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally code");
            sc.close();
        }
*/
        //8、如果本方法中没有合适的处理异常的方式，就会沿着调用栈向上传递
 /*       try{
            func();
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        System.out.println("after try catch");
    }
    public static void func(){
        int [] arr={1,2,3};
        System.out.println(arr[100]);
    }
    after try catch
    java.lang.ArrayIndexOutOfBoundsException: 100
    at packageExpection.Test.func(Test.java:124)
    at packageExpection.Test.main(Test.java:116)
*/
    /*    //9、如果一直传递都没有合适的处理方法，最终就会交个JVM处理，
        // 程序终止，跟没是哟是哪个try catch是一样的
        func();
        System.out.println("after try catch");
    }
    public static void func(){
        int [] arr={1,2,3};
        System.out.println(arr[100]);
    }
    */
/*
        //手动抛出异常
        public static void main(String[] args) {
            System.out.println(divide(10,0));
        }
        public static int divide(int x,int y){
            if(y==0) {
                throw new ArithmeticException("抛出0异常");
            }
            return x/y;
        }
        //执行结果：
        Exception in thread "main" java.lang.ArithmeticException: 抛出0异常
        at packageExpection.Test.divide(Test.java:147)
        at packageExpection.Test.main(Test.java:143)
*/

 /*   public static void main(String[] args) {
        System.out.println(func());
    }
    public static int func(){
        try{
            return 10;
        }finally{
            return 20;
        }
    }
    //执行结果：20
*/
 /*    public static void main(String[] args) {
         try {
             System.out.println(readFile());
         }catch(FileAlreadyExistsException e){
             e.printStackTrace();
         }
    }
    public static String readFile()throws FileAlreadyExistsException{
        File file=new File("D:\\Test.txt");
        Scanner scanner=null;
        return scanner.nextLine();
    }
    //编译出错：
    */
  /*  private static String uName="dai";
    private static String password="123456";
    public static void main(String[] args) {
     try{
         login("dia","123456");
     }catch(UserError userError){
         userError.printStatictrace();
     }

 }
 public static void login(String uName,String password){
        if(!Test.uName.equals(uName)){
            //TODO处理用户名错误
        }
        if(!Test.password.equals(password)){
            //TODO密码错误
        }
     System.out.println("登录成功！");
    }
    */
}

























