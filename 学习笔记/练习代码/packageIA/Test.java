package packageIA;

public class Test {
    public static void walk(IRunning running) {
        System.out.println("我带着伙伴去散步");
        running.run();
    }
    //在这个walk内部，我们并不关注到底是那种动物
    // 只要参数是会跑的，就行
    public static void main(String[] args) {
        Cat cat =new Cat("小猫");
        walk(cat);
        Frog frog=new Frog();
        walk(frog);
        Robot robot=new Robot("机器人");
        walk(robot);
    }

}
