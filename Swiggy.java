class Swiggy{

		public static void takeOrder(){
			String item = "Pastries" ;
			if(item == "Pizza"){
			System.out.println("Thank You for ordering "+ item);
			}
			if(item == "SandWitch"){
				System.out.println("Thank You for ordering "+ item);
			}
			if(item == "Burger"){
				System.out.println("Thank You for ordering "+ item);
			}
			if(item == "SouthIndian"){
				System.out.println("Thank You for ordering "+ item);
			}
			if(item == "Pastries"){
				System.out.println("Thank You for ordering "+ item);
			}
			
			return  ;
		
		}
	
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




}