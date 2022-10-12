class SunnGlassesTester{

	public static void main(String a[]){
	
	
	SunnGlasses sun = new SunnGlasses();
	sun.brandName = "fastrack" ;
	sun.shape = "Rectangle" ;
	sun.color = "Black" ;
	
	sun.getGlasses();
	System.out.println("SunnGlasses brand is "+ sun.brandName + "\n" + "shape of the glasses is "+ sun.shape + "\n" + "Color of the sunglass is "+ sun.color);
	
	
	SunnGlasses son = new SunnGlasses();
	son.brandName = "Lenskart" ;
	son.shape = "Oval" ;
	son.color = "Light blue" ;
	
	son.getGlasses();
	System.out.println("SunnGlasses brand is "+ son.brandName + "\n" + "shape of the glasses is "+ son.shape + "\n" + "Color of the sunglass is "+ son.color);
	
	
	SunnGlasses son1 = new SunnGlasses();
	son1.brandName = "Ray bon" ;
	son1.shape = "Cat eye" ;
	son1.color = "Green" ;
	
	son1.getGlasses();
	System.out.println("SunnGlasses brand is "+ son1.brandName + "\n" + "shape of the glasses is "+ son1.shape + "\n" + "Color of the sunglass is "+ son1.color);
	
	
	SunnGlasses son2 = new SunnGlasses();
	son2.brandName = "Lenskart" ;
	son2.shape = "Rectangle" ;
	son2.color = "Light blue" ;
	
	son2.getGlasses();
	System.out.println("SunnGlasses brand is "+ son2.brandName + "\n" + "shape of the glasses is "+ son2.shape + "\n" + "Color of the sunglass is "+ son2.color);
	
	
	
	
	
	}


}