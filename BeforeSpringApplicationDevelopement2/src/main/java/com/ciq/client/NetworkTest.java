package com.ciq.client;

import com.ciq.model.AirtelNetwork;
import com.ciq.model.CiqContainer;
import com.ciq.model.Network;

public class NetworkTest {

	public static void main(String[] args) {
		// tight coupling
		AirtelNetwork airtel = new AirtelNetwork();
		airtel.calls();
		airtel.sms();
		airtel.data();
		// loose coupling
		CiqContainer container = new CiqContainer();
		Network network = (Network) container.getContainer("network");
		network.calls();
		network.sms();
		network.data();

	}

}
