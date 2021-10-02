import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import java.util.Random;



public class ArraysTesting {
	
	@Before
	public void setUp() throws Exception {
		//ArrayDeletion.display(null);
	}

	@Test
	public void testDeletionSuccess1() {
		
		int [] array = {1,6,34,0,2,43};
		int idx=4;
		int [] arr=ArrayDeletion.delete(array, idx);
		int [] a= {1,6,34,0,43};
		
		for(int i=0; i<5; i++) {
			
			assertEquals(a[i], arr[i]);		 
			
		}
			
	}
	
	@Test
	public void testDeletionSuccess2() {
		
		int [] array = {1,7,39,10,12,143,0,5};
		int idx=4;
		int [] arr=ArrayDeletion.delete(array, idx);
		int [] a= {1,7,39,10,143,0,5};
		
		for(int i=0; i<7; i++) {
			
			assertEquals(a[i], arr[i]);		 
			
		}
			
	}
	
	@Test
	public void testDeletionSuccess3() {
		
		int [] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int idx=2;
		int [] arr=ArrayDeletion.delete(array, idx);
		int [] a={1,2,4,5,6,7,8,9,10,11,12,13,14,15};
		
		for(int i=0; i<14; i++) {
			
			assertEquals(a[i], arr[i]);		 
			
		}
			
	}
	
	/*
	public void testDeletionFailure() {
		
		int [] array = {1,6,34,0,2,43};
		int idx=10;
		int [] arr=ArrayDeletion.delete(array, idx);
		int [] a= {1,6,34,0,43};
		
		for(int i=0; i<6; i++) {
			
			assertEquals(arr[i], a[i]);
			
		}
			
	}*/
	
	@Test
	public void testInsertionSuccess1() {
		
		int [] array = {1,2,3,4,5};
		int n=7,idx=2;
		int [] arr = ArrayInsertion.insert(array, n, idx);
		
			assertEquals(n, arr[idx]);		 
	
	
	}	
	
	@Test
	public void testInsertionSuccess2() {
		
		int [] array = {1,2,3,4,5,6,7,8,9,10};
		int n=9,idx=5;
		int [] arr = ArrayInsertion.insert(array, n, idx);
		
			assertEquals(n, arr[idx]);		
	
	}
	
	@Test
	public void testInsertionSuccess3() {
		
		int [] array = {1,-6,34,0,-2,43};
		int n=9,idx=4;
		int [] arr = ArrayInsertion.insert(array, n, idx);
		
		assertEquals(n, arr[idx]);		
	}
	
	
	@Test
	public void testInsertSuccess1(){
		
		Array array = new Array(); //create an array
		for(int i=0;i<5;i++)
			array.insert(i, i);
		
		assertEquals(3, array.array[3]);		 
	}
	
	@Test
	public void testInsertSuccess2(){
		
		Array array = new Array(); //create an array
		for(int i=0;i<10;i++)
			array.insert(i, i);
		
		assertEquals(7, array.array[7]);
	}
	
	@Test
	public void testInsertSuccess3(){
		
		Array array = new Array(); //create an array
		for(int i=0;i<50;i++)
			array.insert(i, i);
		
		assertEquals(34, array.array[34]);		 
	}
	
	@Test
	public void testDeleteSuccess1(){
		
		Array array = new Array(); //create an array
		for(int i=0;i<10;i++)
			array.insert(i, i);
		
		array.delete(2);
		
		for(int i=0;i<9;i++)
			assertNotEquals(2,array.array[i]);
	}
	
	@Test
	public void testDeleteSuccess2(){
		
		Array array = new Array(); //create an array
		for(int i=0;i<5;i++)
			array.insert(i, i);
		
		array.delete(3);
		
		for(int i=0;i<4;i++)
			assertNotEquals(3,array.array[i]);
	}
	
	@Test
	public void testDeleteSuccess3(){
		
		Array array = new Array(); //create an array
		for(int i=0;i<50;i++)
			array.insert(i, i);
		
		array.delete(44);
		
		for(int i=0;i<49;i++)
			assertNotEquals(44,array.array[44]);
	}
	
	@Test
	public void testDeleteSuccess4(){
		
		Array array = new Array(); //create an array
		for(int i=0;i<35;i++)
			array.insert(i, i);
		
		array.delete(29);
		
		for(int i=0;i<34;i++)
			assertNotEquals(29,array.array[29]);
	}
	
	
	@Test
	public void testLinearSearchSuccess1(){
		
		Array array = new Array(); //create an array
		for(int i=0;i<5;i++)
			array.insert(i, i);
		
		assertTrue(array.linearSearch(2));
	}
	
	@Test
	public void testLinearSearchSuccess2(){
		
		Array array = new Array(); //create an array
		for(int i=0;i<10;i++)
			array.insert(i, i);
		
		assertTrue(array.linearSearch(9));
	}
	
	
	@Test
	public void testLinearSearchSuccess3(){
		
		Array array = new Array(); //create an array
		for(int i=0;i<40;i++)
			array.insert(i, i);
		
		assertTrue(array.linearSearch(39));
	}
	
	@Test
	public void testBinarySearchSuccess1(){
		
		Array array = new Array(); //create an array
		for(int i=0;i<10;i++)
			array.insert(i, i);
		
		assertTrue(array.binarySearch(4, 0, 9));
	}
	
	@Test
	public void testBinarySearchSuccess2(){
		
		Array array = new Array(); //create an array
		for(int i=0;i<5;i++)
			array.insert(i, i);
		
		assertTrue(array.binarySearch(2, 0, 4));
	}
	
	@Test
	public void testBinarySearchSuccess3(){
		
		Array array = new Array(); //create an array
		for(int i=0;i<50;i++)
			array.insert(i, i);
		
		assertTrue(array.binarySearch(31, 0, 49));
	}
	
	@Test
	public void testBubbleSortSuccess1(){
		
		Array array = new Array(); //create an array
		Array arr = new Array(); //create an array
		Random rd = new Random(); 
		
		for(int i=0;i<5;i++) {
			array.insert(rd.nextInt(),i );
			arr.insert(rd.nextInt(),i);
		}
		
		array.bubbleSort();
		
		assertNotEquals(array, arr);
		
	}
	
	@Test
	public void testBubbleSortSuccess2(){
		
		Array array = new Array(); //create an array
		Array arr = new Array(); //create an array
		Random rd = new Random(); 
		
		for(int i=0;i<10;i++) {
			array.insert(rd.nextInt(),i );
			arr.insert(rd.nextInt(),i);
		}
		
		array.bubbleSort();
		
		assertNotEquals(array, arr);
		
	}
		
		@Test
		public void testBubbleSortSuccess3(){
			
			Array array = new Array(); //create an array
			Array arr = new Array(); //create an array
			Random rd = new Random(); 
			
			for(int i=0;i<50;i++) {
				array.insert(rd.nextInt(),i );
				arr.insert(rd.nextInt(),i);
			}
			
			array.bubbleSort();
			
			assertNotEquals(array, arr);	
		
	}
	
}
