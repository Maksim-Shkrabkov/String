package by.htp.string;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		String s0 = "abc";
		String s = new String("abc");
//		s = s + "d";
		String s1 = new String("abc");
		String s2 = "abc";//происходит поиск в пуле литтералов  в "abc" s0=s2, а s1 != s(так как разные обьекты)
		
		s2 = s2 + "def";
		String s3 = s2.replaceAll("a", "z");
		
		StringBuffer sbf;
		
		StringBuilder sb = new StringBuilder("abc");
		
		sb.append("def");
		sb.insert(4,"1");
		
		StringBuilder sb1 = new StringBuilder("abc");
		StringBuilder sb2 = new StringBuilder(s0);
		StringBuilder sb3 = new StringBuilder(s1);
		
		System.out.println("");
		
		
		//Blinov Stroke Task1
		String test = "Littel big boy";
		replace(test, 2);
		
		
		//Blinov Stroke Task2
		replaceEachLetterOnNumber();
		
		//Blinov Stroke Task9
		countTheRepetitionOfWord();
		
		
		System.out.println("");
		
	}
	
	//methods for Task1
	
	public static void replace(String st, int a) {
		
		String[] stmas = st.split(" ");
		String s = "";
		
		for(String part : stmas) {
			
			if(part.length() > a) {
				char a1 = part.charAt(a);
				String df = part.replace(a1, 'd');
				s = s + df + " ";
			}
		}
		
		System.out.println(s);
		
	}
	
	//methods for Task2
	
	public static void replaceEachLetterOnNumber() {
		
		String stroke = printStroke();
		
		char[] charOfStroke = createMassiveOfChar(stroke);
		printChar(charOfStroke);
		printNumberOfCharInAlphabet(charOfStroke);

	}
	
	public static String printStroke() {
		Scanner in = new Scanner(System.in);
		System.out.println("Print stroke: ");
		String stroke = in.nextLine();
		return stroke;
	}

	public static char[] createMassiveOfChar(String st) {
		char[] CharArray = st.toCharArray();
		return CharArray;
	}
	
	public static void printChar(char[] ch) {
		for(char symbol : ch) {
			System.out.print(symbol + "  ");
		}
	}
	
	public static void printNumberOfCharInAlphabet(char[] ch) {
		
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		
		System.out.println("");
		
		for(char symbol : ch) {
			if(symbol == ' ') {
				System.out.print("");
			} else {
				int number = alphabet.lastIndexOf(symbol);
	            number+=1;
	            System.out.print(number + "  ");
			}
		}
	}
	
	
	//methods for Task9
	
	public static void countTheRepetitionOfWord() {
		String stroke = printStroke();
		String word = printWordForCounting();
		countTheQuantityOfRepetitions(stroke, word);
		
	}
	
	public static String printWordForCounting() {
		Scanner in = new Scanner(System.in);
		System.out.println("Print a word to count the quantity of repetitions: ");
		String word = in.next();
		return word;
	}
	
	public static void countTheQuantityOfRepetitions(String st, String wd) {
		
		String delimiter = " ";
		int count = 0;
		String[] stmas = st.split(delimiter);
		
		for(String word : stmas) {
			if(word.equals(wd)) {
				count++;
			}
		}
		
		System.out.println("The quantity of repetitions of word: " + count);
		
	}
	

	
	
	
}
