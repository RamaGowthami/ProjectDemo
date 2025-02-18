//write a program to store 10 student names in a list interface,seperate student starts name with "A" by using filter for giving special gifts.
package TaskFive;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Class_Student {

	public static void main(String[] args) {
		List<String> studentList=Arrays.asList("Aamani","Gowthami","Ramya","Nandana","Maneesha","Mounica","Laila","Radha","Roshini","Anantha");
		List<String> filteredList=studentList.stream() 
		                        		    .filter(s->s.startsWith("A"))
		                        		    .collect(Collectors.toList());
		                        		    //.toList();
		System.out.println(filteredList);

	}

}
//output:
/*[Aamani]*/