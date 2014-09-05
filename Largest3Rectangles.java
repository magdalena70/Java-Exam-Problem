import java.util.Scanner;


//We are given a sequence of rectangles in the following format:
//[a1 x b1] [a2 x b2] … [an x bn]
//where a1…an and b1…bn are the sides of the rectangles (positive integers).
//Our goal is to find three consecutive rectangles with largest total area.
//For example, in the following sequence of 6 rectangles
//we have marked the largest 3 rectangles,
//that have total area 31 (4*3 + 1*4 + 5*3 = 31):
//	[3 x 3] [3 x 2] [4 x 3] [1 x 4] [5 x 3] [3 x 1]
//Write a program that reads a sequence of rectangles (at least 3)
//in the specified above format and calculates and prints the total
//area of the largest 3 rectangles.
//INPUT-The input data should be read from the console. At the first line,
//we have the input sequence of rectangles in the specified format.
//Each rectangle is surrounded in square brackets [ ]. The sides of each
//rectangle are given as two numbers with the 'x' sign between them.
//Anywhere around the numbers and around the other characters
//we could have spaces (one or more space).
//OUTPUT-At the only output line print the total area of the largest
//sequence of 3 rectangles.


public class Largest3Rectangles {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String elements = input.nextLine();
		elements = elements.replace("[","");
		elements = elements.replace(" ","");
		String[] splitElements = elements.split("]");
		
		//check whether the split is correct
		//for(String num:splitElements){
		//System.out.print(num+" ");
		//}
		
		int[] numbers = new int[splitElements.length];
		for(int i = 0;i < numbers.length;i ++){
			//string side contains the first two numbers,split them by "x"
			//and create variables "a" and "b"
			String side = splitElements[i];
			String[] sides = side.split("x");
			
			int a = Integer.parseInt(sides[0]);
			int b = Integer.parseInt(sides[1]);
			numbers[i] = a*b;
		}
		
		//verification of the resulting array
		//for(int n:numbers){
			//System.out.print(n+" ");
		//}
		
		int maxAreas = Integer.MIN_VALUE;
		for(int i = 2;i < numbers.length;i++){
			int currentAreas = numbers[i-2] + numbers[i-1] + numbers[i];
			if(currentAreas > maxAreas){
				maxAreas = currentAreas;
			}
		}
		System.out.print(maxAreas);
	}

}
