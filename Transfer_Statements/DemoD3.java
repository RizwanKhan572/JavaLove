package com.rizwan.Transfer_Statements;

public class DemoD3 {
	
	//break--> use to come out from loop.
	//continue--> use to skip one iteration.
	//return--> use to come out from method/function.
	
	public static void main(String[] args) {
		//-->break
		
//		for(int i=0; i<10; i++) {
//			
//			
//			if(i==5)
//			break;
//			System.out.println(i);
//		}
		
		//Nested loop
		
//		for(int i=0; i<10; i++) {
//			
//			for(int j=0; j<10; j++) {
//				
//				if(j==5)
//					break;
//				System.out.println(i+"--"+j);
//			}
//		}
		
		//-->continue
		
		for(int i=0; i<10; i++) {
			
			if(i==3)
				continue;
			System.out.println(i);
		}
		
		int month=1;
		switch(month) {
		case 1:
		System.out.println("January");
		break;
		}
	}

}
