
import java.util.Scanner;



//Write a program that enters an array of strings and finds in it
//all sequences of equal elements.
//The input strings are given as a single line, separated by a space.


public class SequencesOfEqualStrings {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		
		Scanner input = new Scanner(System.in);
		String inputSequence = input.nextLine();
		String[] sequenceArr = inputSequence.split(" ");
		
		
		for(int i = 0;i < sequenceArr.length - 1;i++){
			if(sequenceArr[i].equals(sequenceArr[i+1])){
				System.out.print(sequenceArr[i] + " ");
			}else{
				System.out.println(sequenceArr[i]);
			}
		}
		if(sequenceArr[sequenceArr.length-2].equals(sequenceArr[sequenceArr.length-1])){
			System.out.print(sequenceArr[sequenceArr.length-1]);
		}else{
			System.out.println(sequenceArr[sequenceArr.length-1]);
		}
	}

}


