package in.javahome.myweb.controller;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest extends TestCase {
	Calculator cal = new Calculator();
	public void testAdd(){
		Assert.assertEquals(cal.add(10, 20), 30);
	}
	public void testMultiply(){
		Assert.assertEquals(cal.multiply(10, 20), 200);
	}
}
