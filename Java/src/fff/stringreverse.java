package fff;

import java.util.HashMap;
import java.util.Map;

public class stringreverse {
	public static void main(String[] args) {
		Map a = new HashMap<>();
		a.put("name", "abi");
		a.put("pass", "password");
		System.out.println(a.get("name"));
		int hashCode = a.hashCode();
		System.out.println(hashCode);
		boolean containsValue = a.containsValue("ab9i");
		System.out.println(a);
	}
}
