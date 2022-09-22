class Mobile{

		static String brand ;
		static String colour;
		static double price;
		static boolean isConnected;
		static int minVolume;
		static int maxVolume = 8;
		static int currentVolume ;
		
		
		public static boolean onOrOff(){
			System.out.println("inside onOrOff");
		if(isConnected == false){
					isConnected = true ;
			System.out.println("Mobile is turned on..");
		}
		else if(isConnected == true){
			isConnected = false ;
			System.out.println("Mobile is turned off..");
		}
		
		System.out.println("end of onOrOff");
		return isConnected ;
		}
		public static void increaseVolume(){
			System.out.println("inside increaseVolume");
			//false==false
			if (isConnected == true){
				if(currentVolume < maxVolume){
					currentVolume = currentVolume + 1 ;
					System.out.println("The Current Volume is "+ currentVolume);
				}
				else{
					System.out.println("Max Volume Reached...");
				}
				System.out.println("end of increaseVolume");
			}
			else{
				System.out.println("First turn on the Speaker");
			}
			
		}
		
		public static void decreaseVolume(){
			System.out.println("inside decreaseVolume");
			if(isConnected == true){
				if(currentVolume > minVolume){
					currentVolume = currentVolume - 1 ;
					System.out.println("The Current Volume is "+ currentVolume);
				}
				else{
					System.out.println("min Volume Reached");
				}
				System.out.println("end of decreaseVolume");
			}
			else{
				System.out.println("First turn on the Speaker");
			}
		}


}