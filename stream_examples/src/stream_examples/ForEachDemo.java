package stream_examples;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {

	public static void main(String[] args) {
		
		List<String> numberList = new ArrayList<String>();
		numberList.add("aaa");
		numberList.add("bbb");
		numberList.add("acc");
		numberList.add("ddd");
		
		numberList.stream().forEach(t -> System.out.println(t));
		//with filter
		numberList.stream().filter(t -> t.startsWith("a")).forEach(s -> System.out.println(s));
		
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1,"aaa");
		map.put(2,"bbb");
		map.put(3,"acc");
		map.put(4,"ddd");
		
		map.forEach((key, value) -> System.out.println(key+":"+ value));
		
		map.entrySet().stream().forEach(t -> System.out.println(t));
		
		map.entrySet().stream().filter(v -> v.getValue().startsWith("a")).forEach(t -> System.out.println(t));
		
		
	}

}
