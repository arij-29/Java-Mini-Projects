
package quizapps;

import java.util.Scanner;

public class Quiz {
	void begin() {
		Question q1 = new Question("Which is a valid Keyword in Java?", "Interface", "Inherit", "Unsigned", "Derive", new Answer("Interface"));
		Question q2 = new Question("Where does the object gets created in Memory?", "Stack", "Queue", "Heap", "None of the above", new Answer("Heap"));
		Question q3 = new Question("Which method is used to prevent method from getting overidden?", "Extends", "Final", "Static", "Implements", new Answer("Final"));
		Question q4 = new Question("For what purpose is the this() constructor call is used?", "To invoke the parent class constructor", "To invoke a child class constructor", "To invoke Base Class constructor", "None of the above", new Answer("To invoke the parent class constructor"));
		
		Question questionArr[] = {q1, q2,  q3, q4};
		int countTotal = 0;
		int countCorrect = 0;
		int countWrong = 0;
		
		for(Question q : questionArr) {
			System.out.println(q.getQuestion());
			System.out.println("A : " + q.getOption1());
			System.out.println("B : " + q.getOption2());
			System.out.println("C : " + q.getOption3());
			System.out.println("D : " + q.getOption4());
			System.out.println("ENTER AN OPTION");
			
			
			@SuppressWarnings("resource")
			Scanner s = new Scanner(System.in);
			char option = s.next().charAt(0);
			String answer = "";
			
			
			switch(option) {
			
				case 'A':
					answer = q.getOption1();
					break;
					
				case 'B':
					answer = q.getOption2();
					break;
					
				case 'C':
					answer = q.getOption3();
					break;
					
				case 'D':
					answer = q.getOption4();	
					break;
					
				default:
					break;
				
			}
			
			
			if(answer.equals(q.answer.getAnswer())) {
				System.out.println("------------------------------------------");
				System.out.println("CORRECT ANS");
				System.out.println("------------------------------------------");
				countCorrect++;
				
			}else {
				System.out.println("------------------------------------------");
				System.out.println("WRONG ANS");
				System.out.println("------------------------------------------");
				countWrong++;
			}
			
			System.out.println("======================================================");
			countTotal++;
			
		}
		
		
		//Since the interface ref can point to the obj which implements the interface ,Good pratice
		IResult res = new Result(countTotal, countCorrect, countWrong);
		res.showResult();
	}
}
