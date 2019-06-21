package aa.bb.cc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class Testcase1 {
	
	@Test
	public void testSample() {
		int[] a=new int[] {1,2,3,4,5};
		assertEquals(15,getSum(a));
	}
	public static int getSum(int[] a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum += a[i];
		}
		return sum;
	}
}
