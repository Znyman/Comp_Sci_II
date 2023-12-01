import java.io.Serializable;

public class LicensePlate implements Serializable {
	
	private String state, plateNumber;
	
	public LicensePlate(String initialState, String initialPlateNumber)
	{
		state = initialState;
		plateNumber = initialPlateNumber;
	}
	public String toString()
	{
		return state + ":" + plateNumber;
	}
	
	
	
	
}
