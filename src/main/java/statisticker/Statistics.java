package statisticker;

import java.util.Collections;
import java.util.List;

public class Statistics 
{
	public static class Stats{
		public float average, min, max;	
	}
    public static Stats getStatistics(List<Float> numbers) {
    	Stats stats = new Stats ();
    	if(numbers.isEmpty()) {
    		stats.min = Float.NaN;
        	stats.max = Float.NaN;
        	stats.average = Float.NaN;
    	}
    	Collections.sort(numbers);  
    	stats.min = numbers.get(0);
    	stats.max = numbers.get((numbers.size()-1));
    	stats.average = calculateAverage(numbers); 
    	
		return stats;
        //implement the computation of statistics here
    }
    private static int calculateAverage(List <Float> numbers) {
        int sum = 0;
        for (int i=0; i< numbers.size(); i++) {
              sum += i;
        }
        return sum / numbers.size();
    }
}
