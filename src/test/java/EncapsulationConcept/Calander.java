package EncapsulationConcept;

class SetterGetter{
	private int monthNo;
	
	public int getMonthNo() {
		return monthNo;
	}
	
	public void setMonthNo(int monthNo) {
		if(monthNo >0 && monthNo <=12) {
			this.monthNo = monthNo;
		}
		else {
			System.out.println("Not a valid Month");
		}
	}
}

public class Calander {
	
	public static void main(String[] args) {
		SetterGetter s1 = new SetterGetter();
		s1.setMonthNo(13);
		System.out.println(s1.getMonthNo());
	}
	
	

}
