package packageIA;
//鱼  是会游泳的
public class Fish extends Animal implements ISwimming {
    public Fish(String name) {
        super(name);
    }
    //重写swim方法
    @Override
    public void Swim() {
        System.out.println(this.name+"正在用尾巴游泳");
    }
}
