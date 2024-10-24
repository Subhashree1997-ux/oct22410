package org.encap1;

public class EncapsulationClass {
	private String name;
	private int customerId;
	
	public String getName() {
		return "Thanks for using my bank";
	}
	public void setName(String name) {
		if(customerId==1 && name.equals("Ravi")) {
			this.name="Ravi Account Authorized";
		}else if(customerId==1 && name.equals("Ram")){
			this.name="Ram Account Authorized";
		}else if(customerId==1 && name.equals("Raju")){
			this.name="Raju Account Authorized";
		}else {
			this.name="Invalid Account";
		}
	}
	public int getCustomerId() {
		if(name.equals("Ravi Account Authorized")) {
			return 10000;
		}else if(name.equals("Ram Account Authorized")) {
			return 20000;
		}else if(name.equals("Raju Account Authorized")) {
			return 30000;
		}else {
			return 0;
		}
	}
	public void setCustomerId(int customerId) {
		if(customerId==123) {
			this.customerId=1;
		}else if(customerId==321) {
			this.customerId=1;
		}else if(customerId==456) {
			this.customerId=1;
		}else {
			this.customerId=0;
		}
	}
	
	

}
