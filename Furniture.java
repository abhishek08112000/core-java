class Furniture{

		static int furnitureId;
		static String furnitureShopName ;
		static String furnitureShopAddress;
		static double priceOfFurniture;
		
		static void setFurnitureId(int id){
			furnitureId = id ;
		}
		static int getFurnitureId(){
			return furnitureId ;
		}
		
		static void setFurnitureShopName(String name){
			furnitureShopName = name ;
		}
		static String getFurnitureShopName(){
			return furnitureShopName;
		}
		
		static void setFurnitureShopAddress(String address){
			furnitureShopAddress = address ;
		}
		static String getFurnitureShopAddress(){
			return furnitureShopAddress ;
		}
		
		static void setPriceOfFurniture(double price){
			priceOfFurniture = price ;
		}
		static double getPriceOfFurniture(){
			return priceOfFurniture ;
		}



}