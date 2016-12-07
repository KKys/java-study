package collection;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 2016/11/22.
 */
public class equalsAndHashcode {


    public static void main(String[] args){
        Object obj = new Object();
        obj.equals(123);
        obj.hashCode();

        String str = new String("123");
        str.equals("123");
        str.hashCode();

        Set set = new HashSet<Integer>();
        set.add("123");
    }
}
