package package1201;

/**
 * 1、实现一个通用的ArrayList
 * 2、泛型：MyArrayList<T>:他只是一个占位符
 *    证明当前的类是一个泛型类
 * 3、
 *   坑1：泛型是不能够new 泛型数组的 T[] a = new T[];ERROR
 *   坑2：泛型的参数必须是引用类型，不能是内置类型(简单类型)
 * 4、泛型的意义
 *    a:可以进行自动类型检查
 *    b:可以自动进行类型转换
 * 5、泛型到底是怎么编译的？
 *    类型的擦除机制。-》Object  并不是替换
 * 6、泛型参数是不参与类型的组成的。
 */
interface MyList<T> {
    void add(T data);
}
public class MyArrayList<T> implements MyList<T>{

    public T[] elem;
    public int usedSize;

    public MyArrayList() {
        this.elem = (T[])new Object[10];
        //this.elem = new Object[10];
        this.usedSize = 0;
    }

    public void add(T data) {
        this.elem[this.usedSize] = data;
        this.usedSize++;
    }

    public T get() {
        T a = this.elem[this.usedSize-1];
        this.usedSize--;
        return a;
    }
}
