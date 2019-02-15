package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import service.DateDifferenceProvider;
import service.support.MyDate;

public class JunitTest {
	
	DateDifferenceProvider dp;
	
	@Before
	public void init()
	{
		dp=new DateDifferenceProvider();
	}

	@Test
	public void testDateDifferenceProvider() {
		long daysdifference=dp.getDateDifference(new MyDate(06,04,2011),new MyDate(06,04,2011));
		Assert.assertEquals(daysdifference,0 );	
	}
		
	@Test
	public void testDateDifferenceProvider1() {
		long daysdifference=dp.getDateDifference(new MyDate(06,04,2011),new MyDate(18,04,2011));
		Assert.assertEquals(daysdifference,12 );	
	}
	@Test
	public void testDateDifferenceProvider2() {
		long daysdifference=dp.getDateDifference(new MyDate(06,04,2011),new MyDate(18,05,2011));
		Assert.assertEquals(daysdifference,42 );	
	}
	@Test
	public void testDateDifferenceProvider3() {
		@SuppressWarnings("static-access")
		long daysdifference=dp.getDateDifference(new MyDate(06,04,2011),new MyDate(18,06,2011));
		Assert.assertEquals(daysdifference,73 );	
	}
	@Test
	public void testDateDifferenceProvider4() {
		long daysdifference=dp.getDateDifference(new MyDate(06,04,2011),new MyDate(18,12,2011));
		Assert.assertEquals(daysdifference,256 );	
	}
	@Test
	public void testDateDifferenceProvider5() {
		long daysdifference=dp.getDateDifference(new MyDate(06,04,2011),new MyDate(18,12,2012));
		Assert.assertEquals(daysdifference,622 );	
	}
	@Test
	public void testDateDifferenceProvider6() {
		long daysdifference=dp.getDateDifference(new MyDate(06,04,2011),new MyDate(18,12,2013));
		Assert.assertEquals(daysdifference,987 );	
	}
	@Test
	public void testDateDifferenceProvider7() {
		long daysdifference=dp.getDateDifference(new MyDate(06,04,2011),new MyDate(18,12,2113));
		Assert.assertEquals(daysdifference,37511);	
	}
	@Test
	public void testDateDifferenceProvider8() {
		long daysdifference=dp.getDateDifference(new MyDate(06,04,2011),new MyDate(18,12,2413));
		Assert.assertEquals(daysdifference,147084 );	
	}
	@Test
	public void testDateDifferenceProvider9() {
		long daysdifference=dp.getDateDifference(new MyDate(06,04,2011),new MyDate(18,12,2813));
		Assert.assertEquals(daysdifference,293181 );	
	}
	@Test
	public void testDateDifferenceProvider10() {
		long daysdifference=dp.getDateDifference(new MyDate(06,01,2011),new MyDate(06,03,2011));
		Assert.assertEquals(daysdifference,59 );	
	}
	@Test
	public void testDateDifferenceProvider11() {
		long daysdifference=dp.getDateDifference(new MyDate(06,01,2012),new MyDate(06,03,2012));
		Assert.assertEquals(daysdifference,60 );	
	}
	@Test
	public void testDateDifferenceProvider12() {
		long daysdifference=dp.getDateDifference(new MyDate(06,02,2012),new MyDate(06,03,2012));
		Assert.assertEquals(daysdifference,29 );	
	}
	@Test
	public void testDateDifferenceProvider13() {
		long daysdifference=dp.getDateDifference(new MyDate(22,01,2012),new MyDate(15,11,2012));
		Assert.assertEquals(daysdifference,298 );	
	}
	@Test
	public void testDateDifferenceProvider14() {
		long daysdifference=dp.getDateDifference(new MyDate(06,02,2012),new MyDate(06,12,2012));
		Assert.assertEquals(daysdifference,304);	
	}
	

}
