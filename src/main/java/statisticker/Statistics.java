package statisticker;

import java.util.List;



public class Statistics 
{
	
    public static Stats getStatistics(List<Float> floatNumbers) {
    	
    	Stats stats = new Stats();
    	float averageValue;
    	float sum = 0;
    	Float minValue = Float.NaN;
    	Float maxValue = Float.NaN;
    	int count = 0;
    	
    	for(Float number: floatNumbers)
    	{
    		if(count == 0)
    		{
    			minValue = number;
    			maxValue = number;
    		}
    		if(number>maxValue)
    		{
    			maxValue = number; 
    		}
    		if(number<minValue)
    		{
    			minValue = number;
    		}
    		sum = sum + number;
    		
			count++;
    	}
    
    	averageValue = sum/count;	
    	stats.average=averageValue;
    	stats.min=minValue;
    	stats.max=maxValue;
       	return stats;
    	
    	
    }
    public static class Stats
    {
    	public float average;
		public float min;
		public float max;
	
    }
}
