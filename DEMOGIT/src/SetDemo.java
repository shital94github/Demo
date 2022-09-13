import java.util.Arrays;
import java.util.HashSet;

public class SetDemo {

	public static void main(String[] args) {
		HashSet<Integer> set=new HashSet<Integer>();
		set.add(null);
		set.add(5);
		set.add(7);
		set.add(5);
		for(Integer j:set) {
			System.out.println(j);
		}

	}

}
