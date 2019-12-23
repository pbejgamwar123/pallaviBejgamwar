import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class M 
{
	public static void main(String[] args) 
	{
		Map<Integer, String>m=new HashMap<>();
		m.put(1, "abc");
		m.put(7, "pqr");
		m.put(3, "xy");
		m.put(4, "aaa");
		m.put(4, "xyz");
		m.put(null, "ccc");//insertion order is not maintained
		//System.out.println(m);
		m.entrySet();
		
	
		/* for(Map.Entry m1:m.entrySet()){  
			   System.out.println(m1.getKey()+" "+m1.getValue());  
			  }  */
	}

}
