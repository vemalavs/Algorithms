
public class cozalozawoza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//method 1 with boolean
		final int lowerBound = 1, upperBound = 110;
		boolean printed;
		
           for (int number = lowerBound; number <= upperBound; ++number) {
        	   printed=false;
        	   if(number % 3 == 0)  {
        		   System.out.print("Coza");
        		   printed=true;
        		   }
        	   if (number % 5 == 0) {
        		   System.out.print("Loza");
        		   printed=true;
        	   }
        	   if(number % 7== 0) {
        		   System.out.print ("Woza");
        		   printed=true;	   
        		   }
        	   if (!printed) {
        		   System.out.print(number);
        	   }
        	   if (number % 11 ==0) {
        		   System.out.println();
        	   } else {
        		   System.out.print(" ");
        	   }
           }
           //method 2
//			if ((number % 3==0) && (number % 5 ==0)) {
//				System.out.print("CozaLoza" +" " );
//			}
//			if ((number % 3==0) && (number % 7 ==0)) {
//				System.out.print("CozaWoza" +" " );
//			}
//			
//			if (number%3==0) {
//				System.out.print("Coza" +" " );
//		    } 
//			if (number % 5 ==0) {
//				System.out.print("Loza" +" " );
//			}
//			if (number % 7 ==0) {
//				System.out.print("Woza" +" " );
//			}
//			if(number % 3 !=0 ||number % 5 !=0 || number % 7 !=0) {
//				System.out.print(number);
//			} 
//			if (number % 11==0) {
//				System.out.println();
//			}
//			else {
//		    	System.out.print(" ");
//		            }
//			}

			
		}


	}

