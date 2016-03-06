package MainPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest extends Triangle{

	protected double side1, side2, side3;
	
	@Test
	public void test() {
		Triangle test = new Triangle(3,3,3);
		double output = test.getPerimeter();
		assertEquals(9, output, 0);
		
		output = test.getArea();
		assertEquals(3.8971, output, 0.001);
	}

}
