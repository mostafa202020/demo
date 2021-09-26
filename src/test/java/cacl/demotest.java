package cacl;

import static org.junit.Assert.*;

import org.junit.Test;

public class demotest {

	@Test
	public void test() {
		calc u=new calc();
		assertEquals(7,u.add(3,4) );
	}

}
