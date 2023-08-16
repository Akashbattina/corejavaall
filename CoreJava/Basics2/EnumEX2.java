package Basics2;

public class EnumEX2 {
	public enum EnumExample {
		Winter(0),Summer(1), Monsoon(2);
		private int index;
		
		private EnumExample(int index) {			
			this.index=index;
		}
		public static void main(String[] args) {
			System.out.println(EnumExample.Monsoon.index);
			

	
		}

	}

}
