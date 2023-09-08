// Abstract classes

abstract public class Instrument {

	abstract void play();
	
}

class Piano extends Instrument {
	
	@Override
	void play() {
		System.out.println("Piano is playing tan tan tan.");
	}
	
}

class Flute extends Instrument {
	
	@Override
	void play() {
		System.out.println("Piano is playing toot toot toot.");
	}
	
}

class Guitar extends Instrument {
	
	@Override
	void play() {
		System.out.println("Piano is playing tin tin tin.");
	}
	
}