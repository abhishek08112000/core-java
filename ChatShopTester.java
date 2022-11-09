package com.xworkz.chatapp;

import com.xworkz.chatapp.chatshop.ChatShop;

public class ChatShopTester {
	
	
	public static void main(String[] args) {
		
		
		
		
		
//		chat.name = "Bangarpete chats";
//		chat.address = "Rajajinagar";
//		chat.gstNo = "BBHSI123698456";
		
		String staffNames[] = new String[3] ;
		staffNames[0] = "Dolly";
		staffNames[1] = "Chitte";
		staffNames[2] ="Tagaru";
		
		long[] staffContactNo = new long[3] ;
		staffContactNo[0] = 9659845879L;
		staffContactNo[1] = 6954871236L;
		staffContactNo[2] = 8654971259L;
		
		String[] menue = new String[5];
		menue[0] = "Masalpuri";
		menue[1] = "Panipuri";
		menue[2] = "Sevpuri";
		menue[3] = "Fingerchips";
		menue[4] = "Gobi manchori";
		
		String[] billingMethod = new String[3];
		billingMethod[0] = "Phonepay";
		billingMethod[1] = "Paytm";
		billingMethod[2] = "Cash";
		
		
		ChatShop chat = new ChatShop("Bangarpete chats" , "Rajajjinagar","BBHSI123698456", staffNames, staffContactNo,
				menue, billingMethod) ;
		
		
		
		
		
		
		
		
		chat.getInfo();
		
		
		
		
		
		
		
		
		
	}

}
