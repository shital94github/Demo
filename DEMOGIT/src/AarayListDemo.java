import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class AarayListDemo {

	public static void main(String[] args) {
		
List<String>list= Arrays.asList("Shital","rahul","pihu","SAMU","JUNU");
Iterator<String> iterator = list.iterator();
while(iterator.hasNext()) {
	System.out.println(iterator.next());
}
	}

}
