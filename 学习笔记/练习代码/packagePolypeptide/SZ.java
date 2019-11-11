package packagePolypeptide;
//如果使用多态，不用写很多的if-else语句
//代码更简单
public class SZ {
    public static void main(String[] args) {
        Shape s1=new Flower();
        Shape s2=new Cycle();
        Shape s3=new Rect();
        drawShapes();
    }
    public static void drawShapes(){
        //创建一个数组
        Shape [] shapes= {
                new Cycle(),
                new Rect(),
                new Cycle(),
                new Rect(),
                new Flower()
        };
        for(Shape shape:shapes){
            shape.show();
        }
    }
}
