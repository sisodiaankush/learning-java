import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class syntax {
    public static void main (String args[]){
ArrayList<Integer>list=new ArrayList<>();
list.add(10);
list.add(40);
list.add(5);
System.out.println(list);
Collections.sort(list);
System.out.println(list);
System.out.println(list.size());
System.out.println(list.get(1));
}
}