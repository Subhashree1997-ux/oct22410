package org.encap1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ExecutionClass1 {
	public static void main(String[] args) {
		EncapsulationClass encap=new EncapsulationClass();
		encap.setCustomerId(123);
		encap.setName("Ravi");
		EncapsulationClass encap1=new EncapsulationClass();
		encap1.setCustomerId(321);
		encap1.setName("Ram");
		EncapsulationClass encap2=new EncapsulationClass();
		encap2.setCustomerId(456);
		encap2.setName("Raju");
		EncapsulationClass encap3=new EncapsulationClass();
		encap3.setCustomerId(121);
		encap3.setName("test");
		
		System.out.println("User Defined List");
		System.out.println("====================");
		
		List<EncapsulationClass> li=new ArrayList<>();
		li.add(encap);
		li.add(encap1);
		li.add(encap2);
		li.add(encap3);
		
		for(int i=0;i<li.size();i++) {
			EncapsulationClass s = li.get(i);
			System.out.println(s.getCustomerId());
			System.out.println(s.getName());
		}
		
		System.out.println();
		System.out.println("User Defined Set");
		System.out.println("====================");
		
		Set<EncapsulationClass> si=new LinkedHashSet<>();
		si.addAll(li);
		for(EncapsulationClass s:si) {
			System.out.println(s.getCustomerId());
			System.out.println(s.getName());
		}
		
		
	}

}
