
public class fibonacci {

	public static void main(String[] args) {

	    int i = 1, n = 20, firstTerm = 0, secondTerm = 1;
	    System.out.println("Fibonacci Series till " + n + " terms:");

	    while (i <= n) {
	      System.out.print(firstTerm + " ");

	      int nextTerm = firstTerm + secondTerm;
	      firstTerm = secondTerm;//predefine first 2 nos
	      secondTerm = nextTerm;//adding prev 2 nos
	      i++;
	    }
		
		}
	}


