package MyPractiseJune17.MyPractiseJune17;

public class SumOfPairOfNumbers
{
	
	boolean getSum(int[] inputNumbers, int expectedSumOfPairOfNumbers)
	{
		boolean boolFlag = false;
		
		//for loop to find out sum of pair of number = expected value
		 for(int intMainCounter=0; intMainCounter<inputNumbers.length; intMainCounter++)
		 {
			 for(int intChildCounter=intMainCounter+1; intChildCounter<inputNumbers.length; intChildCounter++)
			 {
				 if(inputNumbers[intMainCounter]+inputNumbers[intChildCounter]==expectedSumOfPairOfNumbers)
				 {
					 boolFlag = true;
					 break;
				 }
			 }
		 }
		
		return boolFlag;
	}

}
