package quizapps;

public class Result implements IResult{
	int totalQuestions;
	int correctAnswers;
	int wrongAnswers;
	
	
	public Result(int totalQuestions, int correctAnswers, int wrongAnswers) {
		super();
		this.totalQuestions = totalQuestions;
		this.correctAnswers = correctAnswers;
		this.wrongAnswers = wrongAnswers;
	}
	
	public void showResult() {
		System.out.println("\nYour Result ");
		System.out.println("Total Questions: " + totalQuestions);
		System.out.println("Correct Answers: " + correctAnswers);
		System.out.println("Wrong Answers: " + wrongAnswers);
		System.out.println("Percentage: " + showPercentage( correctAnswers,  totalQuestions));
		System.out.println("Overall Performance: " +  showPerformance(showPercentage( correctAnswers,  totalQuestions)));
		//double per = showPercentage( correctAnswers,  totalQuestions);
		//System.out.println("Overall Performance: " +  showPerformance(per) );
	
	}

	@Override
	public double showPercentage(int correctAnswers, int totalQuestions) {
		return ((double)correctAnswers/totalQuestions)*100;
	}

	@Override
	public String showPerformance(double percentage) {
		String performance =   " ";
		
		if(percentage > 60) {
			System.out.println("GOOD ");
			
		}else if(percentage < 40) {
			System.out.println("POOR ");
		
		}else {
			System.out.println("AVERAGE ");
		}
			
		return performance;
	}
}
