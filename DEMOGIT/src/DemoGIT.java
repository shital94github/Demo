import java.util.LinkedHashMap;
import java.util.Set;

public class DemoGIT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedHashMap< String, String> map=new LinkedHashMap<String, String>();
map.put("pihu", "01");
map.put("JUNU","02" );
Set<String> set = map.keySet();
for(String s:set)
{System.out.println(s);
System.out.println(map.get(s));
	}
	}

}
