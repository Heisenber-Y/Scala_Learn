import java.util.HashMap;

/**
 * Created by yml on 2019/8/8.
 */
public class JavaHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap();
        map.put("n1",100);
        map.put("n2",200);
        map.put("n3",300);
        map.put("n4",400);
        System.out.println(map); //无须
        System.out.println(map.get("n2"));

    }
}
