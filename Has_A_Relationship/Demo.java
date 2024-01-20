package Has_A_Relationship;


//inside a class, as a instance member if we define any other class object then
//it is called as a Has-A relationship.

//we can create another class object inside another class and access its instance variableH
//this is called Has_A_relationship.

  
public class Demo {
	
	 int x= 100;
	 
	 A a1= new A();  //--> we can make instance variable of another's class variable and we can access its members.
	
	public static void main(String[] args) {
		
		A a1=new A();
		
		Demo d1=new Demo();
		
	  System.out.println(a1.i);
	  
	  System.out.println(d1.a1.i);
	}

}
