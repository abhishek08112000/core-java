class TeaStallTester{


		public static void main(String teaStall[]){
		
		TeaStall.setTeaStallId(1256);
		System.out.println(TeaStall.getTeaStallId());
		
		TeaStall.setName("Engineer ban gaya chay wala");
		System.out.println(TeaStall.getName());
		
		TeaStall.setAddress("Malleshwaram");
		System.out.println("Address of the tea stall is "+ TeaStall.getAddress());
		
		TeaStall.setContactNo(8909089080L);
		System.out.println(TeaStall.getContactNo());
		
		System.out.println(TeaStall.getTeaStallId()+" \n "+ TeaStall.getName() +" \n "+ TeaStall.getAddress() +" \n "+ TeaStall.getContactNo());
		
		
		
		
		}



}