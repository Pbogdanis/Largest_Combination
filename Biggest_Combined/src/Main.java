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
			    //Check for non-negative integers
			    int i = scanner.nextInt();
			    if(i<0){
			    	System.out.println("Please, enter non-negative integers only.");
			    	System.out.println("Please enter the sequence of numbers you want me to consume: ");
			    }
			    else{
			    	num_list.add(i);
			    }
			    
			}
		 Output(num_list);
	}
	
	public static String Output(ArrayList<Integer> sequence)
	{
		
		//The function will compare all the combinations in the list. 
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
		
		String temp_max = "",first_comb,second_comb;
		
		for (int j=0; j<numbers.size(); j++){
			for(int i=0; i<numbers.size() - 1; i++){
			
				first_comb = numbers.get(i).toString().concat(numbers.get(i+1).toString());
				second_comb = numbers.get(i+1).toString().concat(numbers.get(i).toString());
				if(Integer.parseInt(first_comb)>Integer.parseInt(second_comb)){
					//Do nothing
				}
				else {
					//Swap elements
					int t = numbers.get(i+1);
					numbers.set(i+1, numbers.get(i));
					numbers.set(i, t);
				}
				
			}
			
			}
			for (int k=0; k<numbers.size(); k++){
				temp_max = temp_max.concat(String.valueOf(numbers.get(k)));
			}
			biggest = temp_max;
			
			return ;
	
			
			}
	}
	

