import java.io.*;
import java.util.*;
public class Main{
    
	//List imported by user
	static ArrayList<Integer> num_list = new ArrayList<Integer>();
	public static String biggest = "0";
	//Scanner for input
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String args[])
    {
		 System.out.println("Please enter the sequence of numbers you want me to consume: ");
		 while (scanner.hasNextInt()) {
			    int i = scanner.nextInt();
			    num_list.add(i);
			}
		 Output(num_list);
	}
	
	public static String Output(ArrayList<Integer> sequence)
	{
		
		//The function will compare all the combinations in the list. 

		//First we need to find the number of permutations we will need
		//Factorial based on list length
		Integer length = sequence.size();
		Integer factorial = Factorial(length);
		String perms[] = new String[factorial];
		Arrays.fill(perms, "0");
		//System.out.println("Factorial " + factorial.toString());
		//Find the permutations
		Combinations(num_list);
		System.out.println("The largest combination is: " + biggest);
		return biggest;
	}
	
	public static Integer Factorial(Integer length)
	{
		 int i,fact=1;  
		   
		 for(i=1 ; i <= length; i++){    
		      fact=fact*i;    
		  }    
		return fact;
	}
	
	public static void Combinations(ArrayList<Integer> numbers){
		
		String temp_max = "-1",first_comb,second_comb;
		
		
		for(int i=0; i<numbers.size() - 1; i++){
			
			first_comb = numbers.get(i).toString().concat(numbers.get(i+1).toString());
			second_comb = numbers.get(i+1).toString().concat(numbers.get(i).toString());
			if(Integer.parseInt(first_comb)>Integer.parseInt(second_comb)){
				temp_max = first_comb;
				
			}
			else {
				temp_max = second_comb;
			}
			numbers.set(i+1, Integer.parseInt(temp_max));
			System.out.println("The largest between " + first_comb + " and " + second_comb + " is " + temp_max );
		}
		biggest = temp_max;
		return ;
	}
}
