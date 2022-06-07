package AbstractionConcept;

abstract public class Father extends GrandFather{
	
	@Override
	public void house1() {
		System.out.println("House 1 Completed");
	}
	
	abstract public void house2();

}
