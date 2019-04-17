package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class isWellsortedTest {

	@Test
	void test() {
		tasks test= new tasks();
		// 24 PERMUTATIONS TO TEST THE MAXIMUM CASES
		// ACCEPTED LISTS
		String[] sequence1= { "A" , "B", "C", "D" };
		String[] sequence2= { "B" , "A", "C", "D" };
		// REJECTED LISTS
		String[] sequence3= { "A" , "B", "D", "C" };
		String[] sequence4= { "A" , "C", "B", "D" };
		String[] sequence5= { "A" , "C", "D", "B" };
		String[] sequence6= { "A" , "D", "B", "C" };
		String[] sequence7= { "A" , "D", "C", "B" };
		String[] sequence8= { "B" , "A", "D", "C" };
		String[] sequence9= { "B" , "C", "A", "D" };
		String[] sequence10= { "B" , "C", "D", "A" };
		String[] sequence11= { "B" , "D", "A", "C" };
		String[] sequence12= { "B" , "D", "C", "A" };
		String[] sequence13= { "C" , "A", "B", "D" };
		String[] sequence14= { "C" , "A", "D", "B" };
		String[] sequence15= { "C" , "B", "D", "A" };
		String[] sequence16= { "C" , "B", "A", "D" };
		String[] sequence17= { "C" , "D", "C", "A" };
		String[] sequence18= { "C" , "D", "A", "C" };
		String[] sequence19= { "D" , "A", "B", "C" };
		String[] sequence20= { "D" , "A", "C", "B" };
		String[] sequence21= { "D" , "B", "A", "C" };
		String[] sequence22= { "D" , "C", "A", "B" };
		String[] sequence23= { "D" , "B", "C", "A" };
		String[] sequence24= { "D" , "C", "B", "A" };
		
		//THE EXPECTED RETURN VALUE
		boolean expectedValue1=true;
		boolean expectedValue2=false;
		//THE REAL RETURNED VALUE
		boolean value= test.isWellSorted(sequence1);
		assertEquals(value,expectedValue1);
		value= test.isWellSorted(sequence2);
		assertEquals(value,expectedValue1);
        value= test.isWellSorted(sequence3);
		assertEquals(value,expectedValue2);
		value= test.isWellSorted(sequence4);
		assertEquals(value,expectedValue2);
		value= test.isWellSorted(sequence5);
		assertEquals(value,expectedValue2);
		value= test.isWellSorted(sequence6);
		assertEquals(value,expectedValue2);
		value= test.isWellSorted(sequence7);
		assertEquals(value,expectedValue2);
		value= test.isWellSorted(sequence8);
		assertEquals(value,expectedValue2);
		value= test.isWellSorted(sequence9);
		assertEquals(value,expectedValue2);
		value= test.isWellSorted(sequence10);
		assertEquals(value,expectedValue2);
		value= test.isWellSorted(sequence11);
		assertEquals(value,expectedValue2);
		value= test.isWellSorted(sequence12);
		assertEquals(value,expectedValue2);
		value= test.isWellSorted(sequence13);
		assertEquals(value,expectedValue2);
		value= test.isWellSorted(sequence14);
		assertEquals(value,expectedValue2);
		value= test.isWellSorted(sequence15);
		assertEquals(value,expectedValue2);
		value= test.isWellSorted(sequence16);
		assertEquals(value,expectedValue2);
		value= test.isWellSorted(sequence17);
		assertEquals(value,expectedValue2);
		value= test.isWellSorted(sequence18);
		assertEquals(value,expectedValue2);
		value= test.isWellSorted(sequence19);
		assertEquals(value,expectedValue2);
		value= test.isWellSorted(sequence20);
		assertEquals(value,expectedValue2);
		value= test.isWellSorted(sequence21);
		assertEquals(value,expectedValue2);
		value= test.isWellSorted(sequence22);
		assertEquals(value,expectedValue2);
		value= test.isWellSorted(sequence23);
		assertEquals(value,expectedValue2);
		value= test.isWellSorted(sequence24);
		assertEquals(value,expectedValue2);
		
	}

}
