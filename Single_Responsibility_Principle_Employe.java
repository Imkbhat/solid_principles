package com.luv2code.SingleResponsibilityPrinciple;

public class Single_Responsibility_Principle_Employee {

	private String name;
	private String Id;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	
	//Main concept here is to move calculateTax() and save() method to a different class file, like, EmployeeRepo.
	// so if any changes in database for save method, no need to compile Employee class, 
	//only Repo related changes are enough to compiled.
	//here Employee class performs the Single responsibility by providing getters and setters.
	
	public int calculateTax() {
		return 0;
	}
	
	public boolean save() {
		return true;
	}
	

}
