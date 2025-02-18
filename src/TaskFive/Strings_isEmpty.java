//write a program to check weather a strings in the list are empty or not and print the list having non-empty Strings.
package TaskFive;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Strings_isEmpty {

	public static void main(String[] args) {
		List <String> ListStrings=Arrays.asList("abc","","bc","efg","abcd","","jkl");
		                         List<String> notEmpty=ListStrings.stream()
		                        		                           .filter(s->!s.isEmpty())
		                        		                           .collect(Collectors.toList());//(earlier java16)
		                        		                           //.toList();//after java16
	   System.out.println(ListStrings);   
		                           
		

	}

}
/*output:
[abc, , bc, efg, abcd, , jkl]*/