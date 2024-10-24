package org.encap1;

public class ExecutionClass {
	public static void main(String[] args) {
		EncapsulationClass encap=new EncapsulationClass();
		encap.setCustomerId(123);
		encap.setName("Ram");
		
		int customerId = encap.getCustomerId();
		System.out.println(customerId);
		System.out.println(encap.getName());
	}

}
