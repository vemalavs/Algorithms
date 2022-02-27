
public class computePI {

	public static void main(String[] args) {
		int maxTerm = 10000;
		double sum = 0.0;
		for (int term =1; term <=maxTerm ; term++) {
			if (term % 2 == 1) {
				sum += 1.0 /(term * 2 -1);
			} else {
			    sum -= 1.0 / (term * 2 -1);
			}		
		}
		System.out.println("Sum: "+ sum);
		

}
}