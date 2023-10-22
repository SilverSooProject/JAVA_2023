interface ArrayProcessing{
	double apply(double[] array);
}

public class Week06_02 {

	public static final ArrayProcessing maxer = array -> {
		double max = array[0];
		for(int i=0;i<array.length;i++) {
			if ( array[i] > max ) {
				max=array[i];
			}
		}
		return max;
	};
	
	public static final ArrayProcessing miner = array -> {
		double min = array[0];
		for (int i=0;i<array.length;i++) {
			if (array[i] < min) {
				min=array[i];
			}
		}
		return min;
	};
	
	public static final ArrayProcessing sumer = array -> {
		double sum=0.0;
		for (int i=0;i<array.length;i++) {
			sum += array[i];
		}
		return sum;
	};
	
	public static final ArrayProcessing averager = array -> sumer.apply(array) / array.length;
	
	public static void main(String[] args) {
		double[] value = { 12.4, 2.5, 23.8, 9.3 };
		
		System.out.println("최댓값: "+maxer.apply(value));
		System.out.println("최솟값: "+miner.apply(value));
		System.out.println("평균값: "+averager.apply(value));
	}

}
