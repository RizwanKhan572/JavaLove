package Static_Non_Static_Members;

public class DemoD4 {
	
	//** Example for creating an object of a class and accessing non-static variables and method.
	
	//instance variable
//		int i=100;
//		
//		//static or class variable
//		static  int j =200;
//		
//		//non-static
	void fun1() {
//		
			System.out.println("inside fun1 of DemoD4");
//			//10000
	}
//		
//		static void fun2() {
//			System.out.println("inside fun2 of DemoD4");
//			
//		}
//		
//
//		public static void main(String[] args) {
//			 
//			//local variable
//			//int x= 10;
//			
//			//System.out.println(j);
//			
//			System.out.println("inside main");
//			
//			//creating object of a class
//			//instantiating a class
//			DemoD4 d1 = new DemoD4(); 
//			
//			System.out.println(d1);
//			
//			System.out.println(d1.i);
//			
//			d1.fun1();
//			
//			//fun1();
//			
//			//fun2();
//			 
//			 
//		}

	//** Example for changing value in a object of a non-static variable in heap area of RAM.
	 // and referring that same object with another variable by creating another object.
	
	
	//instance variable
		
	//** Example for Garbage Collector and NullPointerException.
	
	
	//int i=100;
	
	//static or class variable
	//static  int j =200;
	
	//non-static
	//void fun1() {

	//System.out.println("inside fun1 of DemoD4");
	//10000
 //}
	//static void fun2() {
		
  // System.out.println("inside fun2 of DemoD4");
		
	//}
	
	public static void main(String[] args) {
		
    //DemoD4 d1 = new DemoD4();//here d1 is a reference variable, d1 is pointing to the Demo class obj.
		
	//	d1.i=100;
	
	//	DemoD4 d2 = d1;
		
	//	d1= null;
		
	//	System.out.println(d2.i);//100
		
		//where as object if reassigned to diff variables then all variables will points to the  s
		//same copy.
		
      /*DemoD4 d1 = new DemoD4();
		
		DemoD4 d2 = d1;
		
		System.out.println(d1.i); //0
		System.out.println(d2.i); //0
		
		d1.i=500;
		
		System.out.println(d1.i); //500
		System.out.println(d2.i); //500
		*/
		
       /*DemoD4 d1 = new DemoD4();
		
		DemoD4 d2 = d1;
		
		System.out.println(d1.i); //0
		System.out.println(d2.i); //0
		
		d2.i=500;
		
		System.out.println(d1.i); //500
		System.out.println(d2.i); //500*/
		
		//another approach of calling a method	
		new  DemoD4().fun1();
		

		
		
	}
}
