package statisticker;

public class StatsChecker {

	private Float maxThreshold;
	private IAlerter[] alerters;
	StatsChecker(Float maxThreshold,IAlerter [] alerters)
	{
		this.maxThreshold = maxThreshold;
		this.alerters = alerters;
	}

	public void checkAndAlert(Float[] nos) {
		
		EmailAlert e = (EmailAlert) alerters[0];
		LEDAlert l = (LEDAlert) alerters[1];
		
		Float max = 0.0f;
		
		for(int i=0;i<nos.length;i++)
		{
			System.out.println(nos[i]);
			if(nos[i]>max)
			{
				max = nos[i];
			}
		}
		if(max>maxThreshold)
		{
			
			e.alert(true);
			l.alert(true);
		}
	}
	
}
