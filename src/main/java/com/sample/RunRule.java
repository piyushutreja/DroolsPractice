package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class RunRule {
	
	public static void main (String args [])
	{
		try {
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			KieSession kSession = kContainer.newKieSession("ksession-rules");	
			Trade trade = new Trade();
			trade.setUser("piyush");	
			kSession.insert(trade);
			kSession.fireAllRules();
			
			System.out.println(trade.getSecurity());
		
		} catch (Exception e) {
			e.printStackTrace();		}
	
	}
	
}

