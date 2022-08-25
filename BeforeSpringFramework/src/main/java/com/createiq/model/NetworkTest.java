package com.createiq.model;

public class NetworkTest {
	public static void main(String[] args) {

//		Network airtel = new AirtelNetwork(); //tightly coupled
//		airtel.callRates();
//		airtel.sms();
//		airtel.dataPlans();
//		
//		Network jio = new JioNetwork();
//		jio.callRates();

		CreateIQContainer container = new CreateIQContainer();
		Network network = (Network) container.getNetwork("network");
		network.sms();
		network.callRates();
		network.dataPlans();

	}

}
