package packageIA;

public class Robot implements IRunning{
    private String name;

    public Robot(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println(this.name+"正在用轮子跑");
    }
}
