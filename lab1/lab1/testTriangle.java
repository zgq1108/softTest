package lab1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class testTriangle {

//	@Before
//	public void setUp() throws Exception {
//	}
//
//	@After
//	public void tearDown() throws Exception {
//	}
	 private static Triangle tri = new Triangle();
	@Test
	public void testEqual() {
		    assertEquals("Equal",tri.Name(tri.whichTri(5, 5, 5)));
		   assertEquals("Equal",tri.Name(tri.whichTri(-1, -1, -1)));
	}
	@Test
	public void testIsos() {
		  assertEquals("Isos",tri.Name(tri.whichTri(5, 6, 5)));
		 assertEquals("Isos",tri.Name(tri.whichTri(-1, -2, -3)));
	}
	@Test
	public void testScal(){
		assertEquals("Scal",tri.Name(tri.whichTri(5, 6, 7)));
		assertEquals("Scal",tri.Name(tri.whichTri(6, 6, 6)));
	}
	@Test
	public void testNotTri(){
		assertEquals("NoTri",tri.Name(tri.whichTri(0, 0, 0)));
		assertEquals("NoTri",tri.Name(tri.whichTri(1, -1, 1)));
		
	}

}
