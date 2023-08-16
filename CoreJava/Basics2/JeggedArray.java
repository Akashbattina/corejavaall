package Basics2;

public class JeggedArray {

	public static void main(String[] args) {
		int arr[][] = new int[6][]; 
	       
	       arr[0] = new int[]{99,100,101};
	       arr[1] = new int[]{199,200};
	       arr[2] = new int[]{299,300,301,302,303};
	       arr[3]=new int[]{2,3};
	       arr[4]=new int[] {6,89,90,45};
	       arr[5]=new int[] {88,33,55};
	        System.out.println("Elements of  Jagged Array");
	        for (int i = 0; i < arr.length; i++) {//rows
	            for (int j = 0; j < arr[i].length; j++)//coloumn
	                System.out.print(arr[i][j] + " ");
	            System.out.println();//next line purpose
	}

	}
	
}
