package packageIA;
//猫，是会跑的
public class Cat extends Animal implements IRunning{
    public Cat(String name) {
        super(name);
    }
    //重写run方法
    @Override
    public void run() {
        System.out.println(this.name+"正在用四条腿跑");
    }
}
