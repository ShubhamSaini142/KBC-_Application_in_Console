package Project02;

import java.util.Scanner;

public class Question {
	
	Scanner sc = new Scanner(System.in);
	
	static String ques[] = new String[10];
	static int ans[] = new int[10];
	static String option[][] = new String[10][4];
	
//	function to store the ques and ans
	void quesAnsBank() {
		ques[0] = "Grand Central Terminal, Park Avenue, New York is the world's";
		ans[0] = 1;
		
		ques[1] = "Entomology is the science that studies";
		ans[1] = 2;
		
		ques[2] = "Eritrea, which became the 182nd member of the UN in 1993, is in the continent of";
		ans[2] = 2;
		
		ques[3] = "Garampani sanctuary is located at";
		ans[3] = 2;
		
		ques[4]="Hitler party which came into power in 1933 is known as";
		ans[4]=2;
		
		ques[5]="Fastest shorthand writer was?";
		ans[5]=1;
		
		ques[6]="Exposure to sunlight helps a person improve his health because";
		ans[6]=1;
		
		ques[7]="Which is a reserved word in the Java programming language?";
		ans[7]=2;
		
		ques[8]="Which one is a valid declaration of a boolean?";
		ans[8]=1;
		
		ques[9]="Look at this series: 7, 10, 8, 11, 9, 12, ... What number should come next?";
		ans[9]=2;
	}
	
//	function to store the options
	void optionBank() {
		option[0][0] = "Largest railway station";
		option[0][1] = "Highest railway station";
		option[0][2] = "Longest railway station";
		option[0][3] = "None of the above";
		
		option[1][0] = "Behavior of human beings";
		option[1][1] = "Insects";
		option[1][2] = "The origin and history of technical and scientific terms";
		option[1][3] = "The formation of rocks";

		option[2][0] = "Asia";
		option[2][1] = "Africa";
		option[2][2] = "Europe";
		option[2][3] = "Australia";
		
		option[3][0] = "Junagarh, Gujarat";
		option[3][1] = "Diphu, Assam";
		option[3][2] = "Kohima, Nagaland";
		option[3][3] = "Gangtok, Sikkim";
		
		option[4][0] = "Labour Party";
		option[4][1] = "Nazi Party";
		option[4][2] = "Ku-Klux-Klan";
		option[4][3] = "Democratic Party";
		
		option[5][0] = "DR. G.D. Bist";
		option[5][1] = "J.R.D Tata";
		option[5][2] = "J.M Tagore";
		option[5][3] = "Khudada Khan";
		
		option[6][0] = "the ultraviolet rays convert skin oil into Vitamin D";
		option[6][1] = "the pigment cells in the skin get stimulated and produce a healthy tan";
		option[6][2] = "resistance power increases";
		option[6][3] = "the infrared light kills bacteria in the body";
	
		option[7][0] = "Method";
		option[7][1] = "Native";
		option[7][2] = "Subclasses";
		option[7][3] = "Reference";
		
		option[8][0] = "boolean b3 = false;";
		option[8][1] = "boolean b1 = 0;";
		option[8][2] = "boolean b2 = 'false';";
		option[8][3] = "boolean b4 = Boolean.false();";
	
		
		option[9][0] = "7";
		option[9][1] = "10";
		option[9][2] = "12";
		option[9][3] = "13";
		
	}
}