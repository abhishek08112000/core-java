class Swiggy{

		
	
		public static double takeOrder(String item){
			
			if(item == "Pizza"){
			System.out.println("Thank You for ordering "+ item);
			return 99.00 ;
			}
			if(item == "SandWitch"){
				System.out.println("Thank You for ordering "+ item);
				return 75.00 ;
			}
			if(item == "Burger"){
				System.out.println("Thank You for ordering "+ item);
				return 65.00 ;
			}
			if(item == "SouthIndian"){
				System.out.println("Thank You for ordering "+ item);
				return 135.00 ;
			}
			if(item == "Mosranna"){
				System.out.println("Thank You for ordering "+ item);
				return 25.00 ;
			}
			if(item == "Pastries"){
				System.out.println("Thank You for ordering "+ item);
				return 45.00 ;
			}
			
			return 0.0;
			
		
		}
	
		public static double takeOrder(String item , double price){
			
			if(item == "Pizza"){
			System.out.println("Thank You for ordering "+ item + " The price is "+ price);
			return 99.00 ;
			}
			if(item == "SandWitch"){
				System.out.println("Thank You for ordering "+ item+ " The price is "+ price);
				return 75.00 ;
			}
			if(item == "Burger"){
				System.out.println("Thank You for ordering "+ item + " The price is "+ price);
				return 65.00 ;
			}
			if(item == "SouthIndian"){
				System.out.println("Thank You for ordering "+ item + " The price is "+ price);
				return 135.00 ;
			}
			if(item == "Mosranna"){
				System.out.println("Thank You for ordering "+ item + " The price is "+ price);
				return 25.00 ;
			}
			if(item == "Pastries"){
				System.out.println("Thank You for ordering "+ item + " The price is "+ price);
				return 45.00 ;
			}
			
			return 0.0;
		
		}


//putmeintouch66
}