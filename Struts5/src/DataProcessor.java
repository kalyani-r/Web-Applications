// Kalyani Rachakonda
//Data processor class that gives the methods for the mean and standard Deviation calculation

package Struts5;

import java.util.Properties;

public class DataProcessor {
	public DataBean calculateData(String inputData)
	{
		String[] nums=inputData.split(",");
		float sum=0, calcMean=0, vTemp=0;
		double calcSD=0;
		double sdTemp=0;
		double variance=0;
		int dlen=nums.length;
		//Calculation of Mean
		for(int a=0;a<dlen;a++)
		{
			sum+=Float.parseFloat(nums[a]);
		}
		calcMean=sum/dlen;
		//Calculation of Standard Deviation
		for(int a=0;a<dlen;a++)
		{
			vTemp=Float.parseFloat(nums[a])-calcMean;
			variance=Math.pow(vTemp,2);
		}
		sdTemp=variance/dlen;
		calcSD=Math.sqrt(sdTemp);
		DataBean db=new DataBean();
		db.setMean(calcMean);
		db.setStandardDeviation(calcSD);
		return db;
	}
}
