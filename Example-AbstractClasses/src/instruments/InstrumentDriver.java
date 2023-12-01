package instruments;

public class InstrumentDriver {

	public static void main(String[] args) {

		//Instrument i = new  Instrument("Violin"); DOESN'T WORK
		
		/*Instrument eg = new  ElectricGuitar(12);
		eg.play();
		
		Instrument v = new Violin();
		v.play();
		
		Instrument p = new Piano();
		p.play();*/
		
		Instrument[] theTrio = new Instrument[3];
		theTrio[0] = new ElectricGuitar(12);
		theTrio[1] = new Violin();
		theTrio[2] = new Piano();
		
		for(int i = 0; i < 3; i++)
		{
			theTrio[i].play();
		}
		

	}

}
