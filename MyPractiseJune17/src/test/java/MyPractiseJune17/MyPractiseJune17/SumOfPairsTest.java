package MyPractiseJune17.MyPractiseJune17;

import junit.framework.TestCase;

public class SumOfPairsTest extends TestCase {

	public void testGetSum() {
		SumOfPairOfNumbers objSPON = new SumOfPairOfNumbers();
		if(!objSPON.getSum(new int[]{2,3,4,5},9))
		{
			fail();
		}
	}

}
