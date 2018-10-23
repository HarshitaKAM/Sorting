package test.java;
import org.junit.Test;
import main.java.*;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Objects;

import org.junit.Test;

import main.java.Item;
import main.java.SortAlgos;
import main.java.SortDemoData;

public class AlgosTest {
	SortDemoData inputData= new SortDemoData();
	SortDemoData sortedList= new SortDemoData();
	
	
	@Test(expected=NullPointerException.class)
	
	//for node and edge coverage
	public void nullBubbleSort()
	{
		Item[] n= null;
		SortAlgos.bubbleSort(n);
	}
	
	//for node, condition and edge coverage
	@Test 
	public void testCase2BubbleSort() {
		
		inputData.initializeArray("-10 9 3 -8 11 1");
		sortedList.initializeArray("-10 -8 1 3 9 11");
		inputData.runAlgo(0);
		assertTrue(inputData.myArray.length == sortedList.myArray.length);
		assertTrue(inputData.myArray[0].key == sortedList.myArray[0].key);
		assertTrue(inputData.myArray[1].key == sortedList.myArray[1].key);
		assertTrue(inputData.myArray[2].key == sortedList.myArray[2].key);
		assertTrue(inputData.myArray[3].key == sortedList.myArray[3].key);
		assertTrue(inputData.myArray[4].key == sortedList.myArray[4].key);
		assertTrue(inputData.myArray[5].key == sortedList.myArray[5].key);
		
	}
	
	//for node and edge coverage
	@Test(expected=NullPointerException.class)
	public void nullSelectionSort()
	{
		Item[] n= null;
		SortAlgos.selectionSort(n);
	}
	
	//for node, condition and edge coverage
	
	@Test 
	public void testCase2SelectionSort() {
		
		inputData.initializeArray("-10 9 3 -8 11 1");
		sortedList.initializeArray("-10 -8 1 3 9 11");
		inputData.runAlgo(1);
		assertTrue(inputData.myArray[0].key == sortedList.myArray[0].key);
		assertTrue(inputData.myArray[1].key == sortedList.myArray[1].key);
		assertTrue(inputData.myArray[2].key == sortedList.myArray[2].key);
		assertTrue(inputData.myArray[3].key == sortedList.myArray[3].key);
		assertTrue(inputData.myArray[4].key == sortedList.myArray[4].key);
		assertTrue(inputData.myArray[5].key == sortedList.myArray[5].key);
		assertTrue(inputData.myArray.length == sortedList.myArray.length);
		
	}
	//for node and edge coverage
	
	@Test(expected=NullPointerException.class)
	public void nullInsertionSort()
	{
		Item[] n= null;
		SortAlgos.insertionSort(n);
	}
	
	//for node, condition and edge coverage
	
	@Test 
	public void testCase2InsertionSort() {
		
		inputData.initializeArray("-100 90 320 -8 11 1");
		sortedList.initializeArray("-100 -8 1 11 90 320");
		inputData.runAlgo(2);
		assertTrue(inputData.myArray.length == sortedList.myArray.length);
		assertTrue(inputData.myArray[0].key == sortedList.myArray[0].key);
		assertTrue(inputData.myArray[1].key == sortedList.myArray[1].key);
		assertTrue(inputData.myArray[2].key == sortedList.myArray[2].key);
		assertTrue(inputData.myArray[3].key == sortedList.myArray[3].key);
		assertTrue(inputData.myArray[4].key == sortedList.myArray[4].key);
		assertTrue(inputData.myArray[5].key == sortedList.myArray[5].key);
		
	}
	//for node and edge coverage
	
	@Test(expected=NullPointerException.class)
	public void nullMergeSort()
	{
		Item[] n= null;
		SortAlgos.mergeSort(n);
	}
	
	//for node, condition and edge coverage
	
	@Test 
	public void testCase2MergeSort() {
		
		inputData.initializeArray("-100 90 320 -8 11 1");
		sortedList.initializeArray("-100 -8 1 11 90 320");
		inputData.runAlgo(3);
		assertTrue(inputData.myArray.length == sortedList.myArray.length);
		assertTrue(inputData.myArray[0].key == sortedList.myArray[0].key);
		assertTrue(inputData.myArray[1].key == sortedList.myArray[1].key);
		assertTrue(inputData.myArray[2].key == sortedList.myArray[2].key);
		assertTrue(inputData.myArray[3].key == sortedList.myArray[3].key);
		assertTrue(inputData.myArray[4].key == sortedList.myArray[4].key);
		assertTrue(inputData.myArray[5].key == sortedList.myArray[5].key);
		
	}
	
	//for node and edge coverage
	
	@Test(expected=NullPointerException.class)
	public void nullQuickSort()
	{
		Item[] n= null;
		SortAlgos.quickSort(n);
	}
	
	//for node, condition and edge coverage
	
	@Test 
	public void testCase2QuickSort() {
		
		inputData.initializeArray("-100 90 320 -8 11 1");
		sortedList.initializeArray("-100 -8 1 11 90 320");
		inputData.runAlgo(4);
		assertTrue(inputData.myArray.length == sortedList.myArray.length);
		assertTrue(inputData.myArray[0].key == sortedList.myArray[0].key);
		assertTrue(inputData.myArray[1].key == sortedList.myArray[1].key);
		assertTrue(inputData.myArray[2].key == sortedList.myArray[2].key);
		assertTrue(inputData.myArray[3].key == sortedList.myArray[3].key);
		assertTrue(inputData.myArray[4].key == sortedList.myArray[4].key);
		assertTrue(inputData.myArray[5].key == sortedList.myArray[5].key);
		
	}
	
	//for node and edge coverage
	
	@Test(expected=NullPointerException.class)
	public void nullHeapSort()
	{
		Item[] n= null;
		SortAlgos.heapSort(n);
	}
	
	//for node, condition and edge coverage
	
	@Test 
	public void testCase2HeapSort() {
		
		inputData.initializeArray("-100 90 320 -8 11 1");
		sortedList.initializeArray("-100 -8 1 11 90 320");
		inputData.runAlgo(5);
		assertTrue(inputData.myArray.length == sortedList.myArray.length);
		assertTrue(inputData.myArray[0].key == sortedList.myArray[0].key);
		assertTrue(inputData.myArray[1].key == sortedList.myArray[1].key);
		assertTrue(inputData.myArray[2].key == sortedList.myArray[2].key);
		assertTrue(inputData.myArray[3].key == sortedList.myArray[3].key);
		assertTrue(inputData.myArray[4].key == sortedList.myArray[4].key);
		assertTrue(inputData.myArray[5].key == sortedList.myArray[5].key);
		
	}
	

	//for node, condition and edge coverage
	@Test 
	public void testCase2DefaultSort() {
		
		inputData.initializeArray("-100 90 320 -8 11 1");
		sortedList.initializeArray("-100 -8 1 11 90 320");
		inputData.runAlgo(10);
		assertTrue(inputData.myArray.length == sortedList.myArray.length);
		assertTrue(inputData.myArray[0].key == sortedList.myArray[0].key);
		assertTrue(inputData.myArray[1].key == sortedList.myArray[1].key);
		assertTrue(inputData.myArray[2].key == sortedList.myArray[2].key);
		assertTrue(inputData.myArray[3].key == sortedList.myArray[3].key);
		assertTrue(inputData.myArray[4].key == sortedList.myArray[4].key);
		assertTrue(inputData.myArray[5].key == sortedList.myArray[5].key);
		
	}
	
	
	
	
	

}
