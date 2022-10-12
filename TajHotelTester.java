class TajHotelTester{

	public static void main(String a[]){
	
	
	TajHotel taj = new TajHotel();
	taj.signatureDish = "Paneer Tikka Masala" ;
	taj.tastyDish = "Paneer Chilli" ;
	taj.mostLikedDish = "Aloo Paratha" ;
	taj.location = "Rajajinagar" ;
	
	taj.hotel();
	System.out.println("signatureDish is "+ taj.signatureDish + "\n" +"tastyDish is "+ taj.tastyDish + "\n" +"mostLikedDish is "+ taj.mostLikedDish + "\n" +"Location is "+ taj.location);
	
	
	TajHotel taj1 = new TajHotel();
	taj1.signatureDish = "Paneer Butter Masala" ;
	taj1.tastyDish = "Malai Koftha" ;
	taj1.mostLikedDish = "Butter Nan" ;
	taj1.location = "MG Road" ;
	
	taj1.hotel();
	System.out.println("signatureDish is "+ taj1.signatureDish + "\n" +"tastyDish is "+ taj1.tastyDish + "\n" +"mostLikedDish is "+ taj1.mostLikedDish + "\n" +"Location is "+ taj1.location);
	
	
	TajHotel taja = new TajHotel();
	taja.signatureDish = "Chicken Hydrabadi" ;
	taja.tastyDish = "Chicken Lollypop" ;
	taja.mostLikedDish = "Tandoori Rooti" ;
	taja.location = "Mejestic" ;
	
	taj.hotel();
	System.out.println("signatureDish is "+ taja.signatureDish + "\n" +"tastyDish is "+ taja.tastyDish + "\n" +"mostLikedDish is "+ taja.mostLikedDish + "\n" +"Location is "+ taja.location);
	
	
	
	
	}




}