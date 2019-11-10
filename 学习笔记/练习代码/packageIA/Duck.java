package packageIA;
//鸭子，能跑能游泳能飞
public class Duck extends Animal implements IRunning,ISwimming,IFlying{
    public Duck(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(this.name+"正在用翅膀飞");
    }

    @Override
    public void run() {
        System.out.println(this.name+"正在用两条腿跑");
    }

    @Override
    public void Swim() {
        System.out.println(this.name+"正飘在水上");
    }
}
