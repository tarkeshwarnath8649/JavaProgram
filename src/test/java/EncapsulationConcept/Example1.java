package EncapsulationConcept;

 class Example2 {
	
	private int i;
	
	public int getI() {
		return i;
	}
	
	public void setI(int i) {
		this.i = i;
	}

}
 
 public class Example1{
	 public static void main(String[] args) {
		
		 Example2 e1 = new Example2();
		 e1.setI(8);
		 System.out.println(e1.getI());
	}
 }


