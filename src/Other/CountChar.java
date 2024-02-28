package Other;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountChar {

	public static void main(String[] args) {
		String name = "aabbccddeeff";
//		Map<String, Long> charCount = word.codePoints().mapToObj(Character::toString)
//		        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//		System.out.println(charCount);
		
		
		
		Map<String, Integer> charCount = new HashMap<>();
	    for(String charr: name.split("")){
	        Integer added = charCount.putIfAbsent(charr, 1);
	        if(added != null)
	            charCount.computeIfPresent(charr,(k,v) -> v+1);
	    }

	    System.out.println(charCount);
		

	}

}
