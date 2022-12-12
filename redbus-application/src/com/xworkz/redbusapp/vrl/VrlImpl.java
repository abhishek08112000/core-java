package com.xworkz.redbusapp.vrl;

import com.xworkz.redbusapp.contract.RedBusContract;

public class VrlImpl implements RedBusContract{

	@Override
	public boolean conditionbOfBus() {
		
		return true;
	}

	@Override
	public int minBookings() {
		
		return 23;  
	}

}
