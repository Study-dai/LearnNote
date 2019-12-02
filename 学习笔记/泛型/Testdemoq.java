package package1201;
//泛型上界
public class Testdemoq {
    class Algorithm<T extends Comparable<T>>{
        public T MAXNum(T [] array){
            T max=array[0];
            for (int i = 1; i <array.length; i++) {
                if(array[i].compareTo(max)>0){
                    max=array[i];
                }
            }
            return max;
        }
    }
    class Algorithm2<T extends Comparable<T>>{
        public T MAXNum(T [] array){
            T max=array[0];
            for (int i = 1; i <array.length; i++) {
                if(array[i].compareTo(max)>0){
                    max=array[i];
                }
            }
            return max;
        }
    }
    public static void main(String[] args) {
        //Algorithm<Integer> algorithm=new Algorithm<>();
        Integer[] array={1,2,3,4};
       // Integer ret=algorithm.maxNum(array);
        System.out.println();
    }
}
