package packagePolypeptide;
//如果不使用多态
//将要使用大量的if else循环
public class main {
    public static void main(String[] args) {
        Shape s1=new Flower();
        Shape s2=new Cycle();
        Shape s3=new Rect();
        drawShapes();
    }
    public static void drawShapes(){
        Rect rect=new Rect();
        Cycle cycle=new Cycle();
        Flower flower=new Flower();
        String [] shapes={
                "cycle",
                "rect",
                "cycle",
                "rect",
                "flower"
        };
        for(String shape:shapes){
            if(shape.equals("cycle")){
                cycle.show();
            }else if(shape.equals("rect")){
                rect.show();
            }else if(shape.equals("flower")){
                flower.show();
            }
        }
    }
}
