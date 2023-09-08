
public class InstrumentMain {

	public static void main(String[] args) {
		
		Instrument i1[] = new Instrument[10];
		
		i1[0] = new Flute();
		i1[1] = new Piano();
		i1[2] = new Guitar();
		i1[3] = new Flute();
		i1[4] = new Piano();
		i1[5] = new Guitar();
		i1[6] = new Flute();
		i1[7] = new Piano();
		i1[8] = new Guitar();
		i1[9] = new Flute();
		
		for(Instrument i: i1) {
			i.play();
		}
		
	}
	
}
