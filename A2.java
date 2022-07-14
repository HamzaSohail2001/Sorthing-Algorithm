public class A2 {

	/**
	 * heapSort method, the most efficient of the four sorting methods
	 * ref: https://www.geeksforgeeks.org/heap-sort/
	 * 
	 * @param myArray is the input (array) to be sorted
	 */
	public static void heapSort(int[] myArray) {
	      int temp;
	      int array_size = myArray.length ;		  
	      int size = array_size-1;
	      for (int i = (array_size / 2); i >= 0; i--) {
	         heapify(myArray, i, size);
	      };
	      for(int i= size; i>=0; i--) {
	         temp = myArray[0];
	         myArray[0] = myArray[size];
	         myArray[size] = temp;
	         size--;
	         heapify(myArray, 0, size);
	      }
	}
	   
	/**
	 * Helper method of the heapSort method
	 * ref: https://www.geeksforgeeks.org/heap-sort/
	 * 
	 * @param myArray 
	 * @param i
	 * @param heapSize 
	 */
	public static void heapify (int [] myArray, int i, int heapSize) {
	      int a = 2*i;
	      int b = 2*i+1;
	      int largestElement;
	      if (a<= heapSize && myArray[a] > myArray[i]) {
	         largestElement = a;
	      } else {
	         largestElement = i;
	      }
	      if (b <= heapSize && myArray[b] > myArray[largestElement]) {
	         largestElement = b;
	      }
	      if (largestElement != i) {
	         int temp = myArray[i];
	         myArray[i] = myArray[largestElement];
	         myArray[largestElement] = temp;
	         heapify(myArray, largestElement, heapSize);
	     }
	}
	
	/**
	 * First shell sort method, using sequence A003462 (((3^k)-1)/2)
	 * ref: https://en.wikipedia.org/wiki/Shellsort
	 * ref: https://www.programiz.com/dsa/shell-sort
	 * 
	 * @param array
	 */
	public static void shellSort1(int[] array) {
	  	  int n = array.length;
	  	  for (int interval = 1; interval < n/3; interval = ((3^n - 1)/2)) {
	  	    for (int i = interval; i < n; i += 1) {
	  	    int temp = array[i];
	  	    int j;
	  	    for (j = i; j >= interval && array[j - interval] > temp; j -= interval) {
	  	      array[j] = array[j - interval];
	  	    }
	  	    array[j] = temp;}}
	  	    
	  	  }
	
	/**
	 * Second shell sort method, using sequence A036562 ((4^k)+(3(2^(k-1))+1))
	 * Somewhat more efficient than shellSort1, typically has faster runtime
	 * 
	 * ref: https://en.wikipedia.org/wiki/Shellsort
	 * ref: https://www.programiz.com/dsa/shell-sort
	 * 
	 * @param array
	 */
	public static void shellSort2(int[] array) {
	    	  int n = array.length;
	    	  for (int interval = 1; interval < n/3; interval=4^(interval) + 3*(2^(interval-1)) + 1) {
	    	    for (int i = interval; i < n; i += 1) {
	    	    int temp = array[i];
	    	    int j;
	    	    for (j = i; j >= interval && array[j - interval] > temp; j -= interval) {
	    	      array[j] = array[j - interval];
	    	    }
	    	    array[j] = temp;
	    	    }
	    	  }
	    	  
	
  	  }

/**
 * 
 * Same main method used in Part2.java, placed here and commented out for back-up
 * Place 'import java.util.Arrays' at beginning of file to construct arrays
 * 
 */
//public static void main(String[] args) {
//		
//		int[] randArrayE = new int[10];
//		int[] randArray1E = new int[10];
//		int[] randArray2E = new int[10];
//		int[] randArray3E = new int[10];
//		for(int i = 0; i < 10; i++){
//		    randArrayE[i] = (int)(Math.random()*10);
//		}
//		for(int i = 0; i < 10; i++){
//		    randArray1E[i] =randArrayE[i] ;
//		    randArray2E[i] =randArrayE[i];
//		    randArray3E[i] =randArrayE[i];    		  
//		}
//		
//		
//		
//		int[] randArrayD = new int[100];
//		int[] randArray1D = new int[100];
//		int[] randArray2D = new int[100];
//		int[] randArray3D = new int[100];
//		for(int i = 0; i < 100; i++){
//		    randArrayD[i] = (int)(Math.random()*100);
//		}
//		for(int i = 0; i < 100; i++){
//		    randArray1D[i] =randArrayD[i] ;
//		    randArray2D[i] =randArrayD[i];
//		    randArray3D[i] =randArrayD[i];    		  
//		}
//		
//		
//		
//		int[] randArray = new int[100000];
//		int[] randArray1 = new int[100000];
//		int[] randArray2 = new int[100000];
//		int[] randArray3 = new int[100000];
//		for(int i = 0; i < 100000; i++){
//		    randArray[i] = (int)(Math.random()*100000);
//		}
//		for(int i = 0; i < 100000; i++){
//		    randArray1[i] =randArray[i] ;
//		    randArray2[i] =randArray[i];
//		    randArray3[i] =randArray[i];    		  
//		}
//		
//		
//		int[] randArrayA = new int[1000];
//		int[] randArray1A = new int[1000];
//		int[] randArray2A = new int[1000];
//		int[] randArray3A = new int[1000];
//		for(int i = 0; i < 1000; i++){
//		    randArrayA[i] = (int)(Math.random()*1000);
//		}
//		for(int i = 0; i < 1000; i++){
//		    randArray1A[i] =randArrayA[i] ;
//		    randArray2A[i] =randArrayA[i];
//		    randArray3A[i] =randArrayA[i];    		  
//		}
//		
//		
//		int[] randArrayB = new int[10000];
//		int[] randArray1B = new int[10000];
//		int[] randArray2B = new int[10000];
//		int[] randArray3B = new int[10000];
//		for(int i = 0; i < 10000; i++){
//		    randArrayB[i] = (int)(Math.random()*10000);
//		}
//		for(int i = 0; i < 10000; i++){
//		    randArray1B[i] =randArrayB[i] ;
//		    randArray2B[i] =randArrayB[i];
//		    randArray3B[i] =randArrayB[i];    		  
//		}
//		
//		
//		int[] randArrayC = new int[1000000];
//		int[] randArray1C = new int[1000000];
//		int[] randArray2C = new int[1000000];
//		int[] randArray3C = new int[1000000];
//		for(int i = 0; i < 1000000; i++){
//		    randArrayC[i] = (int)(Math.random()*1000000);
//		}
//		for(int i = 0; i < 1000000; i++){
//		    randArray1C[i] =randArrayC[i] ;
//		    randArray2C[i] =randArrayC[i];
//		    randArray3C[i] =randArrayC[i];    		  
//		}
//		
//		
//		System.out.println("		heapSort(int)	shellSort1		shellSort2		sort\n");
//		
//		
//		System.out.print("n=" + randArrayE.length + "		");
//		
//		long startTimeE = System.currentTimeMillis();
//		 heapSort(randArrayE);
//		long endTimeE = System.currentTimeMillis();
//		long timeElapsedE = endTimeE - startTimeE;
//		System.out.print(timeElapsedE +" ms" + "		");
//		
//		long startTime1E = System.currentTimeMillis();
//		 shellSort1(randArray1E);
//		long endTime1E = System.currentTimeMillis();
//		long timeElapsed1E = endTime1E - startTime1E;
//		System.out.print(timeElapsed1E +" ms" + "			");
//		
//		long startTime2E = System.currentTimeMillis();
//		 shellSort2(randArray2E);
//		long endTime2E = System.currentTimeMillis();
//		long timeElapsed2E = endTime2E - startTime2E;
//		System.out.print(timeElapsed2E +" ms" + "			");
//		
//		long startTime3E = System.currentTimeMillis();
//		 Arrays.sort(randArray3E);
//		long endTime3E = System.currentTimeMillis();
//		long timeElapsed3E = endTime3E - startTime3E;
//		System.out.println(timeElapsed3E +" ms" + "		");
//		
//		
//		
//		System.out.print("n=" + randArrayD.length + "		");
//
//		long startTimeD = System.currentTimeMillis();
//		 heapSort(randArrayD);
//		long endTimeD = System.currentTimeMillis();
//		long timeElapsedD = endTimeD - startTimeD;
//		System.out.print(timeElapsedD +" ms" + "		");
//
//		
//		long startTime1D = System.currentTimeMillis();
//		 shellSort1(randArray1D);
//		long endTime1D = System.currentTimeMillis();
//		long timeElapsed1D = endTime1D - startTime1D;
//		System.out.print(timeElapsed1D +" ms" + "			");
//		
//		long startTime2D = System.currentTimeMillis();
//		 shellSort2(randArray2D);
//		long endTime2D = System.currentTimeMillis();
//		long timeElapsed2D = endTime2D - startTime2D;
//		System.out.print(timeElapsed2D +" ms" + "			");
//		
//		long startTime3D = System.currentTimeMillis();
//		 Arrays.sort(randArray3D);
//		long endTime3D = System.currentTimeMillis();
//		long timeElapsed3D = endTime3D - startTime3D;
//		System.out.println(timeElapsed3D +" ms" + "		");
//		
//		
//		
//		System.out.print("n=" + randArrayA.length + "		");
//
//		long startTimeA = System.currentTimeMillis();
//		 heapSort(randArrayA);
//		long endTimeA = System.currentTimeMillis();
//		long timeElapsedA = endTimeA - startTimeA;
//		System.out.print(timeElapsedA +" ms" + "		");
//
//		
//		long startTime1A = System.currentTimeMillis();
//		 shellSort1(randArray1A);
//		long endTime1A = System.currentTimeMillis();
//		long timeElapsed1A = endTime1A - startTime1A;
//		System.out.print(timeElapsed1A +" ms" + "			");
//		
//		long startTime2A = System.currentTimeMillis();
//		 shellSort2(randArray2A);
//		long endTime2A = System.currentTimeMillis();
//		long timeElapsed2A = endTime2A - startTime2A;
//		System.out.print(timeElapsed2A +" ms" + "			");
//		
//		long startTime3A = System.currentTimeMillis();
//		 Arrays.sort(randArray3A);
//		long endTime3A = System.currentTimeMillis();
//		long timeElapsed3A = endTime3A - startTime3A;
//		System.out.println(timeElapsed3A +" ms" + "		");
//		
//		
//		
//		
//		System.out.print("n=" + randArrayB.length + "		");
//
//		long startTimeB = System.currentTimeMillis();
//		 heapSort(randArrayB);
//		long endTimeB = System.currentTimeMillis();
//		long timeElapsedB = endTimeB - startTimeB;
//		System.out.print(timeElapsedB +" ms" + "		");
//
//		
//		long startTime1B = System.currentTimeMillis();
//		 shellSort1(randArray1B);
//		long endTime1B = System.currentTimeMillis();
//		long timeElapsed1B = endTime1B - startTime1B;
//		System.out.print(timeElapsed1B +" ms" + "			");
//		
//		long startTime2B = System.currentTimeMillis();
//		 shellSort2(randArray2B);
//		long endTime2B = System.currentTimeMillis();
//		long timeElapsed2B = endTime2B - startTime2B;
//		System.out.print(timeElapsed2B +" ms" + "			");
//		
//		long startTime3B = System.currentTimeMillis();
//		 Arrays.sort(randArray3B);
//		long endTime3B = System.currentTimeMillis();
//		long timeElapsed3B = endTime3B - startTime3B;
//		System.out.println(timeElapsed3B +" ms" + "		");
//		
//		
//		
//		System.out.print("n=" + randArray.length + "	");
//
//		long startTime = System.currentTimeMillis();
//		 heapSort(randArray);
//		long endTime = System.currentTimeMillis();
//		long timeElapsed = endTime - startTime;
//		System.out.print(timeElapsed +" ms" + "		");
//
//		
//		long startTime1 = System.currentTimeMillis();
//		 shellSort1(randArray1);
//		long endTime1 = System.currentTimeMillis();
//		long timeElapsed1 = endTime1 - startTime1;
//		System.out.print(timeElapsed1 +" ms" + "			");
//		
//		long startTime2 = System.currentTimeMillis();
//		 shellSort2(randArray2);
//		long endTime2 = System.currentTimeMillis();
//		long timeElapsed2 = endTime2 - startTime2;
//		System.out.print(timeElapsed2 +" ms" + "			");
//		
//		long startTime3 = System.currentTimeMillis();
//		 Arrays.sort(randArray3);
//		long endTime3 = System.currentTimeMillis();
//		long timeElapsed3 = endTime3 - startTime3;
//		System.out.println(timeElapsed3 +" ms" + "		");
//		
//	}
}