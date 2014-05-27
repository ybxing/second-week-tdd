package hasNEqualSides;

import org.junit.Test;

import exam.hasNEqualSides;
import exam.hasNEqualSides2;
import static org.junit.Assert.*;

public class hasNEqualSides2test {

	@Test
	public void volidTriangleShouldHavePoistiveSide() {
		double b1[]={2,4,5,6};
		double b2[]={-2,4,5,6};
		double b3[]={2,-4,5,6};
		double b4[]={2,4,-5,6};
		double b5[]={2,4,5,-6};
		assertTrue(new hasNEqualSides(b1,4).isValid());
		assertFalse(new hasNEqualSides(b2,4).isValid());
		assertFalse(new hasNEqualSides(b3,4).isValid());
		assertFalse(new hasNEqualSides(b4,4).isValid());
		assertFalse(new hasNEqualSides(b5,4).isValid());
	}
	@Test
	public void  volidTriangleShouldHaveSTGTDS() {
		assertFalse(new hasNEqualSides2(2,4,7,100).isValid());
		assertFalse(new hasNEqualSides2(2,4,6,12).isValid());
		assertTrue(new hasNEqualSides2(2,4,5,3).isValid());
		assertFalse(new hasNEqualSides2(8,2,4,1).isValid());
		assertFalse(new hasNEqualSides2(7,2,4,1).isValid());
		assertTrue(new hasNEqualSides2(5,2,4,1).isValid());
		assertFalse(new hasNEqualSides2(4,8,2,1).isValid());
		assertFalse(new hasNEqualSides2(4,7,2,1).isValid());
		assertTrue(new hasNEqualSides2(4,5,2,3).isValid());
		assertTrue(new hasNEqualSides2(4,2,8,1).isValid());
		assertFalse(new hasNEqualSides2(4,2,7,1).isValid());
		assertTrue(new hasNEqualSides2(4,5,2,3).isValid());
		
	}

}
