import java.util.HashSet;
import java.util.Scanner;



//George likes math. Recently he discovered an interesting property
//of the Pythagorean Theorem: there are infinite number of triples
//of integers a, b and c (a ≤ b), such that a2 + b2 = c2.
//Write a program to help George find all such triples
//(called Pythagorean numbers) among a set of integer numbers.
//The input data should be read from the console. At the first line,
//we have a number n – the count of the input numbers.
//At the next n lines we have n different integers.
//Output-Print at the console all Pythagorean equations a2 + b2 = c2
//(a ≤ b), which can be formed by the input numbers.
//Each equation should be printed in the following format:
//"a*a + b*b = c*c". The order of the equations is not important.
//Beware of spaces: put spaces around the "+" and "=".
//In case of no Pythagorean numbers found, print "No".

public class PythagoreanNumbers {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] numbers = new int[n];
		for(int i = 0;i < numbers.length;i++){
			numbers[i] = input.nextInt();
		}
		
		HashSet<Integer> numSquare = new HashSet<>();
		for(int number:numbers){
			numSquare.add(number*number);
		}
		
		int countPythNum = 0;
		for(int a:numbers){
			for(int b:numbers){
				int c = a*a + b*b;
				if(a <= b && numSquare.contains(c)){
					int cSqrt = (int)Math.sqrt(c);
					System.out.printf("%d*%d + %d*%d = %d*%d\n"
							,a,a,b,b,cSqrt,cSqrt);
					countPythNum++;
				}
			}
		}
		if(countPythNum == 0){
			System.out.print("No");
		}
	}

}
