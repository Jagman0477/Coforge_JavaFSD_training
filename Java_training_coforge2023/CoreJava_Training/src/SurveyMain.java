
public class SurveyMain {
	public static void main(String[] args) {
		Survey s = new Survey();
		
		s.setSurveyId(45);
		s.setSurveyName("Swatch Abhyaan");
		s.setSurveyLocation("Greater Noida");
		
		System.out.println("Survey Id = "+s.getSurveyId());
		System.out.println("Survey Name = "+s.getSurveyName());
		System.out.println("Survey Location = "+s.getSurveyLocation());

	}
}
