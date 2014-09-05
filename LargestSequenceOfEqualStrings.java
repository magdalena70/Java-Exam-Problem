import java.util.Scanner;


//Write a program that enters an array of strings and finds in it
//the largest sequence of equal elements.
//If several sequences have the same longest length,
//print the leftmost of them.
//The input strings are given as a single line, separated by a space.

public class LargestSequenceOfEqualStrings {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		
		Scanner input = new Scanner(System.in);
		String inputStr = input.nextLine();
		String[] splitStr = inputStr.split(" ");
		
		int counter = 1;
		int maxCounter = 1;
		int index = 0;
		for(int i = 1;i < splitStr.length;i++){
			if(splitStr[i].equals(splitStr[i-1])){
				counter++;
			}else{
				counter = 1;
			}
			
			if(counter > maxCounter){
				maxCounter = counter;
				index = i;
			}
		}
		
		for(int i = 0;i < maxCounter;i++){
			System.out.print(splitStr[index] + " ");
		}
	}

}
