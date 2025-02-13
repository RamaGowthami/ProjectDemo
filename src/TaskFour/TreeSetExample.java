package TaskFour;
import java.util.TreeSet;
public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<Integer> set=new TreeSet<>();
		set.add(40);
		set.add(10);
		set.add(30);
		set.add(20);
        System.out.println("TreeSet(sorted)"+set);
        System.out.println("First:"+set.first());
        System.out.println("Last"+set.last());
        System.out.println("Higher than 20 is"+" "+set.higher(20));
        System.out.println("lower than 20 is"+" "+set.lower(20));
        

	}

}
//output
/*TreeSet(sorted)[10, 20, 30, 40]
First:10
Last40
Higher than 20 is 30
lower than 20 is 10*/