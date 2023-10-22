import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

enum Type{
	MEAT, FISH, OTHER
}

public class Week06_03_01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Week06_03_02> menu = Arrays.asList(new Week06_03_02("salad", true, 200, Type.OTHER),
				new Week06_03_02("beef", false, 7100, Type.MEAT), new Week06_03_02("chicken", false, 1400, Type.MEAT),
				new Week06_03_02("rice", true, 3510, Type.OTHER), new Week06_03_02("season fruit", true, 1120, Type.OTHER),
				new Week06_03_02("pizza", true, 5150, Type.OTHER), new Week06_03_02("salmon", false, 4150, Type.FISH));

		List<Week06_03_02> list = menu.stream().filter(p -> p.calories < 300).filter(p -> p.Vege == true)
				.collect(Collectors.toList());
		System.out.println(list);

	}

}