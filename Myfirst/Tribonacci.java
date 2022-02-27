
public class Tribonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstTerm = 0;
		int secondTerm = 1;
		int thirdTerm = 1;
		int nMax = 20;
		int n=1;
		
		System.out.print("The first 20 numbers of the Tribonacci Sequence are:" );
		
		while (n <nMax) {
			System.out.print(firstTerm + " ");
			int nextTerm = firstTerm + secondTerm + thirdTerm;
			firstTerm = secondTerm;
		   secondTerm=thirdTerm;
			thirdTerm=nextTerm;
			
			n++;
		}

	}

}
