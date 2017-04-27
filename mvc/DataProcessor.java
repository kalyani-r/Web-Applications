package kalyani;

public class DataProcessor {
	public double sdcalculation(String data_entered, float mean){
    	String data_calc[] = data_entered.split(",");
    	double sum=0;
    	double st_deviation = 0;
		for(int i=0; i< data_calc.length; i++){
    		sum = Math.pow((Integer.parseInt(data_calc[i]) - mean), 2); 
    	}
		st_deviation =  Math.sqrt(sum/(data_calc.length));
    	return st_deviation;
    }

 public float Mean_Calc(String data_entered){
	String data_calc[] = data_entered.split(",");
	float mean = 0;
	for(int i=0; i< data_calc.length; i++)
		mean =mean+ Integer.parseInt(data_calc[i]);
	 mean = mean/ data_calc.length;
	return mean;
}
}
