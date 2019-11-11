package packageCollection;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Collection {
    public static void main(String[] args) {
        //Map的基本用法
        Map<String,String> map=new HashMap<>();

    //使用isEmpty()和size();
        System.out.println(map.isEmpty());
        System.out.println(map.size());

        //使用put插入键值对(将指定的k-v放入Map中)
        map.put("及时雨","宋江");
        map.put("花和尚","鲁智深");
        map.put("行者","武松");
        System.out.println(map.isEmpty());
        System.out.println(map.size());

        //使用get根据key查找value(根据指定的key找到对应的v,但是根据v找不到k)
        System.out.println(map.get("花和尚")); //执行结果：鲁智深
        System.out.println(map.get("智多星"));//查不到返回null
        System.out.println(map.getOrDefault("智多星","吴用"));
        //根据指定的 k 查找对应的 v，没有找到用默认值代替
        //如果没有对应的key值，就会返回null;
        map.put("行者","武二郎");
        //put方法如果可以已经存在，新的value就会覆盖旧的value
        System.out.println(map.get("行者"));//执行结果：武二郎

        //判断是否包含k或者v
        System.out.println(map.containsKey("行者"));
        System.out.println(map.containsValue("武松"));
        //将所有键值对返回
        Set<Map.Entry<"","">>


    }
}
