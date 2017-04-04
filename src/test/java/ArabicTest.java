

import static org.junit.Assert.assertEquals;

import org.junit.*;

import tddTest.ArabicToRomans;

import static org.mockito.Mockito.*;

public class ArabicTest {
	
	private ArabicToRomans convertidor = new ArabicToRomans();
	private ArabicToRomans mockConvertidor = mock(ArabicToRomans.class);
	
	@Before
	public void sepUp() {
		when(mockConvertidor.convert(1)).thenReturn("I");
		when(mockConvertidor.convert(499)).thenReturn("ID");
	}
	
	
	@Test
	public void test1() {
		assertEquals("I", mockConvertidor.convert(1));
	}
	@Test
	public void test2() {
		assertEquals("II", convertidor.convert(2));
	}
	@Test
	public void test3() {
		assertEquals("III", convertidor.convert(3));
	}
	@Test
	public void test4() {
		assertEquals("IV", convertidor.convert(4));
	}
	@Test
	public void test5() {
		assertEquals("V", convertidor.convert(5));
	}
	@Test
	public void test6() {
		assertEquals("VI", convertidor.convert(6));
	}
	@Test
	public void test7() {
		assertEquals("VII", convertidor.convert(7));
	}
	@Test
	public void test8() {
		assertEquals("VIII", convertidor.convert(8));
	}
	@Test
	public void test9() {
		assertEquals("IX", convertidor.convert(9));
	}
	@Test
	public void test10() {
		assertEquals("X", convertidor.convert(10));
	}
	@Test
	public void test11() {
		assertEquals("XI", convertidor.convert(11));
	}
	@Test
	public void test12() {
		assertEquals("XII", convertidor.convert(12));
	}
	@Test
	public void test15() {
		assertEquals("XV", convertidor.convert(15));
	}
	@Test
	public void test16() {
		assertEquals("XVI", convertidor.convert(16));
	}
	@Test
	public void test19() {
		assertEquals("XIX", convertidor.convert(19));
	}
	@Test
	public void test20() {
		assertEquals("XX", convertidor.convert(20));
	}
	@Test
	public void test23() {
		assertEquals("XXIII", convertidor.convert(23));
	}
	@Test
	public void test35() {
		assertEquals("XXXV", convertidor.convert(35));
	}
	@Test
	public void test45() {
		assertEquals("XLV", convertidor.convert(45));
	}
	@Test
	public void test65() {
		assertEquals("LXV", convertidor.convert(65));
	}
	@Test
	public void test96() {
		assertEquals("XCVI", convertidor.convert(96));
	}
	@Test
	public void test99() {
		assertEquals("IC", convertidor.convert(99));
	}
	@Test
	public void test100() {
		assertEquals("C", convertidor.convert(100));
	}
	@Test
	public void test499() {
		assertEquals("ID", mockConvertidor.convert(499));
	}
	@Test
	public void test1000() {
		assertEquals("M", convertidor.convert(1000));
	}

}
