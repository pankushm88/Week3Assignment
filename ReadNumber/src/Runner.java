/**
 * 
 */

/**
 * @author Pankush
 *
 */
import java.util.Scanner;
public class Runner {

	/**
	 * @param args
	 */

	public static void main(String[] args) {

		//Part1  Command_line1
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter number to be converted to words: ");
		
		 int number=sc.nextInt();
	        FigToWords n = new FigToWords();
	        String result=n.convert(number);
	        System.out.println(result);
		
		
		//Part 2 KeyRead_Line2
	        KeyRead_Line2 kr = new KeyRead_Line2();
	        kr.read();
	        //kr.display();
	        kr.sortedArray();
	        kr.display();
	        kr.search();
		
		
		//Part3
		int length = args.length;
		int[] num = new int[length];
		for(int i=0; i<length; i++) {
			num[i] = Integer.parseInt(args[i]);
		}
		Command_Line1.calData(num);
		Command_Line1.displayData();
		
	}

}