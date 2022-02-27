
public class hs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numerator =1;
		double sumL2R = 0.0;
		double sumR2L=0.0;
		int max_denominator=50000;
		double absDiff=0.0;
		
		for (int i=1; i<=max_denominator;++i ) {
	     sumL2R+= numerator/i;
		}
		 System.out.println("The sum from left to right:" +sumL2R);
		 
		 for (int j=max_denominator; j>=1; j--) {
			 sumR2L+=numerator/j;
		 }
		 System.out.println("The sum from right to left is: " + sumR2L);
		 
		 if (sumL2R > sumR2L){
			 absDiff=sumL2R - sumR2L;
			 System.out.println("Absolute Difference: "+ (Math.abs(absDiff)));
		 } else
		 {
			 absDiff= sumR2L -sumL2R;
			 System.out.println("Absolute Difference: "+ (Math.abs(absDiff)));
		 }
		 

	}
}
