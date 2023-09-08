
final public class Formula {

	float speed(float s1, float s2) {
		
		return s1+s2;
		
	}
	
	float accelaration(float s1, float s2, float time) {
		
		return (s2-s1)/time;
		
	}
	
}


//This class can't be inherited as Formula is final
//class MyFormula extends Formula{

//	@Override
//	float speed(float s1, float s2) {
//		
//		return s1+s2;
//		
//	}
//	
//	@Override
//	float accelaration(float s1, float s2, float time) {
//		
//		return (s2-s1)/time;
//		
//	}

//}
