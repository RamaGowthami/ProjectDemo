//program for map() to print a list of Strings into uppercase,If the given List is Stream names=Stream.of("aBc","d","ef");
package TaskFive;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class MapMethod 
{

	public static void main(String[] args) 
	{
		//List<String> listVariable=List.of("aBc","d","ef");
		Stream<String> names=Stream.of("aBc","d","ef");
		List<String>    upperCaseList  =names
		                        		.map(s->s.toUpperCase())
		                                .collect(Collectors.toList());
		System.out.println(upperCaseList); 

	}

}
/*output:
[ABC, D, EF]*/
