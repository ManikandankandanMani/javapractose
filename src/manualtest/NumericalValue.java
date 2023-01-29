package manualtest;

public class NumericalValue {
	
	public float getNumericalValue(float arr[]) {
		float sum = 0;
		for(float element : arr) {
			sum += element;
		}
		return sum / arr.length;
	}
	
}
