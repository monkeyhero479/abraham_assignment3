package abraham_problem1;

import java.util.Random;
import java.util.Scanner;
import java.security.SecureRandom;
public class CAI1 {
public static void main(String[] args) {
	quiz();
	
}
	public static void quiz(){
		int q=1;
		int answer=askQuestion();
		while(q==1){
		
		isAnswerCorrect(answer);
		}
	}
public static int askQuestion(){
	int num1,num2;
	SecureRandom random=new SecureRandom();
	num1=random.nextInt(9);
	num2=random.nextInt(9);
	int answer=num1*num2;
	System.out.println("What is the product of "+num1+" and "+num2+"?\n");
	return answer;
}
public static int readResponse() {
	Scanner input=new Scanner(System.in);
	int response=input.nextInt();
	System.out.println(response);
	return response;
}
public static void isAnswerCorrect(int x) {
	int i;
	int response=readResponse();
	if(response==x) {
		displayCorrectResponse();
	}else {
		displayIncorrectResponse();
		
	}
	
}
public static void displayCorrectResponse() {
	System.out.println("Very good!");
}
public static void displayIncorrectResponse() {
	System.out.println("No. Please try again.");
}

}