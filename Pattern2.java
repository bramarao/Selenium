import java.util.Scanner;


public class Pattern2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the numbers for Pattern");
      int rows = sc.nextInt();
      System.out.println("the following is you pattern");
      for(int i=1;i<=rows;i++){
    	  for(int j=1;j<=i;j++){
    		  System.out.print(j+"");
    	  }
    	  System.out.println();
      }
	}

}
