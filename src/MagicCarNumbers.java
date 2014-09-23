
import java.util.Scanner;

//Cars in Sofia have registration numbers in format "CAabcdXY"
//where a, b, c and d are digits from 0 to 9 and X and Y are letters
//from the following subset of the Latin alphabet: 'A', 'B', 'C', 'E',
//'H', 'K', 'M', 'P', 'T' and 'X'. Examples of car numbers from Sofia are
//"CA8517TX", "CA2277PC", "CA0710XC", "CA1111AC", while "CC7512FJ" in not
//valid car number from Sofia. Local people are keen to choose special
//numbers for their cars, know as magic car numbers. They calculate the
//weight of a car number as follows: they sum its digits and letters,
//assuming that letters have the following values: 'A'  10, 'B'  20,
//'C'  30, 'E'  50, 'H'  80, 'K'  110, 'M'  130, 'P'  160, 'T'  200,
//'X'  240. For example
//the weight("CA6511BM") = 30 + 10 + 6 + 5 + 1 + 1 + 20 + 130 = 203.
//A magic car number is a car number that has a special magic weight
//(e.g. 256 or 512 for developers) and its number is in some of the formats
//"CAaaaaXY", "CAabbbXY", "CAaaabXY", "CAaabbXY", "CAababXY" and
//"CAabbaXY", where a and b are two different digits and X and Y are
//letters from the Latin alphabet subset 
//{ 'A', 'B', 'C', 'E', 'H', 'K','M', 'P', 'T', 'X' }.
//Your task is to write a program that calculates how many cars can be
//registered in Sofia for given magic weight.
//Input
//The input data should be read from the console. It will consist of a
//single value: the magic weight.
//The input data will always be valid and in the format described.
//There is no need to check it explicitly.
//Output
//The output should be printed on the console. It is a single value:
//the number of cars matching given magic value.

public class MagicCarNumbers {

	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int magicWeight = sc.nextInt();
		//create array with weight each letter
		int[] weightLet = {10, 20, 30, 50, 80, 110, 130, 160, 200, 240};
		//letters = {'A', 'B', 'C', 'E', 'H', 'K','M', 'P', 'T', 'X' };
		
		int countMagNum = 0;
		//create loops for numbers a,b(0 - 9)
		for(int a = 0;a < 10;a++){
			for(int b = 0;b < 10;b++){
				//avoid repetitions
				if(a == b){
					continue;
				}
				//first two letters AC = 40
				//create loops for two right letters
				for(int let1 = 0;let1 < weightLet.length;let1++){
					for(int let2 = 0;let2 < weightLet.length;let2++){
						if(40 + (2*a + 2*b)+
							(weightLet[let1] + weightLet[let2]) == magicWeight){
							//check countMagNum -> 
							//here the variants are: (each "Yes" * 3)
							//System.out.print(
							//"Yes->ACaabbXY,ACabbaXY,ACababXY\n");
							countMagNum += 3 ;	
						}else if(40 + (a + 3*b) +
								(weightLet[let1] + weightLet[let2]) == magicWeight){
							//check countMagNum
							//System.out.print("Yes ");
							countMagNum ++;
						}else if(40 + (b + 3*a) +
								(weightLet[let1] + weightLet[let2]) == magicWeight){
							//check countMagNum
							//System.out.print("Yes ");
							countMagNum ++;
						}
					}
				}
			}
		}
		for(int a = 0;a < 10;a++){
			for(int let1 = 0;let1 < weightLet.length;let1++){
				for(int let2 = 0;let2 < weightLet.length;let2++){
					if((4*a) + 40 +
							(weightLet[let1] + weightLet[let2]) == magicWeight){
						//check countMagNum
						//System.out.print("a ");
						countMagNum ++;
					}
				}
			}
		}
		System.out.print(countMagNum);
	}
}
//Examples
//Input			Output		Matching Car Numbers
//555			2			CA8999XX, CA9998XX

//512			18			CA5999TX, CA5999XT, CA7799TX,
//							CA7979TX, CA7997TX, CA7799XT,
//							CA7979XT, CA7997XT, CA8888TX,
//							CA8888XT, CA9995TX, CA9977TX,
//							CA9797TX, CA9779TX, CA9995XT,
//							CA9977XT, CA9797XT, CA9779XT

//95			46
