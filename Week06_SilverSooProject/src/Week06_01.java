import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Week06_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> listOfNames = Arrays.asList(new String[]
				{"Apple", "Banana", "Cherry"});
		List<String> changeList = listOfNames.stream()
				.map(s->s.toLowerCase())
				.sorted()
				.collect(Collectors.toList());
		System.out.println(changeList);
				
	}

}
